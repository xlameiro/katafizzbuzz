/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw115
 */
public class fizzbuzzTest {
    
 
    
    @Test
        public void testfizzbuzzdevuelvenumero(){
        fizzbuzz fb=new fizzbuzz();
        int result=fb.getNumero(2);
         assertEquals(2,result);
       }
    @Test
        public void testfizzbuzzdevuelvenumero2(){
        fizzbuzz fb=new fizzbuzz();
        int result=fb.getNumero(1);
         assertEquals(1,result);
       }
    @Test
        public void testfizzbuzzdevuelvenumero3(){
        fizzbuzz fb=new fizzbuzz(3);
        String result=fb.dameEstado();
         assertEquals("Fizz",result);
       }
    @Test
        public void testfizzbuzzdevuelvenumero4(){
        fizzbuzz fb=new fizzbuzz(6);
        String result=fb.dameEstado();
         assertEquals("Fizz",result);
       }
    @Test
        public void testfizzbuzzdevuelvenumero5(){
        fizzbuzz fb=new fizzbuzz(5);
        String result=fb.dameEstado();
         assertEquals("Buzz",result);
       }
    @Test
        public void testfizzbuzzdevuelvenumero6(){
        fizzbuzz fb=new fizzbuzz(15);
        String result=fb.dameEstado();
         assertEquals("FizzBuzz",result);
       }
    
        @Test
        public void testfizzbuzzdeContiene3devuelvefizz(){
        fizzbuzz fb=new fizzbuzz(13);
        String result=fb.dameEstado();
         assertEquals("Fizz",result);
       }
}
