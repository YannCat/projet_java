package com.itii.planning.gui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SelecAction extends JPanel
{
	private static final long serialVersionUID = 1L;

	
	JLabel spaceup = new JLabel(" "); 
	JButton Creer = new JButton("Creer");
	JButton Editer = new JButton("Editer");
	JButton Marquer = new JButton("Marquer");
	JButton Dupliquer = new JButton("Dupliquer");
	JButton Supprimer = new JButton("Supprimer");
	JLabel space = new JLabel(" "); 
	JLabel space1 = new JLabel(" "); 
	JLabel space2 = new JLabel(" "); 
	String format = "dd/MM/yyyy"; 
	java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
	java.util.Date date = new java.util.Date(); 
	JLabel dateJour = new JLabel(formater.format(date)); 
	
	public SelecAction() 
	{
		setBackground(Color.white); 
		add(spaceup);
		GridLayout grille = new GridLayout(15, 1, 0, 10); 
															
		setLayout(grille);

		add(space);
		add(space1);
		add(space2);
		add(Creer);
		add(Editer);
		add(Marquer);
		add(Supprimer);
		add(Dupliquer);
		add(dateJour);

		
	}

	
}
