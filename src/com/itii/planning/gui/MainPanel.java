package com.itii.planning.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{ 

	private static final long serialVersionUID = 1L;
	
	
	private SelecAff pTop = new SelecAff();
	private SelecAction pBtn = new SelecAction();
	private PListe pListe = new PListe();
	
	public MainPanel()
	{
		setBackground(Color.gray); 
		setVisible(true);

		setLayout(new BorderLayout()); 

		add(pTop, BorderLayout.NORTH);
		GridLayout gridLayout = (GridLayout) pBtn.getLayout();
		gridLayout.setHgap(15);
		add(pBtn, BorderLayout.EAST);
		
		pTop.add(pTop.comboBox, BorderLayout.CENTER); 
		
		add(pListe, BorderLayout.CENTER);
		pListe.setVisible(true); 
				
	}

	public JPanel getMainPanel() 
	{
		return this;
	}
	
	
	public PListe getpListe() {
		return pListe;
	}
		
}