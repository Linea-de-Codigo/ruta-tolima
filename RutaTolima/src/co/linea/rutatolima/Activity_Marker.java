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
            }
        });
    }

    protected void saveImage(Bitmap bmScreen2) {
        // TODO Auto-generated method stub

        // String fname = "Upload.png";
        File saved_image_file = new File(
                Environment.getExternalStorageDirectory()
                        + "/captured_Bitmap.png");
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

	/*Button btnCaptureScreen = (Button) findViewById(R.id.capturescreen);

    btnCaptureScreen.setOnClickListener(new OnClickListener() {

        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            View screen = null;
			screen.setDrawingCacheEnabled(true);
            Bitmap bmScreen = screen.getDrawingCache();
            saveImage(bmScreen);
            // showDialog(ID_SCREENDIALOG);
        }
    });
}

protected void saveImage(Bitmap bmScreen2) {
    // TODO Auto-generated method stub

    // String fname = "Upload.png";
    File saved_image_file = new File(
            Environment.getExternalStorageDirectory()
                    + "/captured_Bitmap.png");
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

}*/

	

	
	/*String mPath = Environment.getExternalStorageDirectory().toString() + "/" + ACCUWX.IMAGE_APPEND;   

	// create bitmap screen capture mCurrentUrlMask
	Bitmap bitmap;
	View v1 = mCurrentUrlMask.getRootView();
	v1.setDrawingCacheEnabled(true);
	bitmap = Bitmap.createBitmap(v1.getDrawingCache());
	v1.setDrawingCacheEnabled(false);

	OutputStream fout = null;
	File imageFile = new File(mPath);

	try {
	    fout = new FileOutputStream(imageFile);
	    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fout);
	    fout.flush();
	    fout.close();

	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
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
		 
		//startActivity(Intent.createChooser(sendIntent, getString(R.string.descr)));
		startActivity(Intent.createChooser(sendIntent, getString(R.drawable.hdpilogo)));
	}
}
