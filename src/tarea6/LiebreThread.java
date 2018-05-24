/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

import java.util.logging.Level;
import java.util.logging.Logger;
import static tarea6.TortugaThread.contTortuga;

/**
 *
 * @author Wilmata
 */
public class LiebreThread implements Runnable {

    public LiebreThread() {
    }

    public static int contLiebre = 0;

    @Override
    public void run() {
        int aleatoria = (int) (Math.random() * 50) + 0;
        int contador = 0;
        System.out.println("¡La liebre empieza la carrera!");

        while (contador <= 50) {
            contLiebre = contador;
            System.out.println("La liebre va por el metro: " + contador);
            try {
                Thread.sleep(750);

                if (contador + 1 == aleatoria) {
                    System.out.println("¡La liebre se ha quedado dormida! ");
                    boolean centinela = true;
                    do {
                        if (contTortuga < contador) {
                            Thread.sleep(1500);
                            
                        }else{
                            centinela = false;
                            System.out.println("¡La liebre ha despertado y sigue la carrera!");
                        }
                    } while (centinela == true);
                        
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(TortugaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador++;
        }
        System.out.println("¡La liebre ha llegado a la meta!");
    }
}
