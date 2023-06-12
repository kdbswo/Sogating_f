package com.example.sogating_f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.sogating_f.auth.IntroActivity
import com.example.sogating_f.utils.FirebaseAuthUtils
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {

    private val TAG = SplashActivity::class.java.simpleName

//    private val auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        Log.d(TAG, auth.currentUser?.uid.toString())

//        val uid = auth.currentUser?.uid.toString()
        val uid = FirebaseAuthUtils.getUid()
        if (uid == "null"){
            Handler().postDelayed({
                val intent = Intent(baseContext, IntroActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }else{
            Handler().postDelayed({
                val intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }



    }
}