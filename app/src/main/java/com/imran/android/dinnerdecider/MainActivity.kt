package com.imran.android.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
//    var textSelectedFood: TextView = findViewById(R.id.textSelectedFood) as TextView
//    private val editTextAddFoodName: EditText = findViewById(R.id.editTextAddFoodName)
//    private val buttonAddFood: Button = findViewById(R.id.buttonAdd)
    private var buttonDecide: Button = TODO()
//    private var foodList = arrayListOf("Buger", "Pizza", "Sandwich", "Biriani", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonDecide = findViewById(R.id.buttonDecide)
    }

    fun addFood(view: View) {
//        val newFood = editTextAddFoodName.text.toString()
//        foodList.add(newFood)

//        editTextAddFoodName.text.clear()
//        editTextAddFoodName.clearComposingText()
    }

    fun decide(view: View) {
//        val random = Random()
//        val randomFood = random.nextInt(foodList.count())
//        textSelectedFood.text = foodList[randomFood]
    }
}