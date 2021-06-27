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
public class CuentaBancaria {
    
    private double saldo;
    private int count;

    public CuentaBancaria() {
        saldo = 0;
    }

    public void getSaldo() {
        System.out.println("Saldo $"+saldo);
    }
    
    public void depositar(double monto)throws IngresoMaximoException {
        System.out.println("Depositando $"+ monto+" pesos");
        if (monto > 20000)
            throw new IngresoMaximoException();
        else{
            saldo+=monto;
        }
    }
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosMaximosException{
        System.out.println("Retirando $"+monto);
        count+=1;
        if (saldo < monto)
            throw new SaldoInsuficienteException();
        else if(count > 3){
            throw new RetirosMaximosException();
        }else{
            saldo -=monto;
        }
    }
    
}
