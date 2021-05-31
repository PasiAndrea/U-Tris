package trisproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

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
    BufferedWriter bw = new BufferedWriter(isw);
    // rileva il termine della stringa
    PrintWriter pw = new PrintWriter(bw, true);
    
    public ClientTris(String[] args) {
        try{
            // server
            // InetAddress.getLocalHost() // prende l'host locale
            // il primo parametro è l'indirizzo dell'host, il secondo è la porta di comunicazione
            
            this.myServer = new Socket("192.168.43.97", porta);
            this.isr = new InputStreamReader(myServer.getInputStream());
            this.br = new BufferedReader(isr);
            this.isw = new OutputStreamWriter(myServer.getOutputStream());
            // prendere l'input da tastiera
            Scanner sc = new Scanner(System.in);
            // stringa di acquisizione
            String s = "";
            System.out.println("Inizio chat con server");
            
        }catch(IOException e){
            System.out.println("Errore");
        }
    }
    void LetturaServer() throws IOException{
        // legge la risposta del server
        String s = br.readLine();
                System.out.println("Server: "+s);
    }
    void ScritturaServer(){
        String s = null;
        // invia la stringa al server
        pw.println(s);
    }


}
