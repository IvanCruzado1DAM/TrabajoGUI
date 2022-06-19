package trabajo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Insertarpelicula {

	private JFrame frame;
	private JTextField txtInsertarPelcula;
	private JTextField txtNombre;
	private JTextField textField_1;
	private JTextField txtGnero;
	private JTextField textField_3;
	private JTextField txtAo;
	private JTextField textField_5;
	private JTextField txtPas;
	private JTextField textField_7;
	private JTextField txtCartula;
	private JTextField textField_9;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insertarpelicula window = new Insertarpelicula();
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
	public Insertarpelicula() {
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
		txtInsertarPelcula.setText("Insertar Pel\u00EDcula");
		txtInsertarPelcula.setEditable(false);
		txtInsertarPelcula.setBounds(147, 11, 156, 31);
		frame.getContentPane().add(txtInsertarPelcula);
		txtInsertarPelcula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre ");
		txtNombre.setEditable(false);
		txtNombre.setBounds(88, 63, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(254, 63, 86, 20);
		frame.getContentPane().add(textField_1);
		
		txtGnero = new JTextField();
		txtGnero.setEditable(false);
		txtGnero.setText("G\u00E9nero");
		txtGnero.setColumns(10);
		txtGnero.setBounds(88, 94, 86, 20);
		frame.getContentPane().add(txtGnero);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(254, 94, 86, 20);
		frame.getContentPane().add(textField_3);
		
		txtAo = new JTextField();
		txtAo.setEditable(false);
		txtAo.setText("A\u00F1o");
		txtAo.setColumns(10);
		txtAo.setBounds(88, 125, 86, 20);
		frame.getContentPane().add(txtAo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(254, 125, 86, 20);
		frame.getContentPane().add(textField_5);
		
		txtPas = new JTextField();
		txtPas.setEditable(false);
		txtPas.setText("Pa\u00EDs");
		txtPas.setColumns(10);
		txtPas.setBounds(88, 156, 86, 20);
		frame.getContentPane().add(txtPas);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(254, 156, 86, 20);
		frame.getContentPane().add(textField_7);
		
		txtCartula = new JTextField();
		txtCartula.setText("Car\u00E1tula");
		txtCartula.setEditable(false);
		txtCartula.setColumns(10);
		txtCartula.setBounds(88, 187, 86, 20);
		frame.getContentPane().add(txtCartula);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(254, 187, 86, 20);
		frame.getContentPane().add(textField_9);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaPeliculas lp=new ListaPeliculas();
				lp.añadePelicula(new Pelicula(textField_1.getText(),textField_3.getText(),textField_5.getText(),textField_7.getText(),textField_9.getText()));
				JOptionPane.showMessageDialog(null, "Película añadida");
				try {
					lp.salvarArrayList();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(160, 218, 100, 32);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("imagen/fondo.jpg"));
	}

}
