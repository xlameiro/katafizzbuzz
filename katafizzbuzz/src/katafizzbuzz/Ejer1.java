//33 alumnos
package katafizzbuzz;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        int contador=0;
    
        do{
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero");
        fizzbuzz prueba=new fizzbuzz(entrada.nextInt());
        System.out.println(prueba.dameEstado());
        contador++;
        }while(contador<33);
    }  
}
