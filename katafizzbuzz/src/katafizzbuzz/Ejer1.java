//33 alumnos
package katafizzbuzz;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int contador=0;
        do{
        System.out.println("Introduce un numero");
        int numero=entrada.nextInt();
//        if(numero%3==0&&numero%5==0){
//            System.out.println("Fizz y Buzz");
//        }
        if(numero%3==0){
            System.out.println("Fizz");
        }else if(numero%5==0){
            System.out.println("Buzz");
        }else 
            System.out.println(+numero);
        contador++;
        }while(contador<33);
        
        
        
        
        
    }
    
}
