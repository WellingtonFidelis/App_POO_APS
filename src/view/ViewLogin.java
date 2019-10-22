package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JButton btnEnter;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
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
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(194, 84, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(119, 109, 196, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(194, 162, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//button Enter
				if (checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					JOptionPane.showConfirmDialog(null, "Bem vindo ao Sistema.");
				} else {
					JOptionPane.showConfirmDialog(null, "Dados Inválidos!", "Tu fez merda.", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEnter.setBounds(172, 250, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(119, 183, 196, 20);
		frame.getContentPane().add(txtSenha);
	}
	
	public boolean checkLogin (String login, String password) {
		return login.equals("usuario") && password.equals("123");
	}
}
