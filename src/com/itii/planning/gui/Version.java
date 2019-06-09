package com.itii.planning.gui;

import javax.swing.JOptionPane;

public class Version extends JOptionPane
{
	private static final long serialVersionUID = 1L;

	public Version()
	{
		showMessageDialog(null, "Version 0.0.1\n Licence : Damien & Yann", "Version", JOptionPane.INFORMATION_MESSAGE);
	}
}
