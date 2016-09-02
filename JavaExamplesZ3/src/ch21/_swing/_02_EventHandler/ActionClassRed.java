package ch21._swing._02_EventHandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ActionClassRed implements ActionListener {
	JPanel contentPane;

	public ActionClassRed(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		contentPane.setBackground(Color.red);
	}
}