package com.imran.android.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var textSelectedFood: TextView
    private lateinit var editTextAddFoodName: EditText
    private var foodList = arrayListOf("Buger", "Pizza", "Sandwich", "Biriani", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textSelectedFood = findViewById(R.id.textSelectedFood)
        editTextAddFoodName = findViewById(R.id.editTextAddFoodName)
    }

    fun addFood(view: View) {
        val newFood = editTextAddFoodName.text.toString()
        foodList.add(newFood)

        editTextAddFoodName.text.clear()
    }

    fun decide(view: View) {
        val random = Random()
        val randomFood = random.nextInt(foodList.count())
        textSelectedFood.text = foodList[randomFood]
    }
}