package com.example.colorview

import android.graphics.Color
import android.graphics.Color.DKGRAY
import android.graphics.Color.GRAY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()// init function
    }

     private fun setListener(){

         val clickableView : List<View> =listOf(Box_one_text,Box_two_text,Box_three_text,Box_Four_text,Box_Five_text,constrain_layout,button2
             ,button1,button3)

         for (item in clickableView){
             item.setOnClickListener {
                 makeColored(it)
             }
         }

     }

    private fun makeColored(view: View){
        when(view.id){
            R.id.Box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.Box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_Four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_Five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

           R.id.button1 ->Box_three_text.setBackgroundResource(R.color.my_red)
            R.id.button2 ->Box_Four_text.setBackgroundResource(R.color.my_yellow)

            R.id.button3 ->Box_Five_text.setBackgroundResource(R.color.my_green)

           else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}