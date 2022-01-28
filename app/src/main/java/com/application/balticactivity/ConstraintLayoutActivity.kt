package com.application.balticactivity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_constraint_layout.*

class ConstraintLayoutActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        toggleLastNameButton.setOnClickListener{
            userInfoGroup.isVisible = !userInfoGroup.isVisible
        }

        userInfoGroup.referencedIds.forEach{ id ->
            findViewById<View>(id).setOnClickListener{
                Toast.makeText(this, "clicked on view $id in group", Toast.LENGTH_SHORT).show()

            }
        }


    }
}