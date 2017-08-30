/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ice
 */
public class Janela extends JFrame{
    private final JLabel lblNome = new JLabel("Nome");
    private final JLabel lblNumero = new JLabel("Idade");
    private final JTextField txtNome = new JTextField("", 5);
    private final JTextField txtNumero = new JTextField("", 5);
    private final JButton btnExcluir = new JButton("Excluir");
    private final JList lstLista = new JList(new DefaultListModel());
    public Janela() throws HeadlessException {
        super("Janela");
        setLayout(new BorderLayout(5,5));
        JPanel pnlDeFora = new JPanel(new BorderLayout(5,5));
        JPanel pnlNome = new JPanel(new BorderLayout(0,0));
        JPanel pnlIdade = new JPanel(new BorderLayout(0,0));
        
        pnlNome.add(lblNome, BorderLayout.NORTH);
        pnlNome.add(txtNome, BorderLayout.SOUTH);
        
        pnlIdade.add(lblNumero, BorderLayout.NORTH);
        pnlIdade.add(txtNumero, BorderLayout.SOUTH);
        
        pnlDeFora.add(pnlNome,BorderLayout.WEST);
        pnlDeFora.add(pnlIdade, BorderLayout.CENTER);
        
        add(pnlDeFora, BorderLayout.NORTH);
        
        add(btnExcluir, BorderLayout.SOUTH);
        add(new JScrollPane(lstLista), BorderLayout.CENTER);
        lstLista.setVisibleRowCount(10);
        DefaultListModel modelo = (DefaultListModel) lstLista.getModel();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(txtNome.getText());
        pessoa.setIdade(Integer.parseInt(txtNumero.getText()));
        lstLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        txtNumero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.addElement(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                
            }
        });
        btnExcluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for(Object o: lstLista.getSelectedValuesList()){
                    System.out.println(o);
                    modelo.removeElement(o);
                }
            }
        });

    }
   
     
    
}
