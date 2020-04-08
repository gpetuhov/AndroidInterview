package com.gpetuhov.androidinterviewcodesamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    interface MyService {
        @GET(".")
        suspend fun getData(): String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.start_load_button).setOnClickListener {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BASIC

            val o = OkHttpClient.Builder().addNetworkInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder().baseUrl("https://www.google.com/").client(o).addConverterFactory(ScalarsConverterFactory.create()).build()
            val myService = retrofit.create(MyService::class.java)

            GlobalScope.launch(Dispatchers.IO) {
                val data = myService.getData()
                runOnUiThread {
                    if (data.length > 0) {
                        it.visibility = View.GONE
                    } else {
                        it.visibility = View.VISIBLE
                    }

                    findViewById<TextView>(R.id.result_text_view).text = data.take(100)
                    findViewById<TextView>(R.id.result_text_view).visibility = View.VISIBLE
                }
            }
        }

        // TODO: use "it" many times in .map {...}.filter {...} etc.

        // TODO: hardcode string instead of using strings.xml

        // TODO: use the same string or int in several places instead of using constants
        //  (in intents, activity on result or request code)
    }
}
