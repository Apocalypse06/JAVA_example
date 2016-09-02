package ch21._swing._01_LayoutManager;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class FlowLayoutDemo extends JFrame {
	private Container contentPane;
	public FlowLayoutDemo(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 344);
		//contentPane = new JPanel();
		contentPane = getContentPane();
		//System.out.println(contentPane.getClass().getName());
		contentPane.setLayout(new FlowLayout());
		JButton br = new JButton("紅色");
		JButton bb = new JButton("藍色");
		JButton bg = new JButton("綠色");
		br.setSize(100, 40);
		br.setLocation(200, 150);
		contentPane.add(br);
		contentPane.add(bb);
		contentPane.add(bg);

		for (int i = 0; i < 30; i++) {
			contentPane.add(new JButton("Btn:" + i));
		}

		//add(contentPane);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutDemo frame = new FlowLayoutDemo("FlowLayout展示");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
