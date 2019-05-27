package com.chokkoazul.clientsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

    Socket cliente;
    int puerto = 9000;
    String ip = "127.0.0.1";
    BufferedReader entrada, teclado;
    PrintStream salida;

    public void inicio(){

        try {
            cliente = new Socket(ip, puerto);
            String tec;
            do{
                entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                teclado = new BufferedReader(new InputStreamReader(System.in));
                tec = teclado.readLine();
                salida = new PrintStream(cliente.getOutputStream());
                salida.println(tec);
                String msg = entrada.readLine();
                System.out.println(msg);
            }while (!tec.equals("fin"));

            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
