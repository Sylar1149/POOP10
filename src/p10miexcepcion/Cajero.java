/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author Miguel Lozano
 */
public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        try{
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            
            cuenta.depositar(2000);
            cuenta.getSaldo();
            cuenta.depositar(3000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
            cuenta.retirar(300);
            cuenta.getSaldo();
            cuenta.retirar(200);
            cuenta.getSaldo();
            
        }catch(SaldoInsuficienteException sie){
            System.out.println("Error, no tienes tienes tanto dinero");
        }catch(IngresoMaximoException ime){
            System.out.println("Error, no puedes ingresar más de $20,000 pesos");
        }catch(RetirosMaximosException rme){
            System.out.println("Error, solo se puede retirar hasta 3 veces");
        }
        //No pueden ingresar más de 20,000
        //Solo pueden realizar maximo 3 retiros
    }
}

