package com.sembozdemir.todokotlin.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainActivityUI(TodoListAdapter()).setContentView(this)
    }
}
