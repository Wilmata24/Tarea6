/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wilmata
 */
public class TortugaThread implements Runnable {

     LiebreThread liebre = new LiebreThread();
    
    public static int contTortuga = 0;
    
    public TortugaThread() {
    }

    @Override
    public void run() {
        int contador = 0;
        System.out.println("¡La tortuga empieza la carrera!");
        while (contador <  51) {
             contTortuga=contador;
            try {
                Thread.sleep(1500);
                System.out.println("La tortuga va por el metro: " + contador);
            } catch (InterruptedException ex) {
                Logger.getLogger(TortugaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador++;
        }
        System.out.println("¡La tortuga ha llegado a la meta!");
    }

}
