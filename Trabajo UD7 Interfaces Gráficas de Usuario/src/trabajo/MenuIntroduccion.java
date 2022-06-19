package trabajo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuIntroduccion {

	private JFrame frmMenDeBienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuIntroduccion window = new MenuIntroduccion();
					window.frmMenDeBienvenida.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MenuIntroduccion() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frmMenDeBienvenida = new JFrame();
		frmMenDeBienvenida.setForeground(Color.BLACK);
		frmMenDeBienvenida.setResizable(false);
		frmMenDeBienvenida.setTitle("Men\u00FA de Bienvenida");
		frmMenDeBienvenida.setBounds(100, 100, 450, 300);
		frmMenDeBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenDeBienvenida.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("BIENVENIDO!!!");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(133, 60, 215, 33);
		frmMenDeBienvenida.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		BufferedImage bufferedImage = ImageIO.read(new File("imagen/imagenfondo.png"));
		Image imagenfondo = bufferedImage.getScaledInstance(450, 260, Image.SCALE_DEFAULT);
		ImageIcon imagen = new ImageIcon(imagenfondo);
		lblNewLabel_1.setIcon(imagen);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmMenDeBienvenida.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Registarse");
		btnNewButton.setBounds(114, 132, 98, 44);
		frmMenDeBienvenida.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Registrarse r=new Registrarse();
				r.main(null);
				frmMenDeBienvenida.dispose();
			}
			
		});
		
		JButton btnIniciarSesin = new JButton("Iniciar sesi\u00F3n ");
		btnIniciarSesin.setBounds(244, 132, 121, 44);
		frmMenDeBienvenida.getContentPane().add(btnIniciarSesin);
		frmMenDeBienvenida.setLocationRelativeTo(null);

	}
}
