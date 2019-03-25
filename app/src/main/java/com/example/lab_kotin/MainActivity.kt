package com.example.lab_kotin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var btnLogin: Button? = null
    var etIdEmail: EditText? = null
    var etPass : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initInstances()

    }

    private fun initInstances() {
        var btnLogin: Button
        btnLogin = findViewById<View>(R.id.btnLogin) as Button
        btnLogin.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v == etidEmail){


        }
        if (v === btnLogin) {
            Toast.makeText(this@MainActivity, "รหัสผ่านผิดพลาด", Toast.LENGTH_SHORT).show()
        }

    }
}
