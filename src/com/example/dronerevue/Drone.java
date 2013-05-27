package com.example.dronerevue;

public class Drone {

	 public static boolean Decollage = false;
	 public static boolean Atterissage = false;
	 
	 public static int AnglePhi = 0; //Angle d'inclinaison droite(1)/gauche(-1)
	 public static int AngleTheta = 0; //Angle d'inclinaison avant(1)/arriere(-1) 
	 public static int Gaz = 0;
	 public static int Yaw = 0;
	
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
	
	public static void setAnglePhi(int phiIhm){
		Drone.AnglePhi = phiIhm; 
	}
	
	public static int getAnglePhi(){
		return AnglePhi;
	}
	
	public static void setAngleTheta(int ThetaIhm){
		Drone.AngleTheta = ThetaIhm;
	}
	
	public static int getAngleTheta(){
		return AngleTheta;
	}
	
	public static void setGaz(int GazIhm){
		Drone.Gaz = GazIhm;
	}
	
	public static int getGaz(){
		return Gaz;
	}
	
	public static void setYaw(int YawIhm){
		Drone.Yaw = YawIhm;
	}
	
	public static int getYaw(){
		return Yaw;
	}
}
