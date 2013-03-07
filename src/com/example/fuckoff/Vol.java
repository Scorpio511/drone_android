package com.example.fuckoff;


import java.net.*;
import java.io.*;

public class Vol extends Thread {
	
	
	public Vol(){
		
	}
	
		
	public void run() {
		
		try {
	    	  
    	  	int port=5001;
    	  	InetAddress adresse = InetAddress.getByName("10.0.2.2");
    	  	DatagramSocket socket;
    	  	
    	  	
    	  	String leMessage = "AT*CONFIG=1,\"control:altitude_max\",\"1000\"\rAT*FTRIM\rAT*REF=4,290718208\r<LF>";
    	  	int longueur = leMessage.length();
    	  	byte[] message= new byte [longueur];
    	  	message = leMessage.getBytes();
    	  	
    	  	
    	  	
    	  	socket = new DatagramSocket();    	  				
			DatagramPacket packet = new DatagramPacket(message,longueur,adresse,port);
			socket.send(packet);
			System.out.println("test d'execution");
    	  	socket.close();
		
    	  	
    	  	
		
      			} catch (UnknownHostException e)
      					{
      						// TODO Auto-generated catch block
      						e.printStackTrace();
      					}
      						catch (SocketException e)
      					{
      						// TODO Auto-generated catch block
      						e.printStackTrace();
      					} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
      
    	  }//run

		
	}//class

