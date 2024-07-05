package Rol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Rol {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Raza> razas = new ArrayList<>();
	ArrayList<Personaje> personajes = new ArrayList<>(); 
	
	
	public void crearPj() {
		Personaje pj = new Personaje();
		
		System.out.println("Introduce el nombre de tu personaje: ");
		pj.setNombre(scan.nextLine());
		
		Caracteristicas caracteristicas = new Caracteristicas();
		caracteristicas.generarCaracteristicas();
		pj.setCaracteristicas(caracteristicas);
		
		System.out.println("Elige una raza: ");
		for(int i=0; i<razas.size(); i++)
			System.out.println((i + 1) + " " + razas.get(i).getNombre());
		
		System.out.println("Selecciona una raza (ingresa el número): ");
		
		pj.setRaza(razas.get(scan.nextInt()));
		
		System.out.println("Indica la clase de tu pj: ");
		String profesion = scan.nextLine();
		
		if (profesion.equalsIgnoreCase("mago"))
			pj.setProfesion(new Mago());
		else if (profesion.equalsIgnoreCase("guerrero"))
			pj.setProfesion(new Guerrero());
		
		
		pj.setJugador(true);
		
		personajes.add(pj);
	}
	
	public void crearPnj() {
		Personaje pnj = new Personaje();
		
		System.out.println("Introduce el nombre del npc: ");
		pnj.setNombre(scan.nextLine());
		
		pnj.setCaracteristicas(new Caracteristicas());
		
		System.out.println("Indica la clase del npc: ");
		String profesion = scan.nextLine();
		
		if (profesion.equalsIgnoreCase("mago"))
			pnj.setProfesion(new Mago());
		else if (profesion.equalsIgnoreCase("guerrero"))
			pnj.setProfesion(new Guerrero());
		
		System.out.println("Elige una raza: ");
		for(int i=0; i<razas.size(); i++)
			System.out.println((i + 1) + " " + razas.get(i).getNombre());
		
		System.out.println("Selecciona una raza (ingresa el número): ");
		
		pnj.setRaza(razas.get(scan.nextInt()));
		
		pnj.setJugador(false);
		
		personajes.add(pnj);
	}
	
	public void visualizarPersonajes() {
		for(int i=0; i<personajes.size(); i++)
			System.out.println((i + 1) + " " + personajes.get(i).getNombre());
	}

	public static void main(String[] args) {
			
	}
	
	// "se realizarán las tiradas en orden". No entiendo que quiere que hag	// Crear un arrayList extra para los pnj??
	// "llamaremos al segundo constructor pasándole el atributo de jugador como si". No entiendo esa orden.
	// Donde ponemos los metodos? en el main o  en sus respectivas clases
}
