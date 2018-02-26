package org.main;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 4958136615266674498L;

	public MainFrame() {
		init();
	}
	
	public void init() {
		setTitle("Przegladarka obrazow");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PanelPrzegladania());
		pack();
		setLocationRelativeTo(null);
	}
}
