package com.example.fuckoff;


 

import android.app.Activity;
import android.os.Bundle;
//import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

//import java.net.*;
//import java.io.*;

public class MainActivity extends Activity {
 
	
	public static final int MON_PORT = 5001;
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      
     
      
      Button bouton2 = (Button)findViewById(R.id.envoi);
      bouton2.setOnClickListener(new OnClickListener(){
     
    	  public void onClick(View v){	  
      try {
    	  	Thread leThread= null;
    	  	leThread = new Vol();
		
    	  		leThread.start();
    	  		leThread.join();
      			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
      finally {
    	  
      		  }//finally
    	  }//onClick
      });//OnClickListener   
  
   
   }

   
   
   
   
   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
   
}