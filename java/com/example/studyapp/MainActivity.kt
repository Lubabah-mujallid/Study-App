package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var kotButton : Button
    private lateinit var andButton : Button
    private lateinit var clMain : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        andButton = findViewById(R.id.AndroidButton)
        kotButton = findViewById(R.id.KotlinButton)
        clMain = findViewById(R.id.clMain)

        andButton.setOnClickListener {
            val intent = Intent(this, AndroidReview::class.java)
            startActivity(intent)
        }
        kotButton.setOnClickListener {
            val intent = Intent(this, KotlinReview::class.java)
            startActivity(intent)
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.AndMenu -> {
                val intent = Intent(this, AndroidReview::class.java)
                startActivity(intent)
                return true
            }
            R.id.kotMenu -> {
                val intent = Intent(this, KotlinReview::class.java)
                startActivity(intent)
                return true
            }
            R.id.menuMain -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}