package katafizzbuzz;
public class fizzbuzz {
    private int numero;
    private String estado;    
public fizzbuzz(){    
}
public fizzbuzz(int numero){
    this.numero=numero;
}
public int getNumero(int numero){  
    return numero;
}    
public String dameEstado() {
    int contador=0;
    estado= String.valueOf(numero);    
    String textonumero=(String) estado;
       
        if (numero%5==0) {
            estado="Buzz"; 
        }
        if (numero%3==0 || textonumero.contains("3")) {
           estado="Fizz";   
        }
        if (numero%3==0&&numero%5==0){
            estado="FizzBuzz"; 
        }  
       
        return estado;
    }








    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    
    

}
