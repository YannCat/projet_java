package com.itii.planning.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PMenuBar extends JMenuBar implements ActionListener
{
	private static final long serialVersionUID = 1L;

	private JMenu fichier = new JMenu("Fichier");
	private JMenu edition = new JMenu("Edition");
	private JMenu vue = new JMenu("Vue");
	private JMenu help = new JMenu("?");

	private JMenuItem quitter = new JMenuItem("Quitter");

	private JMenuItem creer = new JMenuItem("Creer");
	private JMenuItem editer = new JMenuItem("Editer");
	private JMenuItem marquer = new JMenuItem("Marquer");
	private JMenuItem dupliquer = new JMenuItem("Dupliquer");
	private JMenuItem supprimer = new JMenuItem("Supprimer");

	private JMenuItem liste = new JMenuItem("Liste");
	private JMenuItem semaine = new JMenuItem("Semaine");
	private JMenuItem mois = new JMenuItem("Mois");

	private JMenuItem aide = new JMenuItem("Aide");
	private JMenuItem version = new JMenuItem("Version");

	public PMenuBar() {
		
		add(fichier);
		add(edition);
		add(vue);
		add(help);

		fichier.add(quitter);

		edition.add(creer);
		edition.add(editer);
		edition.add(marquer);
		edition.add(dupliquer);
		edition.add(supprimer);

		vue.add(liste);
		vue.add(semaine);
		vue.add(mois);
		
		help.add(aide);
		help.add(version);
		
		creer.addActionListener(this);
		editer.addActionListener(this); 
		marquer.addActionListener(this);
		dupliquer.addActionListener(this);
		supprimer.addActionListener(this);
		quitter.addActionListener(this);
		aide.addActionListener(this);
		version.addActionListener(this);
	}


	public static PMenuBar getMyMenuBar()
	{
		return new PMenuBar();
	}
	
	@SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e)
	{	
		JMenuItem b = (JMenuItem ) e.getSource();
	    if (b == creer) {
	    	System.out.println("bouton creer"); 
	    } 
	    if (b == editer) {
	    	System.out.println("bouton editer");
	    } 
	    if (b == dupliquer) {
	    	System.out.println("bouton dupliquer");
	    } 
	    if (b == marquer) {
	    	System.out.println("bouton marquer ");
	    } 
	    if (b == supprimer) {
	    	System.out.println("bouton supprimer ");
	    } 
	    if (b == quitter) { 
	    	MainWindow.getInstance().dispose();
	    }
	    if (b == version) {
	    	Version version = new Version();
	    }
	    if (b == aide) {
	    	Aide aide = new Aide();
	    }
		
	}
}
