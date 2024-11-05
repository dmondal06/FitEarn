package com.example.fitearn.auth

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await

object Login {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    suspend fun loginUser(email: String, password: String): Boolean {
        return try {
            auth.signInWithEmailAndPassword(email, password).await()
            true
        } catch (e: Exception) {
            false
        }
    }
}
