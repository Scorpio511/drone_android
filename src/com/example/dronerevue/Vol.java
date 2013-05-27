package com.example.dronerevue;

import java.net.*;


public class Vol extends Thread {
	private boolean encours = true;
	private int boucleDecollage = 0;
	private int numeroCommande = 4 ;
	private byte [] ipDrone = {(byte)10,(byte)0,(byte)2,(byte)2};
	private int port=5001;

	public Vol() {
	
	}
	
	public void run(){
		
		try {

			while(encours){
				envoiSocket();  // 1.La méthode envoiSocket est executé
				                
				try {             
					Thread.sleep(400); // 2. Puis une pause de 400ms   
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//Catch du thread
				
			}

		} 
		catch (UnknownHostException e) {
					e.printStackTrace();
				}//Catch de run 
	
	}// execution de la methode d'envoi sur la socket en thread
	
	public void envoiSocket() throws UnknownHostException {

		InetAddress adresse = InetAddress.getByAddress(ipDrone);
	  	DatagramSocket socket;
	  	

	  	String leMessage = getMessage(); //Recuperation du message correspondant à l'action de l'utilisateur dans l'ihm
	  	byte[] message= new byte [leMessage.length()];
	  	message = leMessage.getBytes();
	  	
	  	
	  		try{
  	
	  			socket = new DatagramSocket();    	  				
	  			DatagramPacket packet = new DatagramPacket(message,leMessage.length(),adresse,port); // Creation du datgramme 
	  			socket.send(packet);
	  			socket.close();
	  		} 
	  		catch(Exception e)
	  		{
	  		e.printStackTrace();
	  		}
	}//envoi sur la socket
	
	public String getMessage(){
	
		String messageToDrone = "";		
	
		if(((Drone.isDecollage())==true)&&(boucleDecollage < 1))
		{
			messageToDrone = "AT*CONFIG=1,\"control:altitude_max\",\"1000\"\rAT*FTRIM\rAT*REF=4,290718208\r<LF>";
			boucleDecollage++;
			return messageToDrone;
		}
		else if((Drone.isAtterissage())==true)
		{
			numeroCommande++;
			messageToDrone = "AT*REF="+numeroCommande+",290717696\r";
			encours = false;
			return messageToDrone;
		}
		numeroCommande ++;
		return messageToDrone = "AT*PCMD="+numeroCommande+",1,"+ Drone.getAnglePhi() +","+ Drone.getAngleTheta() +","+Drone.getGaz()+","+Drone.getYaw()+"<LF>";
	}
}
