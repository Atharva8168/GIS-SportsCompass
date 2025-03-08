package com.example.sportscompass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SportSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_selector)

        val area = intent.getStringExtra("Area")
        when(area){
            "Andheri" -> openAndheri()
            "Bandra" -> openBandra()
            "Borivali" -> openBorivali()
            "Byculla" -> openByculla()
            "Chruchgate" -> openChruchgate()
            "Dadar" -> openDadar()
            "Ghatkopar" -> openGhatkopar()
            "Kurla" -> openKurla()
            "Sion" -> openSion()
            "Thane" -> openThane()
            "CSMT" -> openCSMT()
        }


        }

    private fun openCSMT() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, CSMTCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, CSMTFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in CSMT.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, CSMTSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in CSMT.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in CSMT.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            val intent = Intent(this, CSMTTennisMapsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openChruchgate() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, ChruchgateCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, ChruchgateFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Chruchgate.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, ChruchgateSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Chruchgate.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Chruchgate.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Chruchgate.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openByculla() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, BycullaCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, BycullaFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Byculla.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, BycullaSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Byculla.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Byculla.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Byculla.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openBorivali() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, BorivaliCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, BorivaliFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Borivali.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, BorivaliSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Borivali.", Toast.LENGTH_LONG).show()

        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Borivali.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Borivali.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openKurla() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, KurlaCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, KurlaFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            val intent = Intent(this, KurlaFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Kurla.", Toast.LENGTH_LONG).show()
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Kurla.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Kurla.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Kurla.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openGhatkopar() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, GhatkoparCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, GhatkoparFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            val intent = Intent(this, GhatkoparBasketballMapsActivity::class.java)
            startActivity(intent)
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Ghatkopar.", Toast.LENGTH_LONG).show()
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Ghatkopar.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Ghatkopar.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Ghatkopar.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openThane() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, ThaneCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, ThaneFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Thane.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, ThaneSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Thane.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Thane.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Thane.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openSion() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, SionCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, SionFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Sion.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, SionSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Sion.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Sion.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Sion.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openBandra() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, BandraCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, BandraFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Basketball in Bandra.", Toast.LENGTH_LONG).show()
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, BandraSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Bandra.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Bandra.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Bandra.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openAndheri() {
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, AndheriCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, AndheriFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            val intent = Intent(this, AndheriBasketballMapsActivity::class.java)
            startActivity(intent)        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Swimming in Andheri.", Toast.LENGTH_LONG).show()
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Hockey in Andheri.", Toast.LENGTH_LONG).show()
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Kabaddi in Andheri.", Toast.LENGTH_LONG).show()
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Andheri.", Toast.LENGTH_LONG).show()
        }
    }

    private fun openDadar(){
        val cricketButton = findViewById<Button>(R.id.cricketButton)
        cricketButton.setOnClickListener {
            val intent = Intent(this, DadarCricketMapsActivity::class.java)
            startActivity(intent)
        }

        val footballButton = findViewById<Button>(R.id.footballButton)
        footballButton.setOnClickListener {
            val intent = Intent(this, DadarFootballMapsActivity::class.java)
            startActivity(intent)
        }

        val basketballButton = findViewById<Button>(R.id.basketballButton)
        basketballButton.setOnClickListener {
            val intent = Intent(this, DadarBasketballMapsActivity::class.java)
            startActivity(intent)
        }

        val swimmingButton = findViewById<Button>(R.id.swimmingButton)
        swimmingButton.setOnClickListener {
            val intent = Intent(this, DadarSwimmingMapsActivity::class.java)
            startActivity(intent)
        }

        val hockeyButton = findViewById<Button>(R.id.hockeyButton)
        hockeyButton.setOnClickListener {
            val intent = Intent(this, DadarHockeyMapsActivity::class.java)
            startActivity(intent)
        }

        val kabaddiButton = findViewById<Button>(R.id.kabaddiButton)
        kabaddiButton.setOnClickListener {
            val intent = Intent(this, DadarKabaddiMapsActivity::class.java)
            startActivity(intent)
        }

        val tennisButton = findViewById<Button>(R.id.tennisButton)
        tennisButton.setOnClickListener {
            Toast.makeText(this, "No facility avaliable rightnow for Tennis in Dadar.", Toast.LENGTH_LONG).show()
        }

    }
}