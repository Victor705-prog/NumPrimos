/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numprimos;
//Prueba commit Hola como estas
import java.util.Scanner;

/**
 *
 * @author usuarioç
 */
public class NumPrimos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("*******Numeros Primo*******");
        System.out.println("***************************");
        
            System.out.println("Ingresa un numero");
            int numero = entrada.nextInt();

            if (numero <= 1){
                System.out.println("El numero debe ser mayor que 1");
            }else {

                boolean esPrimo =true;

                for(int i = 2; i <= Math.sqrt(numero); i++){
                    if(numero % i == 0){
                    esPrimo = false;
                    break;
                    }
                }

            if (esPrimo){
                System.out.println("El numero " + numero + " es primo");
            }else{
                System.out.println("El numero " + numero + " no es primo");

            }
            }    

    }
}
