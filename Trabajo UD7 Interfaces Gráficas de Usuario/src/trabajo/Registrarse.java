package trabajo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registrarse {

	private JFrame frame;
	private JTextField txtRegistrarse;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse window = new Registrarse();
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
	public Registrarse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("imagen/registrarformulario.png"));
		lblNewLabel.setBounds(10, 57, 200, 146);
		frame.getContentPane().add(lblNewLabel);
		
		txtRegistrarse = new JTextField();
		txtRegistrarse.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 16));
		txtRegistrarse.setEditable(false);
		txtRegistrarse.setText("REGISTRARSE");
		txtRegistrarse.setBounds(266, 11, 109, 36);
		frame.getContentPane().add(txtRegistrarse);
		txtRegistrarse.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(false);
		txtUsername.setText("Username");
		txtUsername.setBounds(220, 65, 86, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setEditable(false);
		txtPassword.setColumns(10);
		txtPassword.setBounds(220, 98, 86, 20);
		frame.getContentPane().add(txtPassword);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(220, 129, 86, 20);
		frame.getContentPane().add(txtNombre);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBounds(220, 160, 86, 20);
		frame.getContentPane().add(txtEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(323, 65, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(323, 98, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(323, 129, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(323, 160, 86, 20);
		frame.getContentPane().add(textField_7);
		
		ListaUsuarios usuarios=new ListaUsuarios();
		Usuario admin=new Usuario("admin","admin","admin","admin@miaplicacion.com",true,false);
		usuarios.añadeUsuario(admin);
		try {
			usuarios.salvarArrayList();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has sido registrado "+textField_3.getText());
				usuarios.añadeUsuario(new Usuario(textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_7.getText(),false,false));
				try {
					usuarios.salvarArrayList();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(267, 203, 102, 36);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("imagen/fondo.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}

}
