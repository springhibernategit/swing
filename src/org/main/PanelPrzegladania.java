package org.main;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelPrzegladania extends JPanel {
	
	private JTextArea obszarTekstowy;

	public PanelPrzegladania() {
		createGUI();
	}

	private void createGUI() {
		ZdarzenieKlikniecia zdarzenieKlikniecia = new ZdarzenieKlikniecia();
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		JButton leftButton = new JButton("<-");
		leftButton.addActionListener(zdarzenieKlikniecia);
		addKomponentToPanel(leftButton, 0, 0, 1, 1);
		
		obszarTekstowy = new JTextArea(40,40);
		obszarTekstowy.setText("0");
//		obszarTekstowy.setEditable(false);
//		obszarTekstowy.setBackground(Color.ORANGE);
		JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy);
		addKomponentToPanel(obszarPrzewijania, 1, 0, 1, 1);
		
		JButton rightButton = new JButton("->");
		rightButton.addActionListener(zdarzenieKlikniecia);
		addKomponentToPanel(rightButton, 2, 0, 1, 1);
		
		JButton generatorButton = new JButton("Generator");
		addKomponentToPanel(generatorButton, 1, 1, 1, 1);
		
	}
	
	public void addKomponentToPanel(Component c, int x, int y, int w, int h) {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		
		add(c, constraints);
	}
	
	private class ZdarzenieKlikniecia implements ActionListener {

		private int licznik = 0;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("<-")) {
				licznik = licznik - 1;
				obszarTekstowy.setText("" + licznik);
			} else if(e.getActionCommand().equals("->")) {
				licznik = licznik + 1;
				obszarTekstowy.setText("" + licznik);
			}
			
		}
		
	}
}
