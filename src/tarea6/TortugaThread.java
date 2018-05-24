/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

/**
 *
 * @author Wilmata
 */
public class TortugaThread implements Runnable {

    public TortugaThread() {
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("arranco la tortuga");
        while (i < 15) {
            try {
                Thread.sleep(5000);
                System.out.println("soy la tortuga");
            } catch (InterruptedException ex) {
            }
            i++;
        }
        System.out.println("termina la tortuga");
    }

}
