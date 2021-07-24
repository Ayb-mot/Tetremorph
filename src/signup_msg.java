import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class signup_msg extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_msg frame = new signup_msg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signup_msg() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(signup_msg.class.getResource("/img/icons8.png")));
		setTitle("Signup");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 103);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_promp = new JLabel("Thank you for signing up an email will be send for you to confirm!");
		lbl_promp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_promp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lbl_promp.setBounds(20, 0, 393, 64);
		contentPane.add(lbl_promp);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(signup_msg.class.getResource("/img/icons8_info_22px.png")));
		lblNewLabel.setBounds(10, 18, 26, 25);
		contentPane.add(lblNewLabel);
	}

}
