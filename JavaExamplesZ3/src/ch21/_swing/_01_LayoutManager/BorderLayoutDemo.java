package ch21._swing._01_LayoutManager;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class BorderLayoutDemo extends JFrame {
	private JPanel contentPane;
	JPanel p;
	JButton bn, bs, bw, be, bc, ok, cancel ;
	public BorderLayoutDemo(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		bn = new JButton("北方"); 
		bs = new JButton("南方"); 
		bc = new JButton("中央");
		bw = new JButton("西方");
		be = new JButton("東方");
		ok = new JButton("確定");
		//be.setPreferredSize(new Dimension(200, 0));
		cancel = new JButton("取消");		
		be.setBackground(Color.pink);		
		p = new JPanel() ;
		p.setBackground(Color.blue);
		p.add(ok); p.add(cancel);
		contentPane.add(bn, BorderLayout.NORTH) ;
		contentPane.add(bs, BorderLayout.SOUTH) ;
		contentPane.add(p, BorderLayout.CENTER) ;
		contentPane.add(bw, BorderLayout.WEST) ;
		contentPane.add(be, BorderLayout.EAST) ;
		add(contentPane);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutDemo frame = new BorderLayoutDemo("BorderLayout展示");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
