package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Context;
import android.view.Menu;
import android.widget.Button;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     *
     */
    fun startGame(view: View) {
        val intent = Intent(this, GameActivity::class.java).apply {
        }
        startActivity(intent)
    }

}
