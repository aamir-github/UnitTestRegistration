package com.example.expunittestone

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /*
    the input is not valid if...
    ... the username or password is empty
    ... the username is already taken
    ... the confirmed password is not the same as the real password
    ... the password contains the less than 2 digits
    */

    // initial shape of the function to be implemented, at this shape all test cases are written first
    /*fun validateRegistrationUtil(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        return true
    }*/

    // after writing test cases the actual function implementation is completed
    fun validateRegistrationUtil(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }

        if (userName in existingUsers) {
            return false
        }

        if (password != confirmPassword) {
            return false
        }

        if (password.count() { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}