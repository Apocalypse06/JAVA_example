package ch21._swing._03_MouseEvent;

import java.awt.event.*;

import javax.swing.*;

public class MouseMotionClass implements MouseMotionListener {
	JPanel contentPane;
	JTextField jtext;
	JButton ok, cancel;
	public MouseMotionClass(JPanel contentPane, JTextField jtext, JButton ok, JButton cancel) {
		this.contentPane = contentPane;
		this.jtext = jtext;
		this.ok = ok;
		this.cancel = cancel;
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		String source = "";
//		Object o = e.getSource();
//		if (o instanceof JButton){
//			JButton jbtn = (JButton) o;
//			jbtn.getText();
//		}
//		if ( o == contentPane )
//			source = "����";
//		else if ( o == jtext)
//			source = "��r���";
//		else if ( o == ok)
//			source = "�T�w���s";
//		else if ( o == cancel)
//			source = "�������s";
//		int x  = e.getX();
//		int y  = e.getY();
//		jtext.setText("�ƹ��y��(x,y)==("+x+","+y+")" + "  �ƹ��b" + source);
	}

}
