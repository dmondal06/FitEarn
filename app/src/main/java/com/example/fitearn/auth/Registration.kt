package com.example.fitearn.auth

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.coroutines.tasks.await

object Registration {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    suspend fun registerUser(firstName: String,
                             lastName: String,
                             email: String,
                             password: String,
                             birthdate: String): Boolean {
        return try {
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            val profileUpdates = UserProfileChangeRequest.Builder()
                .setDisplayName("$firstName $lastName")
                .build()
            result.user?.updateProfile(profileUpdates)?.await()
            true
        } catch (e: Exception) {
            false
        }
    }
}
