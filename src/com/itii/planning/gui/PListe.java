package com.itii.planning.gui;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PListe extends PTache 
{
	private static final long serialVersionUID = 1L;
	static JTable planningList;
	
	// constructeur
	public PListe() {
		setLayout(new BorderLayout()); 

		String titre[] = { "Nom de la tache", "Date", "Details" }; 

		DefaultTableModel tableModel = new DefaultTableModel(titre, 0); 
		planningList = new JTable(tableModel); 

		planningList.setFillsViewportHeight(true);

		JScrollPane scp = new JScrollPane(planningList); 
		add(scp, BorderLayout.CENTER);
	}
	
	public JTable getPlanningList() {
		return planningList;
	}
}
