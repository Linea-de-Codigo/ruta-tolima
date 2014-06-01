package co.linea.rutatolima;

import java.io.File;
import java.io.FileOutputStream;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class Activity_Marker extends Activity {
	
	Bitmap bmScreen;
    RelativeLayout mLayout;
    Dialog screenDialog;
    static final int ID_SCREENDIALOG = 1;

    ImageView bmImage;
    Button btnScreenDialog_OK;
    
    View screen;
    EditText EditTextIn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.marker);
		
		screen = (View) findViewById(R.id.screen);
        Button btnCaptureScreen = (Button) findViewById(R.id.capturescreen);

        btnCaptureScreen.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                screen.setDrawingCacheEnabled(true);
                bmScreen = screen.getDrawingCache();
                saveImage(bmScreen);
                // showDialog(ID_SCREENDIALOG);
                
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Este es mi texto a enviar.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            	}
            
                
            
        });
    }

    protected void saveImage(Bitmap bmScreen2) {
        // TODO Auto-generated method stub

        // String fname = "Upload.png";
        File saved_image_file = new File(
                Environment.getExternalStorageDirectory()
                        + "/cap.png");
        if (saved_image_file.exists())
            saved_image_file.delete();
        try {
            FileOutputStream out = new FileOutputStream(saved_image_file);
            bmScreen2.compress(Bitmap.CompressFormat.PNG, 100, out);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

	
	

	
    
