package com.ashuxtoff.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object {

        const val SECOND_ACTIVITY_COUNT_PARAM = "second_activity_count_param"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val count = intent.extras?.getInt(SECOND_ACTIVITY_COUNT_PARAM)!!
        findViewById<TextView>(R.id.text2).text = (count * count).toString()
    }

    override fun onStart() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onDestroy")
        super.onDestroy()
    }
}