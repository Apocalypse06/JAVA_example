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
//			source = "視窗";
//		else if ( o == jtext)
//			source = "文字方塊";
//		else if ( o == ok)
//			source = "確定按鈕";
//		else if ( o == cancel)
//			source = "取消按鈕";
//		int x  = e.getX();
//		int y  = e.getY();
//		jtext.setText("滑鼠座標(x,y)==("+x+","+y+")" + "  滑鼠在" + source);
	}

}
