package trisproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerTris {
    public static final int Porta = 6999;
    // crea un oggetto server in ascolto sulla porta stabilita
    ServerSocket serverSocket;
    // crea il collegamento tra serrver e client quando ne trova uno
    Socket clientSocket;
    // lettura----------
    InputStreamReader isr;
    // area che conserva i dati arrivati
    BufferedReader bufferReader;
    // scrittura ---------
    OutputStreamWriter osw;
    // area che conserva i dati in uscita
    BufferedWriter bufferWriter;
    // oggetto che scrive
    PrintWriter pw;
    String s;
    
    public ServerTris() {
        try {
            // server in ascolto sulla porta
            this.serverSocket = new ServerSocket(Porta);
            // collegamento tra server e client
            this.clientSocket = serverSocket.accept();
            // oggetti di comunicazione
            this.isr = new InputStreamReader(clientSocket.getInputStream());
            this.bufferReader =  new BufferedReader(isr);
            this.osw = new OutputStreamWriter(clientSocket.getOutputStream());
            this.bufferWriter = new BufferedWriter(osw);
            // il secondo parametro svuota il buffer dopo la scrittura
            this.pw = new PrintWriter(bufferWriter, true);
            
        } catch (IOException ex) {
            Logger.getLogger(ServerTris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // risposta al client
    public void scritturaClient(String dato){
        pw.println(dato);
    }
    
    // leggere un messaggio dal client
    public String letturaClient(){
        try {
            s = bufferReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ServerTris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
}