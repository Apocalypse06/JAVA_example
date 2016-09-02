package ch21._swing._02_EventHandler;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ActionClassGreen implements ActionListener {

	JPanel contentPane;

	public ActionClassGreen(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		contentPane.setBackground(Color.green);
	}

}
