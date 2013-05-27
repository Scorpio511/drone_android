package com.example.dronerevue;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.*;

public class IhmVol extends Activity{
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihm_vol);
		
		Button boutonDecoller = (Button)findViewById(R.id.decoller);
		Button boutonAtterissage = (Button)findViewById(R.id.arret);
		Button boutonInclinaisonDroite = (Button)findViewById(R.id.directionDroite);
		Button boutonInclinaisonGauche = (Button)findViewById(R.id.directionGauche);
		Button boutonMonter = (Button)findViewById(R.id.directionHaut);
		Button boutonDescendre = (Button)findViewById(R.id.directionBas);
		Button boutonRotationDroite = (Button)findViewById(R.id.rotationDroite);
		Button boutonRotationGauche = (Button)findViewById(R.id.rotationGauche);
		Button boutonAvancer = (Button)findViewById(R.id.directionAvant);
		Button boutonReculer = (Button)findViewById(R.id.directionArriere);
		
		
		boutonDecoller.setOnClickListener(new OnClickListener(){
			public void onClick(View v){

				Thread leThread;
				leThread = new Vol();
				leThread.start();

				Drone.setDecollage(true);
				Drone.setAtterissage(false);
				
			}
					
			});//bouton démarrer
			
				
		boutonAtterissage.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				
				Drone.setDecollage(false);
				Drone.setAtterissage(true);	
			}
			
		});//bouton Test
		
		
		boutonInclinaisonDroite.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setAnglePhi(1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setAnglePhi(0);
				}
				return true;
			}
		});
		
		
		boutonInclinaisonGauche.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setAnglePhi(-1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setAnglePhi(0);
				}
				return true;
			}
		});
		
		boutonMonter.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setGaz(1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setGaz(0);
				}
				return true;
			}
		});
		
		boutonDescendre.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setGaz(-1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setGaz(0);
				}
				return true;
			}
		});
		
		boutonRotationDroite.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setYaw(1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setYaw(0);
				}
				return true;
			}
		});
		
		boutonRotationGauche.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setYaw(-1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setYaw(0);
				}
				return true;
			}
		});
		
		boutonAvancer.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setAngleTheta(1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setAngleTheta(0);
				}
				return true;
			}
		});
		
		boutonReculer.setOnTouchListener(new OnTouchListener(){

			public boolean onTouch(View v, MotionEvent enfoncement) {
				if(enfoncement.getAction() == android.view.MotionEvent.ACTION_DOWN)
				{
					Drone.setAngleTheta(-1);
				}
				else if(enfoncement.getAction() == android.view.MotionEvent.ACTION_UP)
				{
					Drone.setAngleTheta(0);
				}
				return true;
			}
		});
		
	}//Methode onCreate (methode android)

		
}//IhmVol


