package ch21._swing._04_Adapter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MouseMotionAnnoymousDemo extends JFrame {

	private JPanel contentPane;
	JButton ok;
	JButton cancel;
	JTextField jtext;
	public MouseMotionAnnoymousDemo(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		ok = new JButton("確定");
		cancel = new JButton("取消");
		jtext = new JTextField("在此會顯示滑鼠座標", 50);
		//MouseMotionAdapterClass  mml = new MouseMotionAdapterClass(contentPane, jtext);
		//MouseMotionAdapterClass  mml = new MouseMotionAdapterClass();
//		contentPane.addMouseMotionListener(new MouseMotionAdapter(){  
//			public void mouseMoved(MouseEvent e) {
//				int x  = e.getX();
//				int y  = e.getY();
//				jtext.setText("滑鼠座標(AAA)(x,y)==("+x+","+y+")");
//			}
//			
//		});
		contentPane.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseMoved(MouseEvent e) {
				int x  = e.getX();
				int y  = e.getY();
				jtext.setText("滑鼠座標(BBB)(x,y)==("+x+","+y+")");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		contentPane.add(ok);
		contentPane.add(cancel);
		contentPane.add(jtext);
		add(contentPane);
		setLocationRelativeTo(null);
	}
	
	
//	public class MouseMotionAdapterClass extends MouseMotionAdapter {
////		JPanel contentPane;
////		JTextField jtext;
////		public MouseMotionAdapterClass(JPanel contentPane, JTextField jtext) {
////			this.contentPane = contentPane;
////			this.jtext = jtext;
////		}
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			int x  = e.getX();
//			int y  = e.getY();
//			jtext.setText("滑鼠座標(x,y)==("+x+","+y+")");
//		}
//
//	}

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMotionAnnoymousDemo frame = new MouseMotionAnnoymousDemo("滑鼠事件處理二 Adapter");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
