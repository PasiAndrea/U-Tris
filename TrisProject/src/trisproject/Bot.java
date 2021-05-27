package trisproject;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bot {

    //nome del player
    String nome;
    //tema della griglia
    int tema;
    // pannello
    JFrame frame;
    Griglia griglia;
    //
    Random random = new Random();
    //
    static int i = 0;
    //
    static boolean controllo;
    
    public Bot(){
    }
    
    public Bot(String nome, int tema) {
        this.nome = nome;
        this.tema = tema;
        // frame
        frame = new JFrame("ciao");
        griglia = new Griglia();
        frame.setContentPane(griglia);
        // cambia tema
        if(tema==0)
            frame.getContentPane().setBackground(Color.white);
        if(tema==1)
            frame.getContentPane().setBackground(Color.black);
        if(tema==2)
            frame.getContentPane().setBackground(Color.pink);
        frame.setVisible(true);
        Gioco();
    }

    public void Gioco() {
        // sceglie chi inizia
        boolean inizio = random.nextBoolean();
        // numero della casella in cui iniziare
        int numero = random.nextInt(9);

        if (!inizio) {
            // stampa a video il nome di chi inizia
            griglia.jLabel1.setText(":: Inizia il bot ::");
            i++;
            switch (numero) {
                case 0:
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    break;
                case 1:
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    break;
                case 2:
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    break;
                case 3:
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    break;
                case 4:
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    break;
                case 5:
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    break;
                case 6:
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    break;
                case 7:
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    break;
                case 8:
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    break;
            }
        } else {
            griglia.jLabel1.setText(":: Inizia " + nome + " ::");
        }
        griglia.setVisible(true);

        //il giocatore sceglie un angolo alla prima mossa.
        if ((griglia.jButton1.getText().equals("X") || griglia.jButton3.getText().equals("X") || griglia.jButton7.getText().equals("X") || griglia.jButton9.getText().equals("X")) && i == 0) {
            int n = random.nextInt(5);
            switch (n) {
                case 0:
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    i++;
                    break;
                case 1:
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    i++;
                    break;
                case 2:
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    i++;
                    break;
                case 3:
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    i++;
                    break;
                case 4:
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    i++;
                    break;
            }
            controllo = true;
        }

        //il giocatore sceglie un lato alla prima mossa.
        if ((griglia.jButton2.getText().equals("X") || griglia.jButton4.getText().equals("X") || griglia.jButton6.getText().equals("X") || griglia.jButton8.getText().equals("X")) && i == 0) {
            int n = random.nextInt(5);
            switch (n) {
                case 0:
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    i++;
                    break;
                case 1:
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    i++;
                    break;
                case 2:
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    i++;
                    break;
                case 3:
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    i++;
                    break;
                case 4:
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    i++;
                    break;
            }
            controllo = true;
        }

        // i == 1;
        //Riga 1;
        if (i == 1) {
            if (griglia.jButton1.getText().equals("O") && griglia.jButton2.getText().equals("O") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //Riga 1 reverse;
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton2.getText().equals("O") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //riga 1 M
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton1.getText().equals("O") && griglia.jButton2.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                }
            } //Riga 2;
            else if (griglia.jButton4.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton6.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //Riga 2 reverse;
            else if (griglia.jButton6.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton4.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    i++;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //riga 2 M
            else if (griglia.jButton4.getText().equals("O") && griglia.jButton6.getText().equals("O") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                }
            } //Riga 3;
            else if (griglia.jButton7.getText().equals("O") && griglia.jButton8.getText().equals("O") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //Riga 3 reverse;
            else if (griglia.jButton9.getText().equals("O") && griglia.jButton8.getText().equals("O") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                }
            } //riga 3 M
            else if (griglia.jButton7.getText().equals("O") && griglia.jButton9.getText().equals("O") && griglia.jButton8.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1;
            else if (griglia.jButton1.getText().equals("O") && griglia.jButton4.getText().equals("O") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1 reverse;
            else if (griglia.jButton7.getText().equals("O") && griglia.jButton4.getText().equals("O") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1 M
            else if (griglia.jButton1.getText().equals("O") && griglia.jButton7.getText().equals("O") && griglia.jButton4.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2;
            else if (griglia.jButton2.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton8.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2 reverse;
            else if (griglia.jButton8.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton2.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2 M
            else if (griglia.jButton2.getText().equals("O") && griglia.jButton8.getText().equals("O") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3;
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton6.getText().equals("O") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3 reverse;
            else if (griglia.jButton9.getText().equals("O") && griglia.jButton6.getText().equals("O") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3 M
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton9.getText().equals("O") && griglia.jButton6.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1
            else if (griglia.jButton1.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1 reverse;
            else if (griglia.jButton9.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1 M
            else if (griglia.jButton1.getText().equals("O") && griglia.jButton9.getText().equals("O") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2 reverse;
            else if (griglia.jButton7.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2 M
            else if (griglia.jButton3.getText().equals("O") && griglia.jButton7.getText().equals("O") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //Riga 1;
            else if (griglia.jButton1.getText().equals("X") && griglia.jButton2.getText().equals("X") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //Riga 1 reverse;
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton2.getText().equals("X") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //riga 1 M
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton1.getText().equals("X") && griglia.jButton2.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                }
            } //Riga 2;
            else if (griglia.jButton4.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton6.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //Riga 2 reverse;
            else if (griglia.jButton6.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton4.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    i++;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //riga 2 M
            else if (griglia.jButton4.getText().equals("X") && griglia.jButton6.getText().equals("X") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                }
            } //Riga 3;
            else if (griglia.jButton7.getText().equals("X") && griglia.jButton8.getText().equals("X") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //Riga 3 reverse;
            else if (griglia.jButton9.getText().equals("X") && griglia.jButton8.getText().equals("X") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                }
            } //riga 3 M
            else if (griglia.jButton7.getText().equals("X") && griglia.jButton9.getText().equals("X") && griglia.jButton8.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1;
            else if (griglia.jButton1.getText().equals("X") && griglia.jButton4.getText().equals("X") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1 reverse;
            else if (griglia.jButton7.getText().equals("X") && griglia.jButton4.getText().equals("X") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //colonna 1 M
            else if (griglia.jButton1.getText().equals("X") && griglia.jButton7.getText().equals("X") && griglia.jButton4.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2;
            else if (griglia.jButton2.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton8.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2 reverse;
            else if (griglia.jButton8.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton2.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                }
            } //colonna 2 M
            else if (griglia.jButton2.getText().equals("X") && griglia.jButton8.getText().equals("X") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3;
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton6.getText().equals("X") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3 reverse;
            else if (griglia.jButton9.getText().equals("X") && griglia.jButton6.getText().equals("X") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                }
            } //colonna 3 M
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton9.getText().equals("X") && griglia.jButton6.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1
            else if (griglia.jButton1.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton9.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1 reverse;
            else if (griglia.jButton9.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton1.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 1 M
            else if (griglia.jButton1.getText().equals("X") && griglia.jButton9.getText().equals("X") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton7.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2 reverse;
            else if (griglia.jButton7.getText().equals("X") && griglia.jButton5.getText().equals("X") && griglia.jButton3.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            } //diagonale 2 M
            else if (griglia.jButton3.getText().equals("X") && griglia.jButton7.getText().equals("X") && griglia.jButton5.getText().equals("")) {
                int n = random.nextInt(10);
                if (n != 1 && griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                    controllo = true;
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                    controllo = true;
                }
            }

            if (!controllo) {
                if (griglia.jButton1.getText().equals("")) {
                    griglia.jButton1.setText("O");
                    griglia.jButton1.setEnabled(false);
                } else if (griglia.jButton2.getText().equals("")) {
                    griglia.jButton2.setText("O");
                    griglia.jButton2.setEnabled(false);
                } else if (griglia.jButton3.getText().equals("")) {
                    griglia.jButton3.setText("O");
                    griglia.jButton3.setEnabled(false);
                } else if (griglia.jButton4.getText().equals("")) {
                    griglia.jButton4.setText("O");
                    griglia.jButton4.setEnabled(false);
                } else if (griglia.jButton5.getText().equals("")) {
                    griglia.jButton5.setText("O");
                    griglia.jButton5.setEnabled(false);
                } else if (griglia.jButton6.getText().equals("")) {
                    griglia.jButton6.setText("O");
                    griglia.jButton6.setEnabled(false);
                } else if (griglia.jButton7.getText().equals("")) {
                    griglia.jButton7.setText("O");
                    griglia.jButton7.setEnabled(false);
                } else if (griglia.jButton8.getText().equals("")) {
                    griglia.jButton8.setText("O");
                    griglia.jButton8.setEnabled(false);
                } else if (griglia.jButton9.getText().equals("")) {
                    griglia.jButton9.setText("O");
                    griglia.jButton9.setEnabled(false);
                }
            }
        }

        //COLONNE
        //colonna 1
        if (griglia.jButton1.getText().equals("O") && griglia.jButton4.getText().equals("O") && griglia.jButton7.getText().equals("O")) {
            Vittoria(2);
        } //colonna 2
        else if (griglia.jButton2.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton8.getText().equals("O")) {
            Vittoria(2);
        } //colonna 3
        else if (griglia.jButton3.getText().equals("O") && griglia.jButton6.getText().equals("O") && griglia.jButton9.getText().equals("O")) {
            Vittoria(2);
        } //RIGHE
        //riga 1
        else if (griglia.jButton1.getText().equals("O") && griglia.jButton2.getText().equals("O") && griglia.jButton3.getText().equals("O")) {
            Vittoria(2);
        } //riga 2
        else if (griglia.jButton4.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton6.getText().equals("O")) {
            Vittoria(2);
        } //riga 3
        else if (griglia.jButton7.getText().equals("O") && griglia.jButton8.getText().equals("O") && griglia.jButton9.getText().equals("O")) {
            Vittoria(2);
        } //DIAGONALI
        //diagonale 1 dx a sx
        else if (griglia.jButton1.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton9.getText().equals("O")) {
            Vittoria(2);
        } //diagonale 2 sx a ds
        else if (griglia.jButton3.getText().equals("O") && griglia.jButton5.getText().equals("O") && griglia.jButton7.getText().equals("O")) {
            Vittoria(2);
        } //Caso di pareggio
        else if (!griglia.jButton1.getText().equals("") && !griglia.jButton2.getText().equals("") && !griglia.jButton3.getText().equals("")
                && !griglia.jButton4.getText().equals("") && !griglia.jButton5.getText().equals("") && !griglia.jButton6.getText().equals("")
                && !griglia.jButton7.getText().equals("") && !griglia.jButton8.getText().equals("") && !griglia.jButton9.getText().equals("")) {
            Vittoria(3);
        }
    }
    
    public void Vittoria(int numero){
        Menù menu= new Menù();
        switch(numero){ 
            case 1:
                JOptionPane.showMessageDialog(null,"hai vinto ");
                griglia.setDefaultLookAndFeelDecorated(false);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Il bot ha vinto");
                griglia.setDefaultLookAndFeelDecorated(false);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pareggio");
                griglia.setDefaultLookAndFeelDecorated(false);
                break;
        }
        
        menu.setVisible(true);
    }

}
