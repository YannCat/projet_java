package com.itii.planning.gui;

import javax.swing.JFrame;

public class MainWindow extends JFrame { 

	private static final long serialVersionUID = 1L;
	public MainPanel PrincPan = new MainPanel();
	private MainWindow() 
	{
		initialize();
	}

	private void initialize() 
	{
		setSize(1200, 800); 
		setTitle("Planning"); 
		setVisible(true); 
		setLocationRelativeTo(null); 
		getContentPane().add(PrincPan); 
		setJMenuBar(PMenuBar.getMyMenuBar()); 
		validate();
		repaint();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

	private static MainWindow instance;

	public static MainWindow getInstance() 
	{
		if (instance == null) {
			instance = new MainWindow();
		}
		return instance;
	}
	public MainPanel getMainPanel() {
		return PrincPan;
	}
}
