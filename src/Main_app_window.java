import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import com.k33ptoo.components.KGradientPanel;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class Main_app_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_app_window frame = new Main_app_window();
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
	public Main_app_window() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Tetramorph");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main_app_window.class.getResource("/img/icons8.png")));
		setBackground(Color.BLUE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main_app_window.class.getResource("/img/icons8_male_user_80px.png")));
		lblNewLabel.setBounds(10, 11, 86, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Giovani Gorgio");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(90, 11, 172, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senior Dev");
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		lblNewLabel_2.setBounds(100, 49, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 87, 252, 7);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				main_app_Home logout = new main_app_Home();
				logout.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		btnNewButton.setBounds(1154, 647, 100, 23);
		contentPane.add(btnNewButton);
	}
}
