package Rol;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interfaz_Rol extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	ArrayList<Personaje> pnjs = new ArrayList<>();
	ArrayList<Personaje> pjs = new ArrayList<>();
	ArrayList<Raza> razas = new ArrayList<>();
	
	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Rol frame = new Interfaz_Rol();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Create the frame
	public Interfaz_Rol() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVisualizar = new JButton("VISUALIZAR");
		btnVisualizar.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		btnVisualizar.setBounds(340, 535, 304, 73);
		contentPane.add(btnVisualizar);
		
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Visualizar visualizar = new Visualizar(pjs, pnjs);
				
				visualizar.setVisible(true);
			}
		});
		
		JButton btnCrearPnj = new JButton("CREAR PNJ");
		btnCrearPnj.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		btnCrearPnj.setBounds(340, 383, 304, 73);
		contentPane.add(btnCrearPnj);
		
		btnCrearPnj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormularioPnj formularioPnj = new FormularioPnj(razas, pnjs);
				
				formularioPnj.setVisible(true);
			}
		});
		
		JButton btnPj = new JButton("CREAR JUGADOR");
		btnPj.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		btnPj.setBounds(340, 231, 304, 73);
		contentPane.add(btnPj);
		
		btnPj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormularioPj formularioPj = new FormularioPj(razas, pjs);
				
				formularioPj.setVisible(true);
			}
		});
		
		JButton btnCrearRaza = new JButton("CREAR RAZA");
		btnCrearRaza.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		btnCrearRaza.setBounds(340, 79, 304, 73);
		contentPane.add(btnCrearRaza);
		
		btnCrearRaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormularioRaza formularioRaza = new FormularioRaza(razas);
				
				formularioRaza.setVisible(true);
			}
		});
		
		ImageIcon imagenFondo = new ImageIcon("Media/ImgInterfaz_Rol.jpg");
        Image img = imagenFondo.getImage();
        Image scaledImg = img.getScaledInstance(1001, 730, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
		
        JLabel lblFondo = new JLabel(scaledIcon);
        lblFondo.setBounds(0, 0, 1001, 730);
        contentPane.add(lblFondo);
	}
}
