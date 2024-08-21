package com.s9dp.permssiononandroid.coroutines

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.s9dp.permssiononandroid.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class CoroutinesActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coroutines)

        findViewById<Button>(R.id.countButton).setOnClickListener {
            count()
        }

        findViewById<TextView>(R.id.txtCount).apply {
            text = count.toString()
        }

    }

    private fun count() {
        count++
        findViewById<TextView>(R.id.txtCount).apply {
            text = count.toString()
        }
    }

    private fun  coroutinesScopes() {

        //Coroutine Scopes define the lifecycle of coroutines.

        CoroutineScope(Dispatchers.IO).launch {

        }

        GlobalScope.launch {
        } // Tied to Application lifetime

        lifecycleScope.launch {
        }

        MainScope().launch {

        }
    }


    private fun coroutinesDispatchers () {
        //

    }

    private fun coroutinesBuilder() {

        //Lunch it does not return any result insted returns a jobs
        //Ascy is another coroutnies builder
        //withcontext is used to sitch the context or dispacthce

    }
}