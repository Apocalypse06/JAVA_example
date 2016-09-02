package ch21._swing._04_Adapter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MouseMotionDemo extends JFrame{

	private JPanel contentPane;
	JButton ok;
	JButton cancel;
	JTextField jtext;
	public MouseMotionDemo(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		ok = new JButton("�T�w");
		cancel = new JButton("����");
		jtext = new JTextField("�b���|��ܷƹ��y��", 50);
		//MouseMotionAdapterClass  mml = new MouseMotionAdapterClass(contentPane, jtext);
		MouseMotionAdapterClass  mml = new MouseMotionAdapterClass();
		contentPane.addMouseMotionListener(mml);
		contentPane.add(ok);
		contentPane.add(cancel);
		contentPane.add(jtext);
		add(contentPane);
		setLocationRelativeTo(null);
	}
	
	
	public class MouseMotionAdapterClass extends MouseMotionAdapter {
//		JPanel contentPane;
//		JTextField jtext;
//		public MouseMotionAdapterClass(JPanel contentPane, JTextField jtext) {
//			this.contentPane = contentPane;
//			this.jtext = jtext;
//		}
		@Override
		public void mouseMoved(MouseEvent e) {
			int x  = e.getX();
			int y  = e.getY();
			jtext.setText("�ƹ��y��(x,y)==("+x+","+y+")");
		}

	}

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMotionDemo frame = new MouseMotionDemo("�ƹ��ƥ�B�z�G Adapter");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
