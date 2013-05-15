package com.example.dronerevue;

//import java.io.IOException;
//import java.io.PipedReader;
//import java.io.PipedWriter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class IhmVol extends Activity /*implements OnClickListener*/{
	
	
		
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihm_vol);
		
		Button boutonDemarrer = (Button)findViewById(R.id.decoller);
		Button boutonTest = (Button)findViewById(R.id.gauche);
		
		//boutonDemarrer.setOnClickListener((OnClickListener) this);
		//boutonTest.setOnClickListener((OnClickListener)this);		
		
		
				
		
		boutonDemarrer.setOnClickListener(new OnClickListener(){
			public void onClick(View v){

				Thread leThread;
				leThread = new Vol();
				leThread.start();
				//Drone test = new Drone();
				Drone.setDecollage(true);
				Drone.setAtterissage(false);
				
			}
					
			});//bouton démarrer
			
				
		boutonTest.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				
				Drone.setDecollage(false);
				Drone.setAtterissage(true);	
			}
			
		});//bouton Test
		
	

		
	}//onCreate
/*
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.decoller){
			Thread leThread;
			leThread = new Vol();
			leThread.start();
			Drone.setDecollage(true);
			Drone.setAtterissage(false);
		}
		if(v.getId()==R.id.gauche){
			Drone.setDecollage(false);
			Drone.setAtterissage(true);
		}
	}
	*/
	
			
	
}
