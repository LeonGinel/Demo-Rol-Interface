package Rol;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Visualizar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizar frame = new Visualizar(null, null);
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
	public Visualizar(ArrayList<Personaje> pjs, ArrayList<Personaje> pnjs) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 921, 568);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPjsCreados = new JLabel("PJs creados:");
		lblPjsCreados.setForeground(new Color(255, 255, 255));
		lblPjsCreados.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblPjsCreados.setBounds(391, 166, 129, 28);
		contentPane.add(lblPjsCreados);
		
		JComboBox<String> comboBoxPjs = new JComboBox<>();
		comboBoxPjs.setBounds(366, 214, 174, 30);
		contentPane.add(comboBoxPjs);
		
		for(Personaje pj : pjs) {
			comboBoxPjs.addItem(pj.getNombre());
		}
		
		JLabel lblPnjsCreados = new JLabel("PNJs creados:");
		lblPnjsCreados.setForeground(new Color(255, 255, 255));
		lblPnjsCreados.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblPnjsCreados.setBounds(380, 282, 143, 28);
		contentPane.add(lblPnjsCreados);
		
		JComboBox<String> comboBoxPnjs = new JComboBox<>();
		comboBoxPnjs.setBounds(366, 330, 174, 30);
		contentPane.add(comboBoxPnjs);
		
		for(Personaje pnj : pnjs) {
			comboBoxPnjs.addItem(pnj.getNombre());
		}
		
		JLabel lblPj = new JLabel("PJ");
		lblPj.setForeground(new Color(255, 255, 255));
		lblPj.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblPj.setBounds(125, 75, 32, 32);
		contentPane.add(lblPj);
		
		JLabel lblPnj = new JLabel("PNJ");
		lblPnj.setForeground(new Color(255, 255, 255));
		lblPnj.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblPnj.setBounds(740, 75, 50, 32);
		contentPane.add(lblPnj);
		
		JList<String> listPj = new JList<>();
		listPj.setBounds(42, 118, 201, 322);
		contentPane.add(listPj);
		
		DefaultListModel<String> detallesPj = new DefaultListModel<>();
		listPj.setModel(detallesPj);
		
		comboBoxPjs.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	detallesPj.clear();
	            	Object selectedItem = comboBoxPjs.getSelectedItem();
					int indice = comboBoxPjs.getSelectedIndex();
						if (selectedItem != null) {
						Personaje pjSeleccionado = pjs.get(indice);
						detallesPj.addElement(getFormattedDetails(pjSeleccionado));
					}
	            }
		});
        
		JList<String> listPnj = new JList<>();
		listPnj.setBounds(653, 118, 202, 322);
		contentPane.add(listPnj);
		
		DefaultListModel<String> detallesPnj = new DefaultListModel<>();
		listPnj.setModel(detallesPnj);
		
		comboBoxPnjs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	detallesPnj.clear();
            	Object selectedItem = comboBoxPnjs.getSelectedItem();
            	int indice = comboBoxPnjs.getSelectedIndex();
					if (selectedItem != null) {
					Personaje pnjSeleccionado = pnjs.get(indice);
					detallesPnj.addElement(getFormattedDetails(pnjSeleccionado));
				}
            }
		});
		
		JButton btnVolver = new JButton("Volver al menú de creación");
		btnVolver.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnVolver.setBounds(297, 441, 311, 39);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(e -> dispose());
		
		ImageIcon imagenFondo = new ImageIcon("Media/ImgVisualizar.jpg");
        Image img = imagenFondo.getImage();
        Image scaledImg = img.getScaledInstance(921, 568, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
		
        JLabel lblFondo = new JLabel(scaledIcon);
        lblFondo.setBounds(0, 0, 921, 568);
        contentPane.add(lblFondo);
	}
	
	// Método para obtener los detalles formateados del personaje
	private String getFormattedDetails(Personaje personaje) {
		Raza raza = personaje.getRaza();
	    Profesion profesion = personaje.getProfesion();
	    Caracteristicas caracteristicas = personaje.getCaracteristicas();
	    
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("Nombre: ").append(personaje.getNombre()).append("<br>");
        sb.append("Raza: ").append(raza.getNombre()).append("<br>");
        sb.append("Bonificación: ").append(raza.getCaracteristicaBonificacion()).append(": +").append(raza.getBonificador()).append("<br>");
        sb.append("Profesión: ").append(profesion.getNombre()).append("<br>");
        sb.append("Nivel: ").append(profesion.getNivel()).append("<br>");
        sb.append("Dados de golpe: ").append(profesion.getDadovida()).append("<br>");
        sb.append("Características:<br>").append("<ul>");
        sb.append("<li>Fuerza: ").append(caracteristicas.getFuerza()).append("</li>");
        sb.append("<li>Destreza: ").append(caracteristicas.getDestreza()).append("</li>");
        sb.append("<li>Constitución: ").append(caracteristicas.getConstitucion()).append("</li>");
        sb.append("<li>Inteligencia: ").append(caracteristicas.getInteligencia()).append("</li>");
        sb.append("<li>Sabiduría: ").append(caracteristicas.getSabiduria()).append("</li>");
        sb.append("<li>Carisma: ").append(caracteristicas.getCarisma()).append("</li>");
        sb.append("<li>Vida: ").append(caracteristicas.getVida()).append("</li>");
        sb.append("<li>Defensa: ").append(caracteristicas.getDefensa()).append("</li>");
        sb.append("</ul>");
        sb.append("Jugador: ").append(personaje.getJugador()).append("<br>");
        sb.append("</html>");
        return sb.toString();
    }
}
