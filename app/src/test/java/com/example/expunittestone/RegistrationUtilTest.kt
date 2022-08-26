package com.example.expunittestone

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {

        val result = RegistrationUtil.validateRegistrationUtil(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true` () {

        val result = RegistrationUtil.validateRegistrationUtil(
            "Phillip",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {

        val result = RegistrationUtil.validateRegistrationUtil(
            "Carl",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false` () {

        val result = RegistrationUtil.validateRegistrationUtil(
            "Phillip",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `less than two digit password returns false`() {

        val result = RegistrationUtil.validateRegistrationUtil(
            "carl",
            "1",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect repeated password returns false`() {

        val result = RegistrationUtil.validateRegistrationUtil(
            "carl",
            "123",
            "132"
        )

        assertThat(result).isFalse()
    }
}