package com.gpetuhov.androidinterviewcodesamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// TODO: make this a God Object example with network interactions, bad code practices, etc...

class MainActivity : AppCompatActivity() {

    var a = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: add button, load something from network on click, show progress, show result,
        //  lose result on screen rotation, use "it" many times, use nested closures, use bad variable names
    }
}
