package com.example.sportscompass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.sportscompass.databinding.ActivityBandraFootballMapsBinding
import com.google.maps.android.data.kml.KmlLayer

class BandraFootballMapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityBandraFootballMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBandraFootballMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)

//        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)
//        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        val mumbai = LatLng(19.08980139325627, 72.88849483717746)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mumbai, 15f))

        val layer = KmlLayer(mMap, R.raw.bandra_football, this)
        layer.addLayerToMap()


        layer.setOnFeatureClickListener {
            val dialogView = LayoutInflater.from(this).inflate(R.layout.popup_bandra_football, null)

            // Create the dialog builder
            val builder = AlertDialog.Builder(this)
            builder.setView(dialogView)
            builder.setCancelable(true)

            // Create the dialog
            val dialog = builder.create()

            dialog.show()
        }
    }
}