package trabajo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Iniciarsesion {

	private JFrame frame;
	private JTextField txtIniciarSesin;
	private JTextField txtNombreDeUsuario;
	private JTextField textField;
	private JTextField txtContrasea;
	private JTextField textField_2;
	
	

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iniciarsesion window = new Iniciarsesion();
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
	public Iniciarsesion() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("imagen/iniciosesion.png"));
		lblNewLabel.setBounds(198, 55, 226, 144);
		frame.getContentPane().add(lblNewLabel);
		
		txtIniciarSesin = new JTextField();
		txtIniciarSesin.setEditable(false);
		txtIniciarSesin.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 16));
		txtIniciarSesin.setText("INICIAR SESI\u00D3N");
		txtIniciarSesin.setBounds(44, 15, 128, 30);
		frame.getContentPane().add(txtIniciarSesin);
		txtIniciarSesin.setColumns(10);
		
		txtNombreDeUsuario = new JTextField();
		txtNombreDeUsuario.setEditable(false);
		txtNombreDeUsuario.setText("Nombre de usuario");
		txtNombreDeUsuario.setBounds(44, 74, 114, 20);
		frame.getContentPane().add(txtNombreDeUsuario);
		txtNombreDeUsuario.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(44, 105, 114, 20);
		frame.getContentPane().add(textField);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setEditable(false);
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(44, 140, 86, 20);
		frame.getContentPane().add(txtContrasea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(44, 171, 114, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaUsuarios lu=new ListaUsuarios ();
				ArrayList<Usuario> usuarios=lu.getUsuarios();
				for(Usuario u: usuarios) {
					if(!u.getUsername().equals(getTextField().getText())&& u.getPassword().equals(getTextField_2().getText())) {
						JOptionPane.showMessageDialog(null, "Error. El username no está en los registros");
					}
					if(u.getUsername().equals(getTextField().getText())&& !u.getPassword().equals(getTextField_2().getText())) {
						JOptionPane.showMessageDialog(null, "Error. La contraseña para este usuario no es la correcta");
					}
					else
						JOptionPane.showMessageDialog(null, "Bienvenido de nuevo "+getTextField().getText());
				}
			}
		});
		btnNewButton.setBounds(54, 202, 89, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00BFOlvidaste tu contrase\u00F1a?");
		btnNewButton_1.setBounds(170, 202, 184, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("imagen/fondo.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
