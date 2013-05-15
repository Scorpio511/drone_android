package com.example.dronerevue;

//import java.io.IOException;
//import java.io.PipedReader;
import java.net.*;
//import java.io.*;


public class Vol extends Thread {
	private boolean encours = true; 	
	//private int port=5001;
  	//private InetAddress adresse;
  	//private DatagramSocket socket;
	
	public Vol() {
		
		
		
	}
	
	public void run(){
<<<<<<< HEAD
		
=======
>>>>>>> Revue 2
		
		try {
			//socket = new DatagramSocket();
			//adresse = InetAddress.getByName("10.0.2.2");
			while(encours){
				envoiSocket();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
<<<<<<< HEAD
		
=======
				
			}
			//socket.close();
		} 
		catch (UnknownHostException e) {
					e.printStackTrace();
				} //catch (SocketException e) {
			//e.printStackTrace();
		//} 
	
>>>>>>> Revue 2
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
		
		if((Drone.isDecollage())==true)
		{
			messageToDrone = "AT*CONFIG=1,\"control:altitude_max\",\"1000\"\rAT*FTRIM\rAT*REF=4,290718208\r<LF>";
			return messageToDrone;
		}
		else if((Drone.isAtterissage())==true)
		{
			messageToDrone = "AT*REF=4,290717696\r";
			encours = false;
			return messageToDrone;
		}
		return messageToDrone ="erreur";
	}
}
