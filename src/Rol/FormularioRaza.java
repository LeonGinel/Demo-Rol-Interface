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

public class FormularioRaza extends JFrame {

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
					FormularioRaza frame = new FormularioRaza(null);
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
	public FormularioRaza(ArrayList<Raza> razas) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 730);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreRaza = new JLabel("Nombre de la raza:");
		lblNombreRaza.setForeground(new Color(255, 255, 255));
		lblNombreRaza.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblNombreRaza.setBounds(136, 98, 193, 28);
		contentPane.add(lblNombreRaza);
		
		textField = new JTextField();
		textField.setBounds(146, 137, 170, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCaracteristicaBonificada = new JLabel("Caracteristica bonificada:");
		lblCaracteristicaBonificada.setForeground(new Color(255, 255, 255));
		lblCaracteristicaBonificada.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblCaracteristicaBonificada.setBounds(101, 215, 257, 37);
		contentPane.add(lblCaracteristicaBonificada);
		
		String[] CaracBonif = new String[] {"Fue", "Des", "Con", "Int", "Sab", "Car"};
		
		JComboBox<String> cmbCaracBonif = new JComboBox<>(CaracBonif);
		cmbCaracBonif.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		cmbCaracBonif.setBounds(192, 263, 72, 28);
		contentPane.add(cmbCaracBonif);
		
		JLabel lblBonificador = new JLabel("Bonificador:");
		lblBonificador.setForeground(new Color(255, 255, 255));
		lblBonificador.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblBonificador.setBounds(165, 337, 129, 37);
		contentPane.add(lblBonificador);
		
		Integer[] bonificador = new Integer[] {1, 2, 3};
		
		JComboBox<Integer> cmbBonificador = new JComboBox<>(bonificador);
		cmbBonificador.setMaximumRowCount(3);
		cmbBonificador.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		cmbBonificador.setBounds(208, 385, 35, 28);
		contentPane.add(cmbBonificador);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnGuardar.setBounds(136, 471, 193, 37);
		contentPane.add(btnGuardar);
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				for(Raza raza : razas) {
					if (raza.getNombre().equals(textField.getText())) {
						JOptionPane.showMessageDialog(FormularioRaza.this, "La raza que intentas guardar ya existe", "No se puede guardar", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
				}
				
				Raza nuevaRaza = new Raza(textField.getText(), (String)cmbCaracBonif.getSelectedItem(), (int)cmbBonificador.getSelectedItem());
				razas.add(nuevaRaza);
				
				// Mostrar un mensaje de confirmación de guardado
		        JOptionPane.showMessageDialog(FormularioRaza.this, "La raza se ha guardado correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JButton btnVolver = new JButton("Volver al menú de creación");
		btnVolver.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnVolver.setBounds(75, 571, 318, 39);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(e -> dispose());
		
		ImageIcon imagenFondo = new ImageIcon("Media/ImgFormularioRaza.jpg");
        Image img = imagenFondo.getImage();
        Image scaledImg = img.getScaledInstance(485, 730, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
		
        JLabel lblFondo = new JLabel(scaledIcon);
        lblFondo.setBounds(0, 0, 485, 730);
        contentPane.add(lblFondo);
	}
}

