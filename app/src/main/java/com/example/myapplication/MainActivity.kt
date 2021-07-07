package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var btnSnackBar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         btnSnackBar=findViewById(R.id.btnSnackBar)

        btnSnackBar.setOnClickListener{
            val snackbar=Snackbar.make(it,"KB COODER",Snackbar.LENGTH_LONG).setAction("Action",null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView=snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()

        }

        }

    }
