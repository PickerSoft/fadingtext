package com.picker.fadingtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tomer.fadingtextview.FadingTextView
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var ftv:FadingTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ftv = findViewById<FadingTextView>(R.id.fadingTextView)
        ftv.setTexts(arrayOf("Hello", "Hi", "Bye~"))
        ftv.setTimeout(1000,TimeUnit.MILLISECONDS)
    }

    fun onFast(view: View) {
        ftv.setTimeout(300,TimeUnit.MILLISECONDS)
    }
}