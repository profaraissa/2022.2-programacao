/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPOSITORY;

import MODELS.RemedioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raiss
 */
public class RemedioRepository {

    Connection conexao;

    public RemedioRepository() {
    }

    public Boolean createMedicamento(RemedioModel medicamento) {
        Boolean retorno = false;

        try {
            String sql = "insert into remedio (nome,  dosagem) values (?,?)";

            conexao = new Conexao().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, medicamento.getNome());
            statement.setString(2, medicamento.getDosagem());

            statement.execute();
            statement.close();

            new Conexao().fecharBD(conexao);
            retorno = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi cadastrar medicamento !");
            Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public ArrayList<RemedioModel> readAllMedicamentos() {

        ArrayList<RemedioModel> remedios = new ArrayList<>();

        String sql = "select * from remedio";
        conexao = new Conexao().conectaBD();

        try {
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                RemedioModel remedio = new RemedioModel();

                remedio.setCodigo(rs.getInt("codigo"));
                remedio.setNome(rs.getString("nome"));
                remedio.setDosagem(rs.getString("dosagem"));

                remedios.add(remedio);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados");
            Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return remedios;

    }

    public RemedioModel readMedicamento(RemedioModel remedio) {

        String sql = "select * from remedio where codigo = (?) limit 1";
        conexao = new Conexao().conectaBD();

        try {
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setInt(1, remedio.getCodigo());

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                remedio = new RemedioModel();

                remedio.setCodigo(rs.getInt("codigo"));
                remedio.setNome(rs.getString("nome"));
                remedio.setDosagem(rs.getString("dosagem"));
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados");
            Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return remedio;
    }

    public Boolean updateMedicamento(RemedioModel medicamento) {

        Boolean retorno = false;
        try {
            String sql = "update remedio  "
                    + "set  "
                    + "	nome = ? , "
                    + "	dosagem = ? "
                    + "where  "
                    + "codigo = ?";

            conexao = new Conexao().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, medicamento.getNome());
            statement.setString(2, medicamento.getDosagem());
            statement.setInt(3, medicamento.getCodigo());

            statement.execute();
            statement.close();

            new Conexao().fecharBD(conexao);

            retorno = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizar medicamento !");
            Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Boolean deleteMedicamento(RemedioModel medicamento) {
        Boolean retorno = false;
        try {
            String sql = "delete from remedio where codigo = ?";
            conexao = new Conexao().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setInt(1, medicamento.getCodigo());

            statement.execute();
            statement.close();

            new Conexao().fecharBD(conexao);

            retorno = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi deletar medicamento !");
            Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;

    }

    public ArrayList<RemedioModel> readMedicamentosPorNome(String texto) {
        ArrayList<RemedioModel> remedios = new ArrayList<>();

        if (texto.equals("") || texto.isEmpty() || texto == null) {
            return remedios;
        } else {
            String sql = "select * from remedio where nome like concat('%',?,'%')";
            conexao = new Conexao().conectaBD();

            try {
                PreparedStatement statement = conexao.prepareStatement(sql);
                statement.setString(1, texto);

                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    RemedioModel remedio = new RemedioModel();

                    remedio.setCodigo(rs.getInt("codigo"));
                    remedio.setNome(rs.getString("nome"));
                    remedio.setDosagem(rs.getString("dosagem"));

                    remedios.add(remedio);
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados");
                Logger.getLogger(RemedioRepository.class.getName()).log(Level.SEVERE, null, ex);
            }

            return remedios;

        }

    }
}
