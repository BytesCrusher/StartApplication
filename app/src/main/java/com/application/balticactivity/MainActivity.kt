package com.application.balticactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {//вызывается при открытии приложения
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//передача ресурса разметки


        clearButton.setOnClickListener {
            nameInput.setText("")
            Toast.makeText(this, R.string.cleared_text, Toast.LENGTH_SHORT).show()
        }

        //листинер на изменение текста в поле ввода
        nameInput.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //будем изменять строку только если пользователь что-то ввел
                nameText.text = p0?.takeIf { it.isNotBlank() }
                    ?.let { name -> resources.getString(R.string.hello_string, name) }

                //обращаемся к строке, если она не нул, то вызываем метод
                // из нот эмпти и результат из нее проверяем не пусто ли оно
                clearButton.isEnabled = p0?.let{it.isNotEmpty()} ?: false
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })

        makeLongOperationButton.setOnClickListener{
            makeLongOperation()
        }
    }

    private fun makeLongOperation() {
        longOperationProgress.visibility = View.VISIBLE
        makeLongOperationButton.isEnabled = false
        //выполнить действие спустя заданное время
        Handler().postDelayed({
            longOperationProgress.visibility = View.GONE
            makeLongOperationButton.isEnabled = true
            Toast.makeText(this,R.string.long_operation_complete, Toast.LENGTH_SHORT).show()
        }, 2000)
    }

    /*override fun onResume() {//пользователь сможет взаимодействовать с экраном
        super.onResume()
    }*/
}