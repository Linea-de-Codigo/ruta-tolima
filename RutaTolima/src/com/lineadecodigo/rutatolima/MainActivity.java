package com.lineadecodigo.rutatolima;

import co.linea.rutatolima.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}
	
	public void pasarmapa(View v) {
		Intent act1 = new Intent(this, Mapas.class);
		 startActivity(act1);	
	}	

}
