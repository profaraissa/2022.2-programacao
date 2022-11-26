/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICES;

import MODELS.RemedioModel;
import REPOSITORY.RemedioRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raiss
 */
public class RemedioService {

    public RemedioService() {
    }

    public void cadastrarRemedio(String nome, String dosagem) {
        RemedioModel remedio = new RemedioModel(nome, dosagem);

        RemedioRepository repository = new RemedioRepository();

        if (repository.createMedicamento(remedio)) {
            JOptionPane.showMessageDialog(null, "Remedio Cadastrado com sucesso");
        }

    }

    public DefaultTableModel carregarRemedios() {
        DefaultTableModel model = new DefaultTableModel(0, 3);

        model.setColumnIdentifiers(new Object[]{"Codigo", "Nome", "Dosagem"});;

        RemedioRepository repository = new RemedioRepository();

        ArrayList<RemedioModel> remedios = repository.readAllMedicamentos();

        remedios.forEach(remedio -> {

            model.addRow(new Object[]{
                remedio.getCodigo(),
                remedio.getNome(),
                remedio.getDosagem()
            }
            );
        });
        return model;
    }

    public void atualizarRemedio(String nome, String dosagem, RemedioModel remedioSelecionado) {

        if (!nome.equals(remedioSelecionado.getNome())) {
            remedioSelecionado.setNome(nome);
        }

        if (!nome.equals(remedioSelecionado.getDosagem())) {
            remedioSelecionado.setDosagem(dosagem);
        }
        RemedioRepository repository = new RemedioRepository();

        if (repository.updateMedicamento(remedioSelecionado)) {
            JOptionPane.showMessageDialog(null, "Remedio Alterado com sucesso");
        }


    }

    public void deletarRemedio(RemedioModel remedio) {
        RemedioRepository repository = new RemedioRepository();

        if (repository.deleteMedicamento(remedio)) {
            JOptionPane.showMessageDialog(null, "Remedio deletado com sucesso");
        }
    }

    public DefaultTableModel pesquisar(String texto) {
        DefaultTableModel model = new DefaultTableModel(0, 3);

        model.setColumnIdentifiers(new Object[]{"Codigo", "Nome", "Dosagem"});;

        RemedioRepository repository = new RemedioRepository();

        ArrayList<RemedioModel> remedios = repository.readMedicamentosPorNome(texto);

        remedios.forEach(remedio -> {

            model.addRow(new Object[]{
                remedio.getCodigo(),
                remedio.getNome(),
                remedio.getDosagem()
            }
            );
        });
        return model;
    }

}
