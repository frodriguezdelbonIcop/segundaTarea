package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int Sjugador1 = 1000;
		int Sjugador2 = 1000;
		int Tjugador1 = 10;
		int Tjugador2 = 10;
		int Gsaldo1 = 0;
		int Gsaldo2 = 0;
		int pozo = 0;
		boolean terminado = false; 
		int incognita = (int)(Math.random()*(1-100+1)+100);
		
		System.out.println(incognita);
		
		System.out.println("funciona");
		
		while (!terminado) {		
			
			System.out.println("Jugador 1 ingrese el saldo a gastar");
			Gsaldo1 = sc.nextInt();
			
			System.out.println("Jugador 2 ingrese el saldo a gastar");
			Gsaldo2 = sc.nextInt();
			System.out.println("Jugador 1 ¿Quieres doblar la apuesta? 'si' o 'no' ");
			String doblar1 = sc.next();
			if(doblar1 == "si") {
				Gsaldo1 *= 2;
			}
			System.out.println("Jugador 2 ¿Quieres doblar la apuesta? 'si' o 'no' ");
			String doblar2 = sc.next();
			if(doblar2 == "si") {
				Gsaldo2 *= 2;
			}
			
			System.out.println("Jugador 1 ingrese el número entre 1 y 100");
			int numero1 = sc.nextInt();
			System.out.println("Jugador 2 ingrese el número 1 y 100");
			int numero2 = sc.nextInt();
			
			
			if(numero1 == incognita) {
				System.out.println("El jugador 1 ha ganado el juego");
				break;
			}else {
				if(numero1>incognita) {
					System.out.println("El numero ingresado es mayor a la incognita");
					}else {
						System.out.println("El numero ingresado es menor a la incognita");
					}
			}
			if(numero2 == incognita) {
				System.out.println("El jugador 2 ha ganado el juego");
				break;
			}else {
				if(numero2>incognita) {
					System.out.println("El numero ingresado es mayor que la incognita");
					}else {
						System.out.println("El numero ingresado es menor que la incognita");
					}
			}
			
			

			
			 Sjugador1 -= Gsaldo1;
			 Sjugador2 -= Gsaldo2;
			 
			 if(Sjugador1<50) {
				 System.out.println("El jugador 1 se ha quedado sin saldo. No hay ganador");
				 break;
			 }
			 if(Sjugador2<50) {
				 System.out.println("El jugador 2 se ha quedado sin saldo. No hay ganador");
				 break;
			 }
			 pozo += Gsaldo1+Gsaldo2;

			 Tjugador1 -= 1;
			 Tjugador2 -= 1;
			 
			 if(Tjugador1 == 0) {
				 System.out.println("El jugador 1 se ha quedado sin tiradas. No hay ganador");
				 break;
			 }
			 if(Tjugador2 == 0) {
				 System.out.println("El jugador 2 se ha quedado sin tiradas. No hay ganador");
				 break;
			 }
			 Gsaldo1 = 0;
			 Gsaldo2 = 0;
		}
		
		System.out.println("Estadisticas Jugador 1: Saldo restante: "+Sjugador1+" Tiradas restantes: "+Tjugador1+" última apuestA: "+Gsaldo1);
		System.out.println("Estadisticas Jugador 2: Saldo restante: "+Sjugador2+" Tiradas restantes: "+Tjugador2+" última apuestA: "+Gsaldo2);
		System.out.println("La incognita era: "+incognita);

	}
	

	


}
