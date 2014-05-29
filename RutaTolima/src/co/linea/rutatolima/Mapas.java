package co.linea.rutatolima;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapas extends FragmentActivity {

	GoogleMap map;
	//-----------------------------------------------------------------------------------
	
    //--------------------------------------------------------------------------------
	
	private static final LatLng colombia = new LatLng(4.50757,-74.991651);
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapas);
		
		map =((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		map.setMyLocationEnabled(true);
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(colombia, 9.5f));
		map.setBuildingsEnabled(true);
		map.getUiSettings().setRotateGesturesEnabled(true);
		
		
		
		Marker marker1 = map.addMarker(new MarkerOptions()
		.title("Peaje")
		.snippet("Peaje aqui")
		.position (colombia)
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj))
		//.showInfoWindow();
		);
		
		//----------------------------------------------------------------------------
		
		//----------------------------------------------------------------------------
		
		MarkerOptions marker2 = new MarkerOptions();
		marker2.title("Peaje");
		marker2.snippet("Peaje aqui");
		LatLng position2 = new LatLng(4.450084, -75.087487);
		marker2.position(position2);
		marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.est));
		map.addMarker(marker2);
		
		MarkerOptions marker3 = new MarkerOptions();
		marker3.title("prueba");
		marker3.snippet("Peaje aqui");
		LatLng position3 = new LatLng(4.670638,-74.937809);
		marker3.position(position3);
		marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(marker3);
		
		
		
		map.setOnMarkerClickListener(new OnMarkerClickListener() {

	        public boolean onMarkerClick(Marker marker3) {
	        	Intent mainIntent = new Intent().setClass(
                        Mapas.this, LoginActivity.class);
                startActivity(mainIntent);
	            return false;
	        }
    });
		
	
	
	map.setOnMarkerClickListener(new OnMarkerClickListener() {

		public boolean onMarkerClick(Marker marker2) {
        	Intent mainIntent = new Intent().setClass(
                    Mapas.this, Activity_Marker.class);
            startActivity(mainIntent);
            return false;
        }

	
});
	
}
	
	protected Context getActivity() {
		// TODO Auto-generated method stub
		return null;
	}

	private static final int ANIMATION_DURATION = 500;
	
	private LatLng trackedPosition;
	
	public Mapas OnTouchListener (View v){
		
		
		return null;
		
		
	}
	
	
	
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapas, menu);
		return true;
	}
	
	
	public void social (View v){
		Intent in = new Intent(Mapas.this,Activity_Social.class);
		startActivity(in);
		
	}


	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


	
	
	


	public void onMapClick(LatLng point) {
		// TODO Auto-generated method stub
		
	}



}
