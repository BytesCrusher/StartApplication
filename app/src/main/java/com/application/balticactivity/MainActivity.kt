package com.application.balticactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {//вызывается при открытии приложения
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//передача ресурса разметки

        val nameInput = findViewById<EditText>(R.id.nameInput)//найдем инпут
        val nameTextView = findViewById<TextView>(R.id.nameText)//найдем текст вью элемент

        nameInput.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //будем изменять строку только если пользователь что-то ввел
                nameTextView.text = p0?.takeIf { it.isNotBlank() }?.let { name -> resources.getString(R.string.hello_string, name) }
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })//листинер на изменение текста в поле ввода

        //чтобы найти вью сделаем поиск элемента разметки по его айди

        //поиск элемента типа TextView который имеет айди textView
        /*val textView = findViewById<TextView>(R.id.textView)
        textView.text = "new Text"
        textView.setText(R.string.app_name)

        val text = resources.getString(R.string.text_view)*/

        /*
        это чтобы показать на экране информацию о собранном приложении
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = """
            BuildType=${BuildConfig.BUILD_TYPE}
            flavor=${BuildConfig.FLAVOR}
            VersionCode = ${BuildConfig.VERSION_CODE}
            VersionName = ${BuildConfig.VERSION_NAME}
            ApplicationId = ${BuildConfig.APPLICATION_ID}
        """*/
    }

    /*override fun onResume() {//пользователь сможет взаимодействовать с экраном
        super.onResume()
    }*/
}