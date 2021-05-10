/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triisconbot;

/**
 *
 * @author apasi
 */
public class Vittoria {
    public Vittoria(int numero){
        Menù menu= new Menù();
        switch(numero){
            case 1:
                System.out.println(":: X ha vinto ::");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
            case 2:
                System.out.println(":: O ha vinto ::");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
            case 3:
                System.out.println(":: Pareggio ::");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
        }
        
        menu.setVisible(true);
    }
}