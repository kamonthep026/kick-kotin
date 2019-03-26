package com.example.lab_kotin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnLogin:Button? = null
    private var etIdEmail: EditText? = null
    private var etPass : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initInstances()

    }

    private fun initInstances() {
        btnLogin = findViewById<Button>(R.id.btnLogin)
        etIdEmail = findViewById<EditText>(R.id.etIdEmail)
        etPass = findViewById<EditText>(R.id.etPass)
        btnLogin!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        etIdEmail?.text
        etPass?.text
        if (!isValidIdEmail("email")) {
                etIdEmail?.error = "ไม่พบบัญชี Email ของคุณ"
            }
        if (!isValidPassword("pass")) {
                etPass?.error = "รหัสผ่านผิดพลาด"
            }
    }

    private fun isValidIdEmail(email:String):Boolean {
        val regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    // validating password with retype password
    private fun isValidPassword(pass:String):Boolean {
        val regex = "^.{6,}$"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(pass)
        return matcher.matches()
    }
}


