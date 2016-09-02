package ch21._swing._05_Nested._02_AnnoymousClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class MouseMotionDemo extends JFrame {
	private JPanel contentPane;
	JButton ok;
	JButton cancel;
	JTextField jtext;
	public MouseMotionDemo(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		ok = new JButton("確定");
		cancel = new JButton("取消");
		jtext = new JTextField("在此會顯示滑鼠座標", 50);
		// MouseMotionAdapterClass mml = new
		// MouseMotionAdapterClass(contentPane, jtext);
		// MouseMotionAdapterClass mml = new MouseMotionAdapterClass();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				MouseMotionDemo.this.jtext.setText(
						"滑鼠座標(x,y)==(" + x + "," + y + ")");
			}
		});
		contentPane.add(ok);
		contentPane.add(cancel);
		contentPane.add(jtext);
		add(contentPane);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseMotionDemo frame = new MouseMotionDemo(
							"滑鼠事件處理四 Annoymous Class");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}