package com.example.dronerevue;

//import java.io.IOException;
//import java.io.PipedReader;
//import java.io.PipedWriter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class IhmVol extends Activity {
	

		
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihm_vol);
		
		Button boutonDemarrer = (Button)findViewById(R.id.decoller);
		Button boutonTest = (Button)findViewById(R.id.gauche);
			
		
		boutonDemarrer.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				try {
				Thread leThread;
				leThread = new Vol();
				leThread.start();
				CoordoneeDrone.setDecollage(true);
				
					leThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//CoordoneeDrone.setAtterissage(true);
			}
					
			});//bouton démarrer
			
				
		boutonTest.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				CoordoneeDrone.setAtterissage(true);
			}
			
		});//bouton Test
		
		}//onCreate
			
	
}
