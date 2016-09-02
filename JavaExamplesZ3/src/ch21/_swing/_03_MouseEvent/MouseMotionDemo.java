package ch21._swing._03_MouseEvent;

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
		//MouseMotionClass  mml = new MouseMotionClass(contentPane, jtext, ok, cancel);
		MouseMotionClass  mml = new MouseMotionClass();
		contentPane.addMouseMotionListener(mml);
		ok.addMouseMotionListener(mml);
		cancel.addMouseMotionListener(mml);
		jtext.addMouseMotionListener(mml);
		contentPane.add(ok);
		contentPane.add(cancel);
		contentPane.add(jtext);
		getContentPane().add(contentPane);
		setLocationRelativeTo(null);
	}
	
	
	
	
	public class MouseMotionClass implements MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			String source = "";
			Object o = e.getSource();
			if (o instanceof JButton){
				JButton jbtn = (JButton) o;
				jbtn.getText();
			}
			if ( o == contentPane )
				source = "����";
			else if ( o == jtext)
				source = "��r���";
			else if ( o == ok)
				source = "�T�w���s";
			else if ( o == cancel)
				source = "�������s";
			int x  = e.getX();
			int y  = e.getY();
			jtext.setText("�ƹ��y��(x,y)==("+x+","+y+")" + "  �ƹ��b" + source);
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMotionDemo frame = new MouseMotionDemo("�ƹ��ƥ�B�z�@");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
