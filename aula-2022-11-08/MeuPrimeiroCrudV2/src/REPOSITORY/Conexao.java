/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author raiss
 */
public class Conexao {

    public Connection conectaBD() {
        Connection conexao = null;
        try {

            String url
                    = "jdbc:mysql://localhost:3306/farmacia?serverTimezone=UTC";
            String usuario = "root";
            String senha = "12345678";
            conexao = DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possival conectar com o banco de dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }

    public void fecharBD(Connection conexao) {
        try {
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possival fechar conexao com o banco de dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
