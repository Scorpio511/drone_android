package com.example.dronerevue;


 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
 
public class Main extends Activity {

   
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      
      Button boutonPilotage = (Button)findViewById(R.id.pilotageBouton);
      boutonPilotage.setOnClickListener(new OnClickListener(){
    	  @Override
    	  	public void onClick(View v){
    		  
    		  Intent intentPilotage = new Intent(Main.this,IhmVol.class);
    		  startActivity(intentPilotage);
    		  
    	  }
      });
      
   
   
   Button boutonQuitter = (Button)findViewById(R.id.quitterBouton);
   boutonQuitter.setOnClickListener(new OnClickListener(){
	   @Override
	   	public void onClick(View v){		   
		   System.exit(0);
	   }
   	
	});
	   
   }


}
