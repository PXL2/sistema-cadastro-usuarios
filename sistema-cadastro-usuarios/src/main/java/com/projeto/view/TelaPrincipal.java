package com.projeto.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        setTitle("Cadastro de Usuários");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(new JLabel("Bem-vindo ao Sistema de Cadastro"));
        panel.add(new JButton("Cadastrar Usuário"));
        panel.add(new JButton("Listar Usuários"));
        panel.add(new JButton("Sair"));

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal());
    }
}