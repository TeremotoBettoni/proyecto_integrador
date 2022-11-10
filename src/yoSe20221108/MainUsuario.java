package yoSe20221108;

import java.util.Scanner;

public class MainUsuario {

	public static void main(String[] args) {
		// primero llamamos a los objetos
		
		Usuario usuario = new Usuario();	

		System.out.println("*Ingreso de datos de nuevo de usuario*");
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("***********************");
			System.out.println("Ingresa nombre");
			usuario.setNombre(sc.next());
			
			System.out.println("***********************");
			System.out.println("Ingresa apellido");
			usuario.setApellido(sc.next());
			
			System.out.println("***********************");
			System.out.println("Ingresa email");
			usuario.setEmail(sc.next());
			
			System.out.println("***********************");
			System.out.println("Ingresa contraseña");
			usuario.setContraseña(sc.next());
		
			System.out.println("***********************");
			System.out.println("Confirmar contraseña");
			usuario.setContraseñaconfirm(sc.next());
			
			if (usuario.getContraseñaconfirm() == usuario.getContraseña()) {
				System.out.println("Usuario ingresado con exito - Ahora inicie secion");
			}else {
				System.out.println("Contraseña ingresada no coincide");
			}
		}
		
		System.out.println(usuario);

	}

}
