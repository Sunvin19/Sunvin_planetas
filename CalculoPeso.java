/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1trimestre;

import java.util.Scanner;

/**
 *
 * @version 1.0
 * @author Kevin Piedra
 */
public class CalculoPeso {

    public static void calcularPeso() {
        /*
        * El métdodo contiene el cáluco de peso o fuerza total del astronauta en Marte.
        * Tambíen tiene el proceso de cerrar el bucle con la letra n.
        * Y por último instrucciones claras.
         */
        char continuar = 'n';//Aquí tenemos el carácter que necesitamos para salir del programa.        
        double masa, fuerzatotal;
        final double GRAVEDADMARTE = 3.72; 
        final double GRAVEDADTIERRA = 9.81; 
        final double GRAVEDADJUPITER = 24.79;
        final double GRAVEDADSATURNO = 10.44;
        final double GRAVEDADPLUTON =  0.66;
        final double GRAVEDADURANO = 8.87;//Aquí tenemos las variables masa, fuerza total y la constantes de gravedades.
        System.out.println("Buenas, calculemos el peso del astronauta en diferentes astros espaciales.");
        Scanner teclado = new Scanner(System.in);//Declaramos los escáners necesarios para el programa.
        Scanner tecladoContinuar = new Scanner(System.in);
        Scanner tecladoPlaneta = new Scanner(System.in);

        /*
        * Después de las declaraciones empieza el bucle.
        * Tendremos comentarios para guiar al usuario, la operación y el método de salida del programa.
        * Se usa un do while para el bucle.
         */
        do {
            System.out.println("\nLas opciones que tienes son: Marte(1), La Tierra(2), Jupiter(3), Saturno(4) y Plutón(5).");
            System.out.println("\nPor favor elija un número.");
            String planeta = tecladoPlaneta.nextLine();
            
            switch (planeta) {
                case "1":
                    System.out.println("Has escogido clacular el peso de Marte.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADMARTE;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                case "2":
                    System.out.println("Has escogido clacular el peso de La Tierra.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADTIERRA;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                case "3":
                    System.out.println("Has escogido clacular el peso de Jupiter.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADJUPITER;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                case "4":
                    System.out.println("Has escogido clacular el peso de Saturno.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADSATURNO;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                case "5":
                    System.out.println("Has escogido clacular el peso de Pluton.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADPLUTON;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                default:
                    System.out.println("No es posible con lo que has escrito, lo siento.");
                case "6":
                    System.out.println("Has escogido clacular el peso de Urano.");
                    System.out.println("\nPonga la masa del astronauta en kg: ");
                    masa = teclado.nextDouble();//Pedimos que intoduzca la masa el usuario.
                    fuerzatotal = masa * GRAVEDADURANO;//El cálculo de la operación.
                    System.out.println("\nEl peso es de: " + fuerzatotal + " Newtons");
                    break;
                default:
                    System.out.println("No es posible con lo que has escrito, lo siento.");

            }
            System.out.println("\n¿Quieres continuar?");
            System.out.println("Para no repetirlo ponga n.");
            continuar = tecladoContinuar.next().charAt(0);//La declaración de salida del programa.
        } while (continuar != 'n');//Cerramos bucle.
        System.out.println("Gracias por usar este programa.");

        teclado.close();//Cerramos los teclados usados.
        tecladoContinuar.close();
        tecladoPlaneta.close();
        /*
        * Y este sería el final del programa.
         */
    }
}
