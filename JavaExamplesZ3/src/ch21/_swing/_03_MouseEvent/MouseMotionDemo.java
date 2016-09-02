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
		ok = new JButton("確定");
		cancel = new JButton("取消");
		jtext = new JTextField("在此會顯示滑鼠座標", 50);
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
				source = "視窗";
			else if ( o == jtext)
				source = "文字方塊";
			else if ( o == ok)
				source = "確定按鈕";
			else if ( o == cancel)
				source = "取消按鈕";
			int x  = e.getX();
			int y  = e.getY();
			jtext.setText("滑鼠座標(x,y)==("+x+","+y+")" + "  滑鼠在" + source);
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMotionDemo frame = new MouseMotionDemo("滑鼠事件處理一");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
