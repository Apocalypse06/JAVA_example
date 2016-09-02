package ch21._swing._02_EventHandler;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonClickDemo extends JFrame{
	private JPanel contentPane;
	JButton red;
	JButton blue;
	JButton green;	
	public ButtonClickDemo(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 344);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		red = new JButton("紅色");
		blue = new JButton("藍色");
		green = new JButton("\u7DA0\u8272");
		ActionClassRed acr = new ActionClassRed(contentPane);
		ActionClassBlue acb = new ActionClassBlue(contentPane);
		ActionClassGreen acg = new ActionClassGreen(contentPane);
		red.addActionListener(acr);
		blue.addActionListener(acb);
		green.addActionListener(acg);
		contentPane.add(red);
		contentPane.add(blue);
		contentPane.add(green);	
		add(contentPane);		
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonClickDemo frame = new ButtonClickDemo("按鈕事件處理一事件傾聽者類別");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
