package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var email: String by mutableStateOf("")
        private set

    var password: String by mutableStateOf("")
        private set

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun onEmailChange(value: String) {
        this.email = value
    }

    fun onPasswordChange(value: String) {
        this.password = value
    }

    fun onSubmit() {
        email = ""
        password = ""
    }
}