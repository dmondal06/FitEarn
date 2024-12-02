package com.example.fitearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fitearn.AppNavigator
import com.example.fitearn.ui.theme.FitEarnTheme
import com.google.firebase.FirebaseApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        setContent {
            FitEarnTheme {
                // Navigate to your main entry page
                AppNavigator()
            }
        }

        // Initialize AppCenter using the app secret from AppSecrets
       // val appSecret = AppSecrets.getAppCenterSecret(this)
       // AppCenter.start(application, appSecret, Analytics::class.java, Crashes::class.java)
    }


}
