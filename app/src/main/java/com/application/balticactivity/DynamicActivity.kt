package com.application.balticactivity

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.item_text.view.*
import kotlin.random.Random

class DynamicActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        addTextButton.setOnClickListener(){
            val textToAdd = textInput.text.toString()

            //создает вью из ресурса разметки
            val view = layoutInflater.inflate(R.layout.item_text, dynamicContainer, false)
            view.apply {
                textView.text = textToAdd

                deleteButton.setOnClickListener(){
                    dynamicContainer.removeView(this)
                }
            }
            dynamicContainer.addView(view)


            //получить вью из лаяут ресурса


            /*val textViewToAdd = TextView(this).apply {
                text = textToAdd
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    gravity = when(Random.nextInt(3)) {
                        0 -> Gravity.CENTER
                        1 -> Gravity.END
                        else -> Gravity.START
                    }
                }
            }*/

            /*//создает вью из ресурса разметки
            val view = layoutInflater.inflate(R.layout.item_text, dynamicContainer, true)*/
        }
    }
}