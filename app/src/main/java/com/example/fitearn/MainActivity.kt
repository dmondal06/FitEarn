package com.example.fitearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fitearn.ui.theme.FitEarnTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
