package trabajo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Iniciosesionadmin {

	private JFrame frame;
	private JTextField txtBienvenidoAdministrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iniciosesionadmin window = new Iniciosesionadmin();
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
	public Iniciosesionadmin() {
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
		
		txtBienvenidoAdministrador = new JTextField();
		txtBienvenidoAdministrador.setFont(new Font("Source Serif Pro Light", Font.BOLD, 18));
		txtBienvenidoAdministrador.setEditable(false);
		txtBienvenidoAdministrador.setText("BIENVENIDO ADMINISTRADOR");
		txtBienvenidoAdministrador.setBounds(78, 11, 286, 43);
		frame.getContentPane().add(txtBienvenidoAdministrador);
		txtBienvenidoAdministrador.setColumns(10);
		
		JButton btnNewButton = new JButton("Activar usuario");
		btnNewButton.setBounds(20, 65, 156, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Desactivar usuario");
		btnNewButton_1.setBounds(20, 181, 183, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar pel\u00EDcula");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminarpelicula ep=new Eliminarpelicula();
				ep.main(null);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(261, 181, 156, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Insertar pel\u00EDcula");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insertarpelicula ip=new Insertarpelicula();
				ip.main(null);
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(261, 65, 156, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Editar usuario");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(40, 119, 136, 44);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Modificar pel\u00EDcula");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5.setBounds(261, 119, 163, 43);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("imagen/fondo.jpg"));
	}

}
