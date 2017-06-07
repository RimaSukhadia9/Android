package cs442.xqiu12.letspot;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String locationProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
        //        .findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
       // Location mCurrentLocation = locationProvider.getLastLocation();


        // Add a marker in IIT_Chicago and move the camera
        /*LatLng iitChicago = new LatLng(41.83, -87.62);
        LatLng plot1 = new LatLng(41.88, -87.62);
        LatLng plot2 = new LatLng(41.87, -87.629);
        LatLng plot3 = new LatLng(41.83, -87.629);
        LatLng plot4 = new LatLng(41.83, -87.626);
        mMap.addMarker(new MarkerOptions().position(iitChicago).title("IITChicago")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(plot1).title("Parking lot A4 of IITChicago").snippet("A4"));
        mMap.addMarker(new MarkerOptions().position(plot2).title("Parking lot A6 of IITChicago").snippet("A6"));
        mMap.addMarker(new MarkerOptions().position(plot3).title("Parking lot C5V of IITChicago").snippet("C5V lot"));
        mMap.addMarker(new MarkerOptions().position(plot4).title("Parking lot D5V of IITChicago").snippet("D5V lot"));*/

        LatLng plot1 = new LatLng(41.8830, -87.6763);
        LatLng plot2 = new LatLng(41.8856, -87.6215);
        LatLng plot3 = new LatLng(41.9004, -87.6226);
        LatLng plot4 = new LatLng(41.7995, -87.5881);
        LatLng plot5 = new LatLng(41.8785, -87.6464);
        LatLng plot6 = new LatLng(41.8772, -87.6422);
        LatLng plot7 = new LatLng(41.8898, -87.6229);
        LatLng plot8 = new LatLng(41.8899, -87.6323);
        LatLng plot9 = new LatLng(41.8537, -87.6316);
        LatLng plot10 = new LatLng(41.8758, -87.6319);


        mMap.addMarker(new MarkerOptions().position(plot1).title("Red Top Parking Inc").snippet("1959 W Washington Blvd, Chicago, IL 60612"));
        mMap.addMarker(new MarkerOptions().position(plot2).title("Standarad Parking").snippet("200 E Randolph St, Chicago, IL 60601"));
        mMap.addMarker(new MarkerOptions().position(plot3).title("Drake Tower Garage").snippet("174 E Walton Pl, Chicago, IL 60611"));
        mMap.addMarker(new MarkerOptions().position(plot4).title("Parking Space Inc.").snippet("1525 E 53rd St #420, Chicago, IL 60615"));
        mMap.addMarker(new MarkerOptions().position(plot5).title("Park One").snippet("762 W Jackson Blvd, Chicago, IL 60661"));
        mMap.addMarker(new MarkerOptions().position(plot6).title("People's Auto Parking").snippet("568 W Van Buren St, Chicago, IL 60607"));
        mMap.addMarker(new MarkerOptions().position(plot7).title("Downtown Parking").snippet("401 N Michigan Ave, Chicago, IL 60611"));
        mMap.addMarker(new MarkerOptions().position(plot8).title("InterParking").snippet("345 N LaSalle St, Chicago, IL 60622"));
        mMap.addMarker(new MarkerOptions().position(plot9).title("Central Parking").snippet("2155 S Wentworth Ave, Chicago, IL 60616"));
        mMap.addMarker(new MarkerOptions().position(plot10).title("Impark").snippet("One Financial Place, 440 S La Salle St, Chicago, IL 60605"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(plot1, 12));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {

            /*
            @Override
            public boolean onMarkerClick(Marker arg0) {
                if (arg0.getTitle().equals("IITChicago")) // if marker source is clicked
                    Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast

                if (arg0.getTitle().equals("Parking lot A4 of IITChicago")) // if marker source is clicked
                    {
                        Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                        startActivity(intent_A4);
                    }
                //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                if (arg0.getTitle().equals("Parking lot A6 of IITChicago")) // if marker source is clicked
                {

                        Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                        startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Parking lot C5V of IITChicago")) // if marker source is clicked
                {

                        Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                        startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Parking lot D5V of IITChicago")) // if marker source is clicked
                {

                        Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                        startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                return true;*/


            @Override
            public boolean onMarkerClick(Marker arg0) {
                if (arg0.getTitle().equals("Red Top Parking Inc")) // if marker source is clicked
                    Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast

                if (arg0.getTitle().equals("Standarad Parking")) // if marker source is clicked
                {
                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);
                }
                //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                if (arg0.getTitle().equals("Drake Tower Garage")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Parking Space Inc.")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Park One")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("People's Auto Parking")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Downtown Parking")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("InterParking")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Central Parking")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                if (arg0.getTitle().equals("Impark")) // if marker source is clicked
                {

                    Intent intent_A4 = new Intent(getApplicationContext(), A4_plot.class);
                    startActivity(intent_A4);

                    //Toast.makeText(MapsActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                }
                return true;

            }

        });

        
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            // Show rationale and request permission.
        }

    }

}
