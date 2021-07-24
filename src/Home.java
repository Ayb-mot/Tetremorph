import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.MatteBorder;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void close () {
		WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}


	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setTitle("Tetramorph");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/icons8.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("InternalFrame.borderLight"));
		panel.setBounds(0, 0, 426, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("icon");
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/img/bg-01.png")));
		lblNewLabel_3.setBounds(10, 11, 406, 540);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tetramorph");
		lblNewLabel_4.setBackground(Color.DARK_GRAY);
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 31));
		lblNewLabel_4.setBounds(108, 581, 182, 35);
		panel.add(lblNewLabel_4);
		
		JLabel pwd_confirm = new JLabel("");
		pwd_confirm.setForeground(Color.DARK_GRAY);
		pwd_confirm.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		pwd_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		pwd_confirm.setBounds(10, 627, 406, 43);
		panel.add(pwd_confirm);
		
		JButton btnNewButton = new JButton(" or Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				main_app_Home pi = new main_app_Home();
				pi.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton.setBounds(854, 557, 288, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(489, 307, 653, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.BLACK);
		separator.setBounds(489, 249, 653, 2);
		contentPane.add(separator);

		JLabel txt_Email = new JLabel("Email:");
		txt_Email.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		txt_Email.setBounds(489, 180, 145, 23);
		contentPane.add(txt_Email);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblUsername.setBounds(489, 273, 145, 23);
		contentPane.add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_1.setColumns(10);
		textField_1.setBounds(489, 214, 653, 37);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblPassword.setBounds(489, 365, 145, 23);
		contentPane.add(lblPassword);
		
		JLabel lblUsername_1_1 = new JLabel("Confirm Password:");
		lblUsername_1_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblUsername_1_1.setBounds(489, 445, 145, 23);
		contentPane.add(lblUsername_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(489, 342, 653, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(489, 432, 653, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.WHITE);
		separator_2_1.setBounds(489, 519, 653, 2);
		contentPane.add(separator_2_1);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(489, 397, 653, 37);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField_1.setBounds(489, 484, 653, 37);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/img/icons8.png")));
		lblNewLabel_1.setBounds(769, 57, 68, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tetramorph");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Victor Mono", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(699, 112, 198, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Victor Mono", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(598, 633, 426, 37);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnLogin = new JButton("Signup");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean status = Email_Validation.email_validation(textField_1.getText().toString().trim());
				if (status) {
					lblNewLabel_2_1.setText("Thank you for signing up !");
				}
				else {
					lblNewLabel_2_1.setText("Please enter a valid Email!");
				}

				boolean stat = password_Validation.password_validation(passwordField.getPassword().toString().trim());
				if (stat) {
					pwd_confirm.setText("Password is valid!");
				}
				else {
					pwd_confirm.setText("Please enter a valid password!");
				}

/**		If the email and password match the requirements go to next phase and login
 *
 *
 * 				 if (status) {
					status = true;
				}else if (stat){
				 	stat = true;
				 } else {
					 close();
					 main_app_Home pi = new main_app_Home();
					 pi.setVisible(true);
				 }*/

				}

		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setBounds(520, 557, 288, 37);
		contentPane.add(btnLogin);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
