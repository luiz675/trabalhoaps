package apresentacao;

import negocio.Medicamento;
import persistencia.ControlaMedicamento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal extends JFrame {
    private JTextField TMedicamento;
    private JTextField TPrincipioAtivo;
    private JTextField TDataFabricacao;
    private JTextField TDataValidade;
    private JTextField TMedicamentoControlado;
    private JTextField TMedicamentoLiquidoOuComprimido;
    private JButton mostrarTudoButton;
    private JButton btmLimpar;
    private JButton btmSalvar;
    private JButton btmMostrarTabela;
    private JPanel MainPanel;
    private JButton button1;

    ControlaMedicamento cm = new ControlaMedicamento();

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public  void limparCampos(){
        TMedicamento.setText("");
        TDataFabricacao.setText("");
        TPrincipioAtivo.setText("");
        TDataValidade.setText("");
        TMedicamentoControlado.setText("");
        TMedicamentoLiquidoOuComprimido.setText("");
    }
    public  Principal(){
        setContentPane(MainPanel);
        setTitle("Cadastro de medicamento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 400);
        btmSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((!"".equals(TMedicamento.getText())) && (!"".equals(TPrincipioAtivo.getText()))
                        && (!"".equals(TDataFabricacao.getText()))
                        && (!"".equals(TDataValidade.getText()))
                        && (!"".equals(TMedicamentoControlado.getText()))
                        && (!"".equals(TMedicamentoLiquidoOuComprimido.getText()))){
                    Medicamento medicamento = new Medicamento();

                    int id = Medicamento.getProximoIdMedicamento();
                    medicamento.setId(id);

                    medicamento.setNome(TMedicamento.getText());
                    medicamento.setPrincipioAtivo(TPrincipioAtivo.getText());
                    medicamento.setDataFabricacao(LocalDate.parse(TDataFabricacao.getText(), formatter));
                    medicamento.setDataValidade(LocalDate.parse(TDataValidade.getText(),formatter));
                    medicamento.setMedicamentoControlado(TMedicamentoControlado.getText());
                    medicamento.setMedicamentoLiquidoOuComprimido(TMedicamentoLiquidoOuComprimido.getText());

                    if (cm.addMedicamento(medicamento)){
                        JOptionPane.showConfirmDialog(null,"Medicamento cadastrado com sucesso");
                        limparCampos();

                    }else {
                        JOptionPane.showMessageDialog(null, "erro ao cadastrar");
                        limparCampos();

                    }

                }else {
                    JOptionPane.showMessageDialog(null,"Prechimento Obrigatorio");
                    limparCampos();
                }

            }
        });
        btmLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
        mostrarTudoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlMostrarTudo dlg = new dlMostrarTudo(cm);
                dlg.setVisible(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DLMostrarMedicamentos dlg = new DLMostrarMedicamentos(cm);
                dlg.setVisible(true);

            }
        });
    }
}
