package com.example.atl7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.atl7.databinding.ActivityMapsBinding;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_maps);
        setSupportActionBar(toolbar);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private BitmapDescriptor getResizedIcon(int drawableId, int width, int height) {
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(), drawableId);

        Bitmap resizedBitmap = Bitmap.createScaledBitmap(imageBitmap, width, height, false);

        return BitmapDescriptorFactory.fromBitmap(resizedBitmap);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        int iconWidth = 100;
        int iconHeight = 100;
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        LatLng tanger = new LatLng(35.7767, -5.8039);
        LatLng rabat = new LatLng(34.0209, -6.8416);
        LatLng casa = new LatLng(33.5883, -7.6114);
        LatLng agadir = new LatLng(30.4278, -9.5981);

//        mMap.addMarker(new MarkerOptions().position(tanger).title("Tanger"));
//        mMap.addMarker(new MarkerOptions().position(rabat).title("Rabat"));
//        mMap.addMarker(new MarkerOptions().position(casa).title("Casablanca"));
//        mMap.addMarker(new MarkerOptions().position(agadir).title("Agadir"));

        mMap.addMarker(new MarkerOptions()
                .position(rabat)
                .title("Rabat")
                .icon(getResizedIcon(R.drawable.rabat, iconWidth, iconHeight))); // <--- L'icône

        mMap.addMarker(new MarkerOptions()
                .position(casa)
                .title("Casablanca")
                .icon(getResizedIcon(R.drawable.casablanca, iconWidth, iconHeight)));

        mMap.addMarker(new MarkerOptions()
                .position(tanger)
                .title("Tanger")
                .icon(getResizedIcon(R.drawable.tanger, iconWidth, iconHeight)));// <--- L'icône

        mMap.addMarker(new MarkerOptions()
                .position(agadir)
                .title("Agadir")
                .icon(getResizedIcon(R.drawable.agadir, iconWidth, iconHeight)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rabat, 10));
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_maps, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_normal) {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            return true;
        }
        else if (id == R.id.menu_satellite) {
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}