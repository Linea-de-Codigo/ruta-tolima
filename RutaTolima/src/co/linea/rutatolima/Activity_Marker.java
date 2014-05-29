package co.linea.rutatolima;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Activity_Marker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.marker);
	}

	/*public void compartir (View V){
		
		Intent sendIntent = new Intent(Intent.ACTION_SEND);
		sendIntent.setType("audio/*");
		sendIntent.putExtra(Intent.EXTRA_SUBJECT, "SpyTools: AudioRecord");
		
		sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"));
		 
		startActivity(Intent.createChooser(sendIntent, getString(R.string.descr)));
	}
	public static void share(Context ctx, String subject,String text, String cc ) {
        final Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent. EXTRA_CC, cc);

        ctx.startActivity(Intent.createChooser(intent, ctx.getString(R.string.cc)));
       }
	
	*/
public void share (View V){
		
		Intent sendIntent = new Intent(Intent.ACTION_SEND);
		sendIntent.setType("*/*");
		sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Compartir");
		sendIntent.putExtra(Intent. EXTRA_TEXT, "harn.16@gmail.com");
		sendIntent.putExtra(Intent. EXTRA_EMAIL, "harn.16@gmail.com");
		sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("/sdcard/fondo.jpg)"));
		//sendIntent.putExtra(Intent.EXTRA_STREAM,  Uri.parse("/sdcard/fondo.jpg").toString());
		 
		startActivity(Intent.createChooser(sendIntent, getString(R.string.descr)));
	}
}
