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
		setSize(445, 344);  //�]�wJFrame���j�p
		contentPane = new JPanel(); // �s�ؤ@�ӨS����ت��e������
		// �s�ؤ@�Ӽ��Ҥ���
		JLabel hello1 = new JLabel("�j�a�n", JLabel.LEFT);
		// �s�ؤ@��Font����		
		Font font = new Font("�з���", Font.ITALIC, 32);
		hello1.setFont(font);
		hello1.setForeground(Color.blue);
		contentPane.add(hello1);
		add(contentPane);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
	/* 
	EventQueue.invokeLater()�|�Nrun()��k�����ԭz��J�t�Ψƥ�B�z��C
	(System Event Dispatch Queue)���ݨƥ����������Ӱ���C
	 ���C���즳���u�@��������A�N�|����run()��k�����ԭz�C  */
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
