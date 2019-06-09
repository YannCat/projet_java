package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelecAff extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public JComboBox<Object> comboBox = null;
	
	public SelecAff() {
		String[] select = { "Liste", "Mois", "Semaine" };
		setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		comboBox = new JComboBox<Object>(select); 
		JLabel label = new JLabel("Vue : "); 
					
		add(label, BorderLayout.WEST); 
		add(comboBox, BorderLayout.CENTER); 
		
		comboBox.setSelectedIndex(0);		//0 : Liste, 1 : Mois, 2 : Semaine
		
	}	
}
