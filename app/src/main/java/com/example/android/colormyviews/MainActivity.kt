package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit  var boxOneText: View
    private lateinit  var boxTwoText: View
    private lateinit  var boThreeText: View
    private lateinit  var boxFourText: View
    private lateinit  var boxFiveText: View
    private lateinit  var constraintLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOneText = findViewById<TextView>(R.id.box_one_text)
        boxTwoText = findViewById<TextView>(R.id.box_two_text)
        boThreeText = findViewById<TextView>(R.id.box_three_text)
        boxFourText = findViewById<TextView>(R.id.box_four_text)
        boxFiveText = findViewById<TextView>(R.id.box_five_text)
        constraintLayout = findViewById<TextView>(R.id.constraint_layout)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boThreeText,
                boxFourText, boxFiveText, constraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            //Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}