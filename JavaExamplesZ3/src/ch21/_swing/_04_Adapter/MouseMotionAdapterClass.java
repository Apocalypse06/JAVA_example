package ch21._swing._04_Adapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseMotionAdapterClass extends MouseMotionAdapter {
	JPanel contentPane;
	JTextField jtext;
	public MouseMotionAdapterClass(JPanel contentPane, JTextField jtext) {
		this.contentPane = contentPane;
		this.jtext = jtext;
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		int x  = e.getX();
		int y  = e.getY();
		jtext.setText("·Æ¹«®y¼Ð(x,y)==("+x+","+y+")");
	}

}
