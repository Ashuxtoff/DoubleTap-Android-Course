package com.ashuxtoff.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.ashuxtoff.app.SecondActivity.Companion.SECOND_ACTIVITY_COUNT_PARAM

class MainActivity : AppCompatActivity() {

    private companion object {

        const val MAIN_ACTIVITY_COUNT_PARAM = "main_activity_count_param"
    }

    private var count = 0

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(MAIN_ACTIVITY_COUNT_PARAM, count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        count = savedInstanceState.getInt(MAIN_ACTIVITY_COUNT_PARAM).inc()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SECOND_ACTIVITY_COUNT_PARAM, count)

            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MY_DEBUG", "${this.javaClass.canonicalName}: onResume")
        super.onResume()

        findViewById<TextView>(R.id.textView).text = count.toString()
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