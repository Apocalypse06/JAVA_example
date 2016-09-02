package ch21._swing._02_EventHandler;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonClickAnonymousDemo extends JFrame{
	private JPanel contentPane;
	JButton red;
	JButton blue;
	JButton green;	
	public ButtonClickAnonymousDemo(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 344);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		red = new JButton("紅色");
		blue = new JButton("藍色");
		green = new JButton("\u7DA0\u8272");
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentPane.setBackground(Color.red);
			}
		});
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
				
			}
		});
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
					ButtonClickAnonymousDemo frame = 
						new ButtonClickAnonymousDemo("按鈕事件處理一匿名者類別");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
