
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import com.k33ptoo.components.KButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class main_app_Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pwd_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_app_Home frame = new main_app_Home();
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
	public main_app_Home() {
		setTitle("Tetramorph");
		setIconImage(Toolkit.getDefaultToolkit().getImage(main_app_Home.class.getResource("/img/icons8.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		/* contentPane.setBackground(Color.decode("#1F1B24")); */
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_ico = new JLabel("icon");
		lbl_ico.setIcon(new ImageIcon(main_app_Home.class.getResource("/img/icons8.png")));
		lbl_ico.setBounds(612, 11, 50, 59);
		contentPane.add(lbl_ico);
		
		JLabel lbl_tetramorph_title = new JLabel("Tetramorph");
		lbl_tetramorph_title.setForeground(Color.BLACK);
		lbl_tetramorph_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tetramorph_title.setFont(new Font("Victor Mono", Font.PLAIN, 23));
		lbl_tetramorph_title.setBounds(542, 66, 198, 37);
		contentPane.add(lbl_tetramorph_title);
		
		JButton btn_login = new JButton("Login");
		btn_login.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Main_app_window pi = new Main_app_window();
				pi.setVisible(true);
			}
		});
		btn_login.setBackground(new Color(245, 245, 245));
		btn_login.setBounds(470, 630, 163, 37);
		contentPane.add(btn_login);
		
		JButton btn_signup = new JButton("Sign up");
		btn_signup.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		btn_signup.setBackground(new Color(245, 245, 245));
		btn_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Home px = new Home();
				px.setVisible(true);
			}
		});
		btn_signup.setBounds(675, 630, 163, 37);
		contentPane.add(btn_signup);
		
		JLabel lblNewLabel = new JLabel("Or");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(624, 621, 62, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(1011, 637, 243, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Back");
		lblNewLabel_2.setFont(new Font("Victor Mono", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(525, 131, 215, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email Adress or Username:");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(470, 305, 258, 29);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Victor Mono", Font.PLAIN, 18));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.controlHighlight));
		textField.setBounds(470, 345, 368, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_eye_icon = new JLabel("");
		lbl_eye_icon.setIcon(new ImageIcon(main_app_Home.class.getResource("/img/icons8_eye_22px_2.png")));
		lbl_eye_icon.setBounds(848, 443, 33, 49);
		contentPane.add(lbl_eye_icon);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password:");
		lblNewLabel_3_1.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(470, 418, 169, 29);
		contentPane.add(lblNewLabel_3_1);
		
		pwd_field = new JPasswordField();
		pwd_field.setFont(new Font("Victor Mono", Font.PLAIN, 18));
		pwd_field.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.controlHighlight));
		pwd_field.setBounds(470, 458, 368, 29);
		contentPane.add(pwd_field);
		
		JButton btnNewButton = new JButton("Login with Google");
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		btnNewButton.setIcon(new ImageIcon(main_app_Home.class.getResource("/img/icons8_google_16px.png")));
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setBounds(517, 568, 286, 33);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remembre me");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(470, 510, 139, 33);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("Forgot your password?");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(624, 514, 215, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5aphel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(main_app_Home.class.getResource("/img/i01_ppl_call-removebg-preview.png")));
		lblNewLabel_1.setBounds(874, 245, 390, 298);
		contentPane.add(lblNewLabel_1);
		

	}
}