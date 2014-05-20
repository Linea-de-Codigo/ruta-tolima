package co.linea.rutatolima;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
	}
	
	public void pasar (View v){
		Intent in = new Intent(this, MainActivity.class);
		startActivity(in);
		
	}
	
}