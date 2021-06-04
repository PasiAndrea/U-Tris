
package trisproject;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Online extends javax.swing.JFrame {
    static Scanner sc= new Scanner(System.in);
    static Random random = new Random();
    ServerTris server;
    ClientTris client;
    static String stringaPosizione = "0";
    Griglia griglia; 
    
    public Online() {
        initComponents();
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonServer = new javax.swing.JButton();
        buttonClient = new javax.swing.JButton();
        jText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonServer.setText("Manda una richiesta");
        buttonServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonServerActionPerformed(evt);
            }
        });

        buttonClient.setText("Ricevi una richiesta");
        buttonClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientActionPerformed(evt);
            }
        });

        jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Insericsci indirizzo IP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonServer, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(buttonClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonServer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(buttonClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonServerActionPerformed
        // TODO add your handling code here:        
        if(jText.getText().equals("")){
            jLabel1.setText("Inserisci l'indirizzo per mandare la richiesta");
        }
        else {
            client= new ClientTris(jLabel1.getText());
            Client();
        }
            
    }//GEN-LAST:event_buttonServerActionPerformed

    private void jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextActionPerformed

    private void buttonClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientActionPerformed
        griglia = new Griglia();
        server = new ServerTris();
        Server();
        
    }//GEN-LAST:event_buttonClientActionPerformed

    // ---------------------------------------------------
    void inizio(){
        boolean inizio= random.nextBoolean();
        //
        if(inizio){
        }
        else{
        }

    }
    
    void Server(){
        
        String posizione;
        //server = new ServerTris();
        posizione=server.letturaClient();
        System.out.println(posizione);
                
        while(!griglia.casellePiene()){
            posizione = server.letturaClient();
            switch(posizione){
                case "1":
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setForeground(Color.red);
                    griglia.jButton1.setEnabled(false);
                    break;
                case "2":
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setForeground(Color.red);
                    griglia.jButton2.setEnabled(false);
                    break;
                case "3":
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setForeground(Color.red);
                    griglia.jButton3.setEnabled(false);
                    break;
                case "4":
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setForeground(Color.red);
                    griglia.jButton4.setEnabled(false);
                    break;
                case "5":
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setForeground(Color.red);
                    griglia.jButton5.setEnabled(false);
                    break;
                case "6":
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setForeground(Color.red);
                    griglia.jButton6.setEnabled(false);
                    break;
                case "7":
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setForeground(Color.red);
                    griglia.jButton7.setEnabled(false);
                    break;
                case "8":
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setForeground(Color.red);
                    griglia.jButton8.setEnabled(false);
                    break;
                case "9":
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setForeground(Color.red);
                    griglia.jButton9.setEnabled(false);
                    break;
            }
            while("".equals(Griglia.posizione)){
                posizione = griglia.posizione;
                server.scritturaClient(posizione);
            }
            posizione = "";
        }
        griglia.controlloVittoria();
    }
    
    void Client(){
        String s=null;
        //client = new ClientTris(jLabel1.getText());
        s=sc.nextLine();
        client.ScritturaServer(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClient;
    private javax.swing.JButton buttonServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jText;
    // End of variables declaration//GEN-END:variables

    private void paintComponents(Griglia griglia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
