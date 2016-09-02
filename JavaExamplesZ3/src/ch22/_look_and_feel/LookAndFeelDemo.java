package ch22._look_and_feel;
/* 
 * 由使用者自行決定Swing程式的外觀(動態設定程式的LookAndFeel)
 * 
 * */


import javax.swing.*;

import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.io.*;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class LookAndFeelDemo {
  
	
	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="37,43"
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem = null;
	private JMenuItem jMenuItem1 = null;
	private JMenuItem jMenuItem2 = null;
	private JButton jButton1 = null;
	private JMenu jMenu1 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem3 = null;

	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new Dimension(600, 400));
			jFrame.setTitle("Look And Feel Demo");
			jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setContentPane(getJContentPane());
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJButton1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(78, 251, 104, 35));
			jButton.setText("InputDialog");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String input = null; 
					input = JOptionPane.showInputDialog("請輸入檔名：");
					
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.setPreferredSize(new Dimension(0, 30));
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Look And Feel");
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
			jMenu.add(getJMenuItem2());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem("Windows");
			jMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					} catch (ClassNotFoundException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (InstantiationException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (UnsupportedLookAndFeelException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					}
					SwingUtilities.updateComponentTreeUI(jFrame);
				}
			});
		}
		return jMenuItem;
	}

	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem("Metal");
			jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					} catch (ClassNotFoundException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (InstantiationException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (UnsupportedLookAndFeelException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					}
					SwingUtilities.updateComponentTreeUI(jFrame);
				}
			});
		}
		return jMenuItem1;
	}

	/**
	 * This method initializes jMenuItem2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem("Motil");
			jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					} catch (ClassNotFoundException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (InstantiationException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					} catch (UnsupportedLookAndFeelException e1) {
						// TODO 自動產生 catch 區塊
						e1.printStackTrace();
					}
					SwingUtilities.updateComponentTreeUI(jFrame);
					
				}
			});
		}
		return jMenuItem2;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {  
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(209, 253, 113, 35));
			jButton1.setText("FileChooser");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					int returnVal = fc.showOpenDialog(jFrame);

		            if (returnVal == JFileChooser.APPROVE_OPTION) {
		                File file = fc.getSelectedFile();
		                //This is where a real application would open the file.
		                jFrame.setTitle("開啟檔案: " + file.getName()  + "  路徑=" + file.getAbsolutePath()  );
		            } else {
		            	jFrame.setTitle("開啟檔案時，使用者按下取消" );
		            }
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("檔案");
			jMenu1.add(getJMenuItem3());
		}
		return jMenu1;
	}

	/**
	 * This method initializes jMenu2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("編輯");
		}
		return jMenu2;
	}

	/**
	 * This method initializes jMenuItem3	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("開啟檔案");
		}
		return jMenuItem3;
	}
	public static void main(String[] args) {
        LookAndFeelDemo laf = new LookAndFeelDemo();
        laf.getJFrame().setLocationRelativeTo(null);        
        laf.getJFrame().setVisible(true);
	}
}
