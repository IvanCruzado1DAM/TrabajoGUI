package trabajo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Eliminarpelicula {

	private JFrame frame;
	private JTextField txtInsertarPelcula;
	private JTextField txtNombre;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminarpelicula window = new Eliminarpelicula();
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
	public Eliminarpelicula() {
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
		
		txtInsertarPelcula = new JTextField();
		txtInsertarPelcula.setFont(new Font("Source Serif Pro Semibold", Font.ITALIC, 18));
		txtInsertarPelcula.setText("Eliminar Pel\u00EDcula");
		txtInsertarPelcula.setEditable(false);
		txtInsertarPelcula.setBounds(134, 11, 156, 31);
		frame.getContentPane().add(txtInsertarPelcula);
		txtInsertarPelcula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre  de la pel\u00EDcula a eliminar");
		txtNombre.setEditable(false);
		txtNombre.setBounds(119, 89, 184, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 120, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("ELIMINAR");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 File f = new File("files/ficheropeliculas");
				 BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(f));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 String linea = null;
				try {
					linea = br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					while (linea !=null) { 
		                if (linea.contains(textField_1.getText())) {  
		                    linea = "";
		                }
		            }
			}
		});
		btnNewButton.setBounds(171, 205, 100, 32);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("imagen/fondo.jpg"));
	}

}
