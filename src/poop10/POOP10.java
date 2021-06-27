/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author Miguel Lozano
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mensajes[] = {"Primero", "Segundo", "Tercero"};
        try{
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: Tu apuntador está fuera de rango");
        }
        
        System.out.println("#####################Ej2#####################");
        
        try{
            int a=8, b=7;
            float c = (float) a/b;
            System.out.println("C = "+c);
        }catch(ArithmeticException ae){
            System.out.println("Error: Dividiste entre cero");
        }finally{
            System.out.println("A pesar de todo este bloque se ejecuta");
        }
        System.out.println("#####################Ej3#####################");
        //Try Catch anidados
        //Siempre debe ir de lo más particular a lo general
        
        try{
            int d = 99/0;
            System.out.println("D = "+d);
        }catch(ArithmeticException ae){
            System.out.println("Error: Dividiste entre cero");
        }catch(Exception e){
            System.out.println("Error Exception general");
        }finally{
            System.out.println("El bloque finally siempre see ejecuta");
        }
        System.out.println("#####################Ej4#####################");
        
        try{
            int division = metodoPropagaExc(55,0);
            System.out.println("Division "+division);
        }catch(ArithmeticException ae){
            System.out.println("Exception aritmetica arrojada: ");
            //ae.printStackTrace();
        }
    }
    
    public static int metodoPropagaExc(int x, int y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }
    
}

