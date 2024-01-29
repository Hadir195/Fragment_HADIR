package com.example.fragment_saeful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Merah = findViewById<Button>(R.id.fragmentMerah)
        val Biru = findViewById<Button>(R.id.fragmentBiru)
        val Kuning = findViewById<Button>(R.id.fragmentKuning)
        val Hijau = findViewById<Button>(R.id.fragmentHijau)
        val Hitam = findViewById<Button>(R.id.fragmentHitam)

        Merah.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, RedFragment())
            fragmentTransaction.commit()
        }
        Biru.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlueFragment())
            fragmentTransaction.commit()
        }
        Kuning.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, YellowFragmen())
            fragmentTransaction.commit()
        }
        Hijau.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, GreenFragment())
            fragmentTransaction.commit()
        }
        Hitam.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlackFragment())
            fragmentTransaction.commit()
        }
    }
}
