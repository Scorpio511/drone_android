package com.example.dronerevue;

public class CoordoneeDrone {

	private static boolean Decollage = false;
	private static boolean Atterissage = false;
	
	public static void setDecollage(boolean ihmDecollage){
		
		CoordoneeDrone.Decollage = ihmDecollage; //recupére la valeur 
		
	}
	
	public static boolean isDecollage(){
		return Decollage;
	}

	public static void setAtterissage(boolean ihmAtterissage){
		
		CoordoneeDrone.Atterissage = ihmAtterissage;
	}
	
	public static boolean isAtterissage(){
		return Atterissage;
	}
}