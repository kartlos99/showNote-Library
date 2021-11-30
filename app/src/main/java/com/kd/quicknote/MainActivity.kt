package com.kd.quicknote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kd.simplenotelib.ShowNote

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ShowNote.asToast(this, "hey there")

        ShowNote.asSnackBar(window.decorView, "my base snack")

    }
}