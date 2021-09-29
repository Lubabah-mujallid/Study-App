package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kotlin_review.*

class KotlinReview : AppCompatActivity() {

    private lateinit var myList:ArrayList<Lesson>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_review)

        myList = ArrayList()
        rvListkot.adapter = Recycler(this, myList)
        rvListkot.layoutManager = LinearLayoutManager(this)

        myList.add(Lesson("User Input","readLine()"))
        myList.add(Lesson("Data Types","•\tInt\n" + "•\tFloat\n" + "•\tString\n" + "•\tBoolean\n"))
        myList.add(Lesson("Try & Catch","•\tTry -> use to take user input to prevents possible errors \n" + "•\tCatch -> catch exceptions\n"))
        myList.add(Lesson("Parameters","The function uses the arguments passed to it for whatever It may need. And arguments can be of any data type."))
        myList.add(Lesson("Functions","Functions are isolated pieces of codes, create them once, then call them as many times as one needs."))
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