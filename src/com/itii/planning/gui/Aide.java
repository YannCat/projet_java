package com.itii.planning.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
 
public class Aide extends JDialog{
 
	private static final long serialVersionUID = 1L;
 
	public Aide(){
		setVisible(true);
		setTitle("Aide");
		setLocationRelativeTo(null);
		setSize(500,100);
		setResizable(false);
		setContentPane(buildContentPane());
	}
 
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		JLabel label = new JLabel("Pour tout besoin d'aide, veuillez contactez M.Graoudi.");
		panel.add(label);
		
		return panel;
	}
}