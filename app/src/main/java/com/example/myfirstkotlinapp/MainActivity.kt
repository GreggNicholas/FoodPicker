package com.example.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese", "Ramen", "Pizza", "Sushi", "Hamburgers", "Italian", "Indian", "Seafood" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decide_button.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selected_foodtype_text.text = foodList[randomFood]
        }

        add_food_button.setOnClickListener {
            val addNewFood = add_Food_text.text.toString()
            foodList.add(addNewFood)
            add_Food_text.text.clear()
        }
    }
}
