package katafizzbuzz;

public class fizzbuzz {
    private int numero;
    private String estado;
    
public fizzbuzz(){
    
}    
public fizzbuzz(int numero){
    this.numero=numero;
    int contador=0;
     if(numero%3==0){
            estado="Fizz";
        }else if(numero%5==0){
            estado="Buzz";
        }else 
            estado= String.valueOf(numero);
        contador++;
}    
    public String getNumero() {
        return estado;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}