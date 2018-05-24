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
public class LiebreThread implements Runnable {

    public LiebreThread() {
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("arranco la liebre");
        while (i < 15) {
            try {
                Thread.sleep((long) (Math.random() * 2000));
                System.out.println("soy la liebre");
            } catch (InterruptedException ex) {
            }
            i++;
        }
    }
}
