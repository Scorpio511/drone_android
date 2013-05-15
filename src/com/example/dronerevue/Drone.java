package com.example.dronerevue;

public class Drone {

	 public static boolean Decollage = false;
	 public static boolean Atterissage = false;
	
	public static void setDecollage(boolean ihmDecollage){
		
		Drone.Decollage = ihmDecollage; //recupére la valeur 
		
	}
	
	public static boolean isDecollage(){
		return Decollage;
	}

	public static void setAtterissage(boolean ihmAtterissage){
		
		Drone.Atterissage = ihmAtterissage;
	}
	
	public static boolean isAtterissage(){
		return Atterissage;
	}
	
}
