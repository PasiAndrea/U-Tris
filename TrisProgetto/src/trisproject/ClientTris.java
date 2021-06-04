package trisproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientTris {
    // numero della porta di comunicazione
    public static final int porta = 6999;
    Socket myServer; 
    // messaggio di connessione
    // oggetti lettura ----------------------------------
    InputStreamReader isr;
    //buffer
    BufferedReader br; 
    // oggetti scrittura ------------------------------------
    OutputStreamWriter isw; 
    // buffer per memorizzare
    BufferedWriter bw;
    // rileva il termine della stringa
    PrintWriter pw;

    public ClientTris() {
    }
    
    public ClientTris(String indirizzo) {
        try{
            // server
            // InetAddress.getLocalHost() // prende l'host locale
            // il primo parametro è l'indirizzo dell'host, il secondo è la porta di comunicazione
            
            this.myServer = new Socket(indirizzo, porta);
            this.isr = new InputStreamReader(myServer.getInputStream());
            this.br = new BufferedReader(isr);
            this.isw = new OutputStreamWriter(myServer.getOutputStream());
            this.bw = new BufferedWriter(isw);
            this.pw = new PrintWriter(bw, true);
            // prendere l'input da tastiera
            
            // stringa di acquisizione
            String s = "";
            System.out.println("Inizio chat con server");
            
        }catch(IOException e){
            System.out.println("Errore");
        }
    }
    String LetturaServer(){
        String s = null;
        // legge la risposta del server
        try{
            s = br.readLine();
            System.out.println("Server: "+s);
        }catch(IOException ex){
            Logger.getLogger(ServerTris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return s;
    }
    void ScritturaServer(String s){
        // invia la stringa al server
        pw.println(s);
    }

}