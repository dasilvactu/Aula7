/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class Janela extends JFrame{
    private final JLabel lblNumero = new JLabel("Número");
    private final JTextField txtNumero = new JTextField("0", 20);
    private final JButton btnExcluir = new JButton("Excluir");
    private final JList lstLista = new JList(new DefaultListModel());
    public Janela() throws HeadlessException {
        super("Janela");
        setLayout(new BorderLayout(5,5));
        JPanel pnlEntrada = new JPanel(new BorderLayout(5,5));
        
        pnlEntrada.add(lblNumero, BorderLayout.WEST);
        pnlEntrada.add(txtNumero, BorderLayout.CENTER);
        add(pnlEntrada, BorderLayout.NORTH);
        add(btnExcluir, BorderLayout.SOUTH);
        add(new JScrollPane(lstLista), BorderLayout.CENTER);
        lstLista.setVisibleRowCount(10);


    }
   
     
    
}
