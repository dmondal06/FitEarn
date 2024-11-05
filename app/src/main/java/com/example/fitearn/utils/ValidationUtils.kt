package com.example.fitearn.utils

//This class is responsible for validating the inputs for the login and registration field
object ValidationUtils {

    // Validates first name with basic rules
    fun validateFirstName(firstName: String): String {
        return when {
            firstName.isEmpty() -> "First name cannot be empty"
            firstName.length < 3 || firstName.length > 30 -> "First name must be between 3 and 30 characters"
            else -> ""
        }
    }

    // Validates last name with basic rules
    fun validateLastName(lastName: String): String {
        return when {
            lastName.isEmpty() -> "Last name cannot be empty"
            lastName.length < 3 || lastName.length > 30 -> "Last name must be between 3 and 30 characters"
            else -> ""
        }
    }

    // Validates email format
    fun validateEmail(email: String): String {
        return if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            "Invalid email format"
        } else ""
    }

    // Validates password with basic rules
    fun validatePassword(password: String): String {
        return if (password.length < 8) {
            "Password must be at least 8 characters"
        } else ""
    }

    // Validates confirm password to ensure it matches the original password
    fun validateConfirmPassword(password: String, confirmPassword: String): String {
        return if (confirmPassword != password) {
            "Passwords do not match"
        } else ""
    }

    // Validates birthdate format (dd/mm/yyyy)
    fun validateBirthdate(birthdate: String): String {
        val regex = Regex("^\\d{2}/\\d{2}/\\d{4}$")
        return if (!regex.matches(birthdate)) {
            "Birthdate must be in the format dd/mm/yyyy"
        } else ""
    }
}
