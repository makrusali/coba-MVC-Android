package com.makrusali.cobamvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {

    /**
     * MVC PATTERN
     * DataMode adalah Model
     * TextView adalah view
     * MainActivity menampung controller
     */
    private lateinit var tvView: TextView
    private lateinit var btnGetData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        tvView = findViewById(R.id.tv_view)
        btnGetData = findViewById(R.id.btn_getdata)

        btnGetData.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_getdata -> {
                displayAppInTextView()
            }
        }
    }

    private fun getDataFromModel(): DataModel {
        return DataModel("Makrus Ali","makrus361@gmail.com")
    }

    private fun displayAppInTextView(){
        tvView.text = "My Name is : ${getDataFromModel().name} , My Email is : ${getDataFromModel().email}"
    }
}