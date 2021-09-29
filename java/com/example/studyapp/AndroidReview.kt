package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_android_review.*

class AndroidReview : AppCompatActivity() {

    private lateinit var myList:ArrayList<Lesson>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_review)

        myList = ArrayList()
        rvListAnd.adapter = Recycler(this, myList)
        rvListAnd.layoutManager = LinearLayoutManager(this)

        myList.add(Lesson("Lesson 1","readLine()","more extra details here"))
        myList.add(Lesson("Lesson 2","•\tInt\n" + "•\tFloat\n" + "•\tString\n" + "•\tBoolean\n"))
        myList.add(Lesson("Lesson 3","•\tTry -> use to take user input to prevents possible errors \n" + "•\tCatch -> catch exceptions\n"))
        myList.add(Lesson("Lesson 4","The function uses the arguments passed to it for whatever It may need. And arguments can be of any data type."))
        myList.add(Lesson("Lesson 5","Functions are isolated pieces of codes, create them once, then call them as many times as one needs."))

        //title = "Android Review"
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