package com.esoxjem.movieguide

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello.text = getString(R.string.hello_world)

        var a = "a"
        var b: String? = "abc"

        val l = a.length
        val len = b?.length

    }
}
