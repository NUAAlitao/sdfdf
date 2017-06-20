package ui;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginFrame {

	public  JFrame frame;
	
	public JTextField tfname;
	public JTextField tfpwd;
	public JButton btlogin;
	public JButton btregister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(91, 54, 92, 21);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(107, 123, 52, 21);
		frame.getContentPane().add(label_1);
		
		tfname = new JTextField();
		tfname.setFont(new Font("ËÎÌו", Font.PLAIN, 21));
		tfname.setBounds(198, 51, 96, 27);
		frame.getContentPane().add(tfname);
		tfname.setColumns(10);
		
		tfpwd = new JTextField();
		tfpwd.setFont(new Font("ËÎÌו", Font.PLAIN, 21));
		tfpwd.setBounds(198, 120, 96, 27);
		frame.getContentPane().add(tfpwd);
		tfpwd.setColumns(10);
		
		btlogin = new JButton("\u767B\u5F55");
		btlogin.setBounds(67, 226, 123, 29);
		frame.getContentPane().add(btlogin);
		
		btregister = new JButton("\u6CE8\u518C");
		btregister.setBounds(253, 226, 123, 29);
		frame.getContentPane().add(btregister);
		
		frame.setVisible(true);
	}
}
