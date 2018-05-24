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
public class Tarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread tortuga1 = new Thread(new TortugaThread()); //creación del proceso tortuga1
        Thread liebre1 = new Thread(new LiebreThread()); //creación del proceso liebre1

        tortuga1.start();
        //si quisiera asignarle más prioridad tortuga1.setPriority(Thread.MAX_PRIORITY);
        liebre1.start();
        //si quisiera asignarle menos prioridad liebre1.setPriority(Thread.MIN_PRIORITY);

    }
    
}
