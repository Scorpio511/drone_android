package com.example.dronerevue;

//import java.io.IOException;
//import java.io.PipedReader;
import java.net.*;
//import java.io.*;

public class Vol extends Thread {

	
	public Vol() {
		
		
		
	}
	
	public void run(){
		while(true){
		
		try {
			envoiSocket();
		} 
				catch (UnknownHostException e) {
					e.printStackTrace();
				}
		}
	}// execution de la methode d'envoi sur la socket en thread
	
	public void envoiSocket() throws UnknownHostException {
		int port=5001;
	  	InetAddress adresse = InetAddress.getByName("10.0.2.2");
	  	DatagramSocket socket;
	  	

	  	String leMessage = getMessage();
	  	byte[] message= new byte [leMessage.length()];
	  	message = leMessage.getBytes();
	  	
	  	
	  		try{
  	
	  			socket = new DatagramSocket();    	  				
	  			DatagramPacket packet = new DatagramPacket(message,leMessage.length(),adresse,port);
	  			socket.send(packet);
	  			System.out.println("test d'execution");
	  			socket.close();
	  		} 
	  		catch(Exception e)
	  		{
	  		e.printStackTrace();
	  		}
	}//envoi sur la socket
	
	public String getMessage(){
	
		String messageToDrone = "";
		
		if((CoordoneeDrone.isDecollage())==true)
		{
			messageToDrone = "AT*CONFIG=1,\"control:altitude_max\",\"1000\"\rAT*FTRIM\rAT*REF=4,290718208\r<LF>";
			return messageToDrone;
		}
		else if((CoordoneeDrone.isAtterissage())==true)
		{
			messageToDrone = "AT*REF=4,290717696\r";
			return messageToDrone;
		}
		return messageToDrone ="erreur";
	}
}
