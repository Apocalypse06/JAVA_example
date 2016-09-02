package ch21._swing._00;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class MyFirstFrame extends JFrame{
	private JPanel contentPane;
	public MyFirstFrame(){
		//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(445, 344);  //設定JFrame的大小
		contentPane = new JPanel(); // 新建一個沒有邊框的容器元件
		// 新建一個標籤元件
		JLabel hello1 = new JLabel("大家好", JLabel.LEFT);
		// 新建一個Font物件		
		Font font = new Font("標楷體", Font.ITALIC, 32);
		hello1.setFont(font);
		hello1.setForeground(Color.blue);
		contentPane.add(hello1);
		add(contentPane);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
	/* 
	EventQueue.invokeLater()會將run()方法內的敘述放入系統事件處理佇列
	(System Event Dispatch Queue)等待事件分派執行緒來執行。
	 當佇列內原有的工作都做完後，就會輪到run()方法內的敘述。  */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstFrame frame = new MyFirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
