package Rol;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class FormularioPnj extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPnj frame = new FormularioPnj(null, null);
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
	public FormularioPnj(ArrayList<Raza> razas, ArrayList<Personaje> pnjs) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 730);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombrePnj = new JLabel("Nombre del personaje:");
		lblNombrePnj.setForeground(new Color(255, 255, 255));
		lblNombrePnj.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblNombrePnj.setBounds(119, 103, 241, 28);
		contentPane.add(lblNombrePnj);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(146, 142, 170, 28);
		contentPane.add(textField);
		
		JLabel lblClase = new JLabel("Raza:");
		lblClase.setForeground(new Color(255, 255, 255));
		lblClase.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblClase.setBounds(207, 217, 67, 37);
		contentPane.add(lblClase);
		
		JComboBox<String> comboBoxClase = new JComboBox<>();
		comboBoxClase.setBounds(146, 377, 170, 28);
		contentPane.add(comboBoxClase);
		
		comboBoxClase.addItem("Mago");
		comboBoxClase.addItem("Guerrero");
		
		JLabel lblRaza = new JLabel("Clase:");
		lblRaza.setForeground(new Color(255, 255, 255));
		lblRaza.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblRaza.setBounds(207, 337, 67, 37);
		contentPane.add(lblRaza);
		
		JComboBox<String> comboBoxRaza = new JComboBox<>();
		comboBoxRaza.setBounds(177, 258, 117, 30);
		contentPane.add(comboBoxRaza);
		
		for(Raza raza : razas) {
			comboBoxRaza.addItem(raza.getNombre());
		}
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnGuardar.setBounds(136, 471, 193, 37);
		contentPane.add(btnGuardar);
		
		
		
		btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	for (Personaje pnj : pnjs) {
					if (pnj.getNombre().equals(textField.getText())) {
						JOptionPane.showMessageDialog(FormularioPnj.this, "El Pnj que intentas guardar ya existe", "Error", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
				}
            	
            	Personaje nuevoPnj = null;

            	Caracteristicas caracteristicas = new Caracteristicas();
        		caracteristicas.generarCaracteristicas();
 
                Raza razaTemp = null;

        		for(Raza raza : razas) {
        			if (raza.getNombre().equals(comboBoxRaza.getSelectedItem()))
        				razaTemp = raza;
        		}
        		
        		if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Fue"))
					caracteristicas.setFuerza(caracteristicas.getFuerza() + razaTemp.getBonificador());
				else if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Des"))
					caracteristicas.setDestreza(caracteristicas.getDestreza() + razaTemp.getBonificador());
				else if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Con"))
					caracteristicas.setConstitucion(caracteristicas.getConstitucion() + razaTemp.getBonificador());
				else if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Int"))
					caracteristicas.setInteligencia(caracteristicas.getInteligencia() + razaTemp.getBonificador());
				else if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Sab"))
					caracteristicas.setSabiduria(caracteristicas.getSabiduria() + razaTemp.getBonificador());
				else if (razaTemp.getCaracteristicaBonificacion().equalsIgnoreCase("Car"))
					caracteristicas.setCarisma(caracteristicas.getCarisma() + razaTemp.getBonificador());
        		
        		
                if (((String)comboBoxClase.getSelectedItem()).equalsIgnoreCase("mago"))
                	nuevoPnj = new Personaje(textField.getText(), caracteristicas, new Mago(), razaTemp, false);
                else if (((String)comboBoxClase.getSelectedItem()).equalsIgnoreCase("guerrero"))
                	nuevoPnj = new Personaje(textField.getText(), caracteristicas, new Guerrero(), razaTemp, false);
                
                if (nuevoPnj != null) 
                	pnjs.add(nuevoPnj);    
                
                // Mostrar un mensaje de confirmación de guardado
		        JOptionPane.showMessageDialog(FormularioPnj.this, "El Pnj se ha guardado correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
		
		JButton btnVolver = new JButton("Volver al menú de creación");
		btnVolver.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnVolver.setBounds(75, 571, 318, 39);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(e -> dispose());
		
		ImageIcon imagenFondo = new ImageIcon("Media/ImgFormularioPnj.jpg");
        Image img = imagenFondo.getImage();
        Image scaledImg = img.getScaledInstance(485, 730, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
		
        JLabel lblFondo = new JLabel(scaledIcon);
        lblFondo.setBounds(0, 0, 485, 730);
        contentPane.add(lblFondo);
	}
}
