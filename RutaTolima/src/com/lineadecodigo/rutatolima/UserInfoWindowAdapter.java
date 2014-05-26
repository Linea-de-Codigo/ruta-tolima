package com.lineadecodigo.rutatolima;

import java.util.zip.Inflater;

import android.R.id;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import co.linea.rutatolima.R;

import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.model.Marker;

public class UserInfoWindowAdapter implements InfoWindowAdapter {
	LayoutInflater inflater = null;




	public UserInfoWindowAdapter(LayoutInflater layoutInflater) {
		this.inflater = inflater;
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getInfoContents(Marker marker) {
		View infoWindows=inflater.inflate(R.layout.user_info_windows, null);
		
		TextView title = (TextView)infoWindows.findViewById(R.id.title);
		
		
		title.setText(marker.getTitle());
		//description.setText(marker.getSnippet());
		
		// TODO Auto-generated method stub
		return (infoWindows);
	}

	@Override
	public View getInfoWindow(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
