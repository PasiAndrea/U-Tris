/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triisconbot;

import javax.swing.JOptionPane;

/**
 *
 * @author apasi
 */
public class Vittoria {
    public Vittoria(int numero){
        Menù menu= new Menù();
        switch(numero){ 
            case 1:
                JOptionPane.showMessageDialog(null,"hai vinto ");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Il bot ha vinto");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pareggio");
                TrisIA.setDefaultLookAndFeelDecorated(false);
                break;
        }
        
        menu.setVisible(true);
    }
}