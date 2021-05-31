package triisconbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TrisIA extends javax.swing.JFrame implements ActionListener{
    static Random random= new Random();
    static boolean controllo;
    static boolean inizio;
    static int i;
    static int n;
    ActionEvent b1;
    
    public TrisIA(String nome, int tema) {
        i=0;
        if(tema==0)
            getContentPane().setBackground(Color.white);
        if(tema==1)
            getContentPane().setBackground(Color.black);
        if(tema==2)
            getContentPane().setBackground(Color.pink);
        initComponents();
        inizio= random.nextBoolean();
        int numero= random.nextInt(9);
        if(!inizio){
            System.out.println(":: Inizia il bot ::");
            i++;
            switch(numero){
                case 0:
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    break;
                case 1:
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    break;
                case 2:
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    break;
                case 3:
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    break;
                case 4:
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    break;
                case 5:
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    break;
                case 6:
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    break;
                case 7:
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    break;
                case 8:
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    break;
            }
        }
        else System.out.println(":: Inizia "+nome+" ::");
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(440, 75, 0, 0));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 200));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText("X");
        jButton3.setForeground(Color.red);
        jButton3.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText("X");
        jButton1.setForeground(Color.red);
        jButton1.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText("X");
        jButton2.setForeground(Color.red);
        jButton2.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText("X");
        jButton4.setForeground(Color.red);
        jButton4.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText("X");
        jButton5.setForeground(Color.red);
        jButton5.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText("X");
        jButton6.setForeground(Color.red);
        jButton6.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText("X");
        jButton7.setForeground(Color.red);
        jButton7.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText("X");
        jButton8.setForeground(Color.red);
        jButton8.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText("X");
        jButton9.setForeground(Color.red);
        jButton9.setEnabled(false);
        actionPerformed(b1);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        controllo = false;
        if(jButton1.getText().equals("X")&&jButton4.getText().equals("X")&&jButton7.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton2.getText().equals("X")&&jButton5.getText().equals("X")&&jButton8.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton3.getText().equals("X")&&jButton6.getText().equals("X")&&jButton9.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton1.getText().equals("X")&&jButton2.getText().equals("X")&&jButton3.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton4.getText().equals("X")&&jButton5.getText().equals("X")&&jButton6.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton7.getText().equals("X")&&jButton8.getText().equals("X")&&jButton9.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton1.getText().equals("X")&&jButton5.getText().equals("X")&&jButton9.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        else if(jButton3.getText().equals("X")&&jButton5.getText().equals("X")&&jButton7.getText().equals("X")){
            new Vittoria(1);
            this.dispose();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // i == 0;
        
        //Il giocatore come prima scelta, sceglie la casella in centro, alla prima mossa.
        if(jButton5.getText().equals("X")&&i==0){
            n= random.nextInt(8);
            switch(n){
                case 0:
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    i++;
                    break;
                case 1:
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    i++;
                    break;
                case 2:
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    i++;
                    break;
                case 3:
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    i++;
                    break;
                case 4:
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    i++;
                    break;
                case 5:
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    i++;
                    break;
                case 6:
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    i++;
                    break;
                case 7:
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    i++;
                    break;
            }
            controllo = true;
        }
        
        //il giocatore sceglie un angolo alla prima mossa.
        if((jButton1.getText().equals("X")||jButton3.getText().equals("X")||jButton7.getText().equals("X")||jButton9.getText().equals("X"))&&i==0){
            n= random.nextInt(5);
            switch(n){
                case 0:
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    i++;
                    break;
                case 1:
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    i++;
                    break;
                case 2:
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    i++;
                    break;
                case 3:
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    i++;
                    break;
                case 4:
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    i++;
                    break;
            }
            controllo = true;
        }
        
        //il giocatore sceglie un lato alla prima mossa.
        if((jButton2.getText().equals("X")||jButton4.getText().equals("X")||jButton6.getText().equals("X")||jButton8.getText().equals("X"))&&i==0){
            n= random.nextInt(5);
            switch(n){
                case 0:
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    i++;
                    break;
                case 1:
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    i++;
                    break;
                case 2:
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    i++;
                    break;
                case 3:
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    i++;
                    break;
                case 4:
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    i++;
                    break;
            }
            controllo = true;
        }
        
        // i == 1;
        //Riga 1;
        if(i==1){
            if(jButton1.getText().equals("O")&&jButton2.getText().equals("O")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 1 reverse;
            else if(jButton3.getText().equals("O")&&jButton2.getText().equals("O")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 1 M
            else if(jButton3.getText().equals("O")&&jButton1.getText().equals("O")&&jButton2.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton2.getText().equals("")){
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 2;
            else if(jButton4.getText().equals("O")&&jButton5.getText().equals("O")&&jButton6.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton6.getText().equals("")){
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 2 reverse;
            else if(jButton6.getText().equals("O")&&jButton5.getText().equals("O")&&jButton4.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton4.getText().equals("")){
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 2 M
            else if(jButton4.getText().equals("O")&&jButton6.getText().equals("O")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 3;
            else if(jButton7.getText().equals("O")&&jButton8.getText().equals("O")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 3 reverse;
            else if(jButton9.getText().equals("O")&&jButton8.getText().equals("O")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 3 M
            else if(jButton7.getText().equals("O")&&jButton9.getText().equals("O")&&jButton8.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton8.getText().equals("")){
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1;
            else if(jButton1.getText().equals("O")&&jButton4.getText().equals("O")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1 reverse;
            else if(jButton7.getText().equals("O")&&jButton4.getText().equals("O")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1 M
            else if(jButton1.getText().equals("O")&&jButton7.getText().equals("O")&&jButton4.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton4.getText().equals("")){
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2;
            else if(jButton2.getText().equals("O")&&jButton5.getText().equals("O")&&jButton8.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton8.getText().equals("")){
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2 reverse;
            else if(jButton8.getText().equals("O")&&jButton5.getText().equals("O")&&jButton2.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton2.getText().equals("")){
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2 M
            else if(jButton2.getText().equals("O")&&jButton8.getText().equals("O")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3;
            else if(jButton3.getText().equals("O")&&jButton6.getText().equals("O")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3 reverse;
            else if(jButton9.getText().equals("O")&&jButton6.getText().equals("O")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3 M
            else if(jButton3.getText().equals("O")&&jButton9.getText().equals("O")&&jButton6.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton6.getText().equals("")){
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1
            else if(jButton1.getText().equals("O")&&jButton5.getText().equals("O")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1 reverse;
            else if(jButton9.getText().equals("O")&&jButton5.getText().equals("O")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1 M
            else if(jButton1.getText().equals("O")&&jButton9.getText().equals("O")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2
            else if(jButton3.getText().equals("O")&&jButton5.getText().equals("O")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2 reverse;
            else if(jButton7.getText().equals("O")&&jButton5.getText().equals("O")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2 M
            else if(jButton3.getText().equals("O")&&jButton7.getText().equals("O")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }
            //Riga 1;
            else if(jButton1.getText().equals("X")&&jButton2.getText().equals("X")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 1 reverse;
            else if(jButton3.getText().equals("X")&&jButton2.getText().equals("X")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 1 M
            else if(jButton3.getText().equals("X")&&jButton1.getText().equals("X")&&jButton2.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton2.getText().equals("")){
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 2;
            else if(jButton4.getText().equals("X")&&jButton5.getText().equals("X")&&jButton6.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton6.getText().equals("")){
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 2 reverse;
            else if(jButton6.getText().equals("X")&&jButton5.getText().equals("X")&&jButton4.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton4.getText().equals("")){
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 2 M
            else if(jButton4.getText().equals("X")&&jButton6.getText().equals("X")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 3;
            else if(jButton7.getText().equals("X")&&jButton8.getText().equals("X")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //Riga 3 reverse;
            else if(jButton9.getText().equals("X")&&jButton8.getText().equals("X")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //riga 3 M
            else if(jButton7.getText().equals("X")&&jButton9.getText().equals("X")&&jButton8.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton8.getText().equals("")){
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1;
            else if(jButton1.getText().equals("X")&&jButton4.getText().equals("X")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1 reverse;
            else if(jButton7.getText().equals("X")&&jButton4.getText().equals("X")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 1 M
            else if(jButton1.getText().equals("X")&&jButton7.getText().equals("X")&&jButton4.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton4.getText().equals("")){
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2;
            else if(jButton2.getText().equals("X")&&jButton5.getText().equals("X")&&jButton8.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton8.getText().equals("")){
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2 reverse;
            else if(jButton8.getText().equals("X")&&jButton5.getText().equals("X")&&jButton2.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton2.getText().equals("")){
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 2 M
            else if(jButton2.getText().equals("X")&&jButton8.getText().equals("X")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3;
            else if(jButton3.getText().equals("X")&&jButton6.getText().equals("X")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3 reverse;
            else if(jButton9.getText().equals("X")&&jButton6.getText().equals("X")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //colonna 3 M
            else if(jButton3.getText().equals("X")&&jButton9.getText().equals("X")&&jButton6.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton6.getText().equals("")){
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1
            else if(jButton1.getText().equals("X")&&jButton5.getText().equals("X")&&jButton9.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1 reverse;
            else if(jButton9.getText().equals("X")&&jButton5.getText().equals("X")&&jButton1.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 1 M
            else if(jButton1.getText().equals("X")&&jButton9.getText().equals("X")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2
            else if(jButton3.getText().equals("X")&&jButton5.getText().equals("X")&&jButton7.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2 reverse;
            else if(jButton7.getText().equals("X")&&jButton5.getText().equals("X")&&jButton3.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                    controllo=true;
                }
            }

            //diagonale 2 M
            else if(jButton3.getText().equals("X")&&jButton7.getText().equals("X")&&jButton5.getText().equals("")){
                n= random.nextInt(10);
                if(n!=1&&jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                    controllo=true;
                }
            }


            if(!controllo){
                if(jButton1.getText().equals("")){
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                }
                else if(jButton2.getText().equals("")){
                    jButton2.setText("O");
                    jButton2.setEnabled(false);
                }
                else if(jButton3.getText().equals("")){
                    jButton3.setText("O");
                    jButton3.setEnabled(false);
                }
                else if(jButton4.getText().equals("")){
                    jButton4.setText("O");
                    jButton4.setEnabled(false);
                }
                else if(jButton5.getText().equals("")){
                    jButton5.setText("O");
                    jButton5.setEnabled(false);
                }
                else if(jButton6.getText().equals("")){
                    jButton6.setText("O");
                    jButton6.setEnabled(false);
                }
                else if(jButton7.getText().equals("")){
                    jButton7.setText("O");
                    jButton7.setEnabled(false);
                }
                else if(jButton8.getText().equals("")){
                    jButton8.setText("O");
                    jButton8.setEnabled(false);
                }
                else if(jButton9.getText().equals("")){
                    jButton9.setText("O");
                    jButton9.setEnabled(false);
                }
            }
        }
        
        //COLONNE
        //colonna 1
        if(jButton1.getText().equals("O")&&jButton4.getText().equals("O")&&jButton7.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //colonna 2
        else if(jButton2.getText().equals("O")&&jButton5.getText().equals("O")&&jButton8.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //colonna 3
        else if(jButton3.getText().equals("O")&&jButton6.getText().equals("O")&&jButton9.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //RIGHE
        //riga 1
        else if(jButton1.getText().equals("O")&&jButton2.getText().equals("O")&&jButton3.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //riga 2
        else if(jButton4.getText().equals("O")&&jButton5.getText().equals("O")&&jButton6.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //riga 3
        else if(jButton7.getText().equals("O")&&jButton8.getText().equals("O")&&jButton9.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        
        //DIAGONALI
        //diagonale 1 dx a sx
        else if(jButton1.getText().equals("O")&&jButton5.getText().equals("O")&&jButton9.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        //diagonale 2 sx a ds
        else if(jButton3.getText().equals("O")&&jButton5.getText().equals("O")&&jButton7.getText().equals("O")){
            new Vittoria(2);
            this.dispose();
        }
        //Caso di pareggio
        else if(!jButton1.getText().equals("")&&!jButton2.getText().equals("")&&!jButton3.getText().equals("")
                &&!jButton4.getText().equals("")&&!jButton5.getText().equals("")&&!jButton6.getText().equals("")
                &&!jButton7.getText().equals("")&&!jButton8.getText().equals("")&&!jButton9.getText().equals("")){
            new Vittoria(3);
            this.dispose();
        }
    }
}