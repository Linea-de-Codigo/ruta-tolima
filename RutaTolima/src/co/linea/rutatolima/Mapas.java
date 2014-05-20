package co.linea.rutatolima;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;

public class Mapas extends FragmentActivity {
	
	GoogleMap map;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapas);
		
		map =((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		map.setMyLocationEnabled(true);
		
		MarkerOptions marker1 = new MarkerOptions();
		marker1.title("Peaje");
		marker1.snippet("Peaje aqui");
		LatLng position1 = new LatLng(4.50757, -74.991651);
		marker1.position(position1);
		marker1.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj));
		map.addMarker(marker1);
		
		MarkerOptions marker2 = new MarkerOptions();
		marker2.title("Peaje");
		marker2.snippet("Peaje aqui");
		LatLng position2 = new LatLng(4.450084, -75.087487);
		marker2.position(position2);
		marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.est));
		map.addMarker(marker2);
		
		MarkerOptions marker3 = new MarkerOptions();
		marker3.title("Peaje");
		marker3.snippet("Peaje aqui");
		LatLng position3 = new LatLng(4.670638,-74.937809);
		marker3.position(position3);
		marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(marker3);
		
		//puntos de choque
		
		MarkerOptions choque1 = new MarkerOptions();
		choque1.title("Riesgo De Choque");
		choque1.snippet("Curva Peligrosa");
		LatLng positionc1 = new LatLng(4.256279,-74.59548);
		choque1.position(positionc1);
		choque1.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque1);
		
		MarkerOptions choque2 = new MarkerOptions();
		choque2.title("Riesgo De Choque");
		choque2.snippet("Curva Peligrosa");
		LatLng positionc2 = new LatLng(4.259788,-74.599572);
		choque2.position(positionc2);
		choque2.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque2);
		
		MarkerOptions choque3 = new MarkerOptions();
		choque3.title("Riesgo De Choque");
		choque3.snippet("Curva Peligrosa");
		LatLng positionc3 = new LatLng(4.259903,-74.537033);
		choque3.position(positionc3);
		choque3.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque3);
		
		MarkerOptions choque4 = new MarkerOptions();
		choque4.title("Riesgo De Choque");
		choque4.snippet("Curva Peligrosa");
		LatLng positionc4 = new LatLng(4.272368,-74.56596);
		choque4.position(positionc4);
		choque4.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque4);
		
		MarkerOptions choque5 = new MarkerOptions();
		choque5.title("Riesgo De Choque");
		choque5.snippet("Curva Peligrosa");
		LatLng positionc5 = new LatLng(4.284317,-75.037114);
		choque5.position(positionc5);
		choque5.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque5);
		
		MarkerOptions choque6 = new MarkerOptions();
		choque6.title("Riesgo De Choque");
		choque6.snippet("Curva Peligrosa");
		LatLng positionc6 = new LatLng(4.432729,-74.385673);
		choque6.position(positionc6);
		choque6.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque6);
		
		MarkerOptions choque7 = new MarkerOptions();
		choque7.title("Riesgo De Choque");
		choque7.snippet("Curva Peligrosa");
		LatLng positionc7 = new LatLng(4.432729,-74.385673);
		choque7.position(positionc7);
		choque7.icon(BitmapDescriptorFactory.fromResource(R.drawable.ch));
		map.addMarker(choque7);
		
		//puntos de derrumbe
		
		MarkerOptions Derrumbe1 = new MarkerOptions();
		Derrumbe1.title("Riesgo De Derrumbe");
		Derrumbe1.snippet("Derrumbe");
		LatLng positiond1 = new LatLng(4.215847,-74.960785);
		Derrumbe1.position(positiond1);
		Derrumbe1.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe1);
		
		MarkerOptions Derrumbe2 = new MarkerOptions();
		Derrumbe2.title("Riesgo De Derrumbe");
		Derrumbe2.snippet("Derrumbe");
		LatLng positiond2 = new LatLng(4.223876,-74.975795);
		Derrumbe2.position(positiond2);
		Derrumbe2.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe2);
		
		MarkerOptions Derrumbe3 = new MarkerOptions();
		Derrumbe3.title("Riesgo De Derrumbe");
		Derrumbe3.snippet("Derrumbe");
		LatLng positiond3 = new LatLng(4.236186,-74.713847);
		Derrumbe3.position(positiond3);
		Derrumbe3.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe3);
		
		MarkerOptions Derrumbe4 = new MarkerOptions();
		Derrumbe4.title("Riesgo De Derrumbe");
		Derrumbe4.snippet("Derrumbe");
		LatLng positiond4 = new LatLng(4.248915,-74.733582);
		Derrumbe4.position(positiond4);
		Derrumbe4.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe4);
		
		MarkerOptions Derrumbe5 = new MarkerOptions();
		Derrumbe5.title("Riesgo De Derrumbe");
		Derrumbe5.snippet("Derrumbe");
		LatLng positiond5 = new LatLng(4.287999,-75.04008);
		Derrumbe5.position(positiond5);
		Derrumbe5.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe5);
		
		MarkerOptions Derrumbe6 = new MarkerOptions();
		Derrumbe6.title("Riesgo De Derrumbe");
		Derrumbe6.snippet("Derrumbe");
		LatLng positiond6 = new LatLng(4.255141,-74.52775);
		Derrumbe6.position(positiond6);
		Derrumbe6.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe6);
		
		MarkerOptions Derrumbe7 = new MarkerOptions();
		Derrumbe7.title("Riesgo De Derrumbe");
		Derrumbe7.snippet("Derrumbe");
		LatLng positiond7 = new LatLng(4.255464,-74.537791);
		Derrumbe7.position(positiond7);
		Derrumbe7.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe7);
		
		MarkerOptions Derrumbe8 = new MarkerOptions();
		Derrumbe8.title("Riesgo De Derrumbe");
		Derrumbe8.snippet("Derrumbe");
		LatLng positiond8 = new LatLng(4.25876,-74.531072);
		Derrumbe8.position(positiond8);
		Derrumbe8.icon(BitmapDescriptorFactory.fromResource(R.drawable.der));
		map.addMarker(Derrumbe8);
		
		//peajes
		
		MarkerOptions Peaje1 = new MarkerOptions();
		Peaje1.title("Peaje");
		Peaje1.snippet("Peaje");
		LatLng positionp1 = new LatLng(4.24559,-74.880599);
		Peaje1.position(positionp1);
		Peaje1.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj));
		map.addMarker(Peaje1);
		
		MarkerOptions Peaje2 = new MarkerOptions();
		Peaje2.title("Peaje");
		Peaje2.snippet("Peaje");
		LatLng positionp2 = new LatLng(4.269498,-74.500136);
		Peaje2.position(positionp2);
		Peaje2.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj));
		map.addMarker(Peaje2);
		
		MarkerOptions Peaje3 = new MarkerOptions();
		Peaje3.title("Peaje");
		Peaje3.snippet("Peaje");
		LatLng positionp3 = new LatLng(4.300324,-75.049819);
		Peaje3.position(positionp3);
		Peaje3.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj));
		map.addMarker(Peaje3);
		
		MarkerOptions Peaje4 = new MarkerOptions();
		Peaje4.title("Peaje");
		Peaje4.snippet("Peaje");
		LatLng positionp4 = new LatLng(4.50054,-74.36472);
		Peaje4.position(positionp4);
		Peaje4.icon(BitmapDescriptorFactory.fromResource(R.drawable.pj));
		map.addMarker(Peaje4);
		
		
		//Taller
		
		MarkerOptions Taller1 = new MarkerOptions();
		Taller1.title("Taller");
		Taller1.snippet("Taller Mecanico");
		LatLng positiont1 = new LatLng(4.50054,-74.36472);
		Taller1.position(positiont1);
		Taller1.icon(BitmapDescriptorFactory.fromResource(R.drawable.tll));
		map.addMarker(Taller1);
		
		MarkerOptions Taller2 = new MarkerOptions();
		Taller2.title("Taller");
		Taller2.snippet("Taller Mecanico");
		LatLng positiont2 = new LatLng(4.50054,-74.36472);
		Taller2.position(positiont2);
		Taller2.icon(BitmapDescriptorFactory.fromResource(R.drawable.tll));
		map.addMarker(Taller2);
		
		
		/*Polygon polygon = map.addPolygon(new PolygonOptions()
        .add(new LatLng(4.215847,-74.960785),
        new LatLng(4.25876,-74.531072))
        .strokeColor(Color.BLUE)
        .fillColor(Color.BLUE));*/


		
	}
	


	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapas, menu);
		return true;
	}



}
