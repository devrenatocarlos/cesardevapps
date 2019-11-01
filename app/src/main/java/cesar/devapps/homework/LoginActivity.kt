package cesar.devapps.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonConfirm = findViewById<Button>(R.id.button_login)
        val buttonCancel = findViewById<Button>(R.id.button_cancel)

        val editLogin = findViewById<EditText>(R.id.edit_login)
        val editPassword = findViewById<EditText>(R.id.edit_password)

        buttonConfirm.setOnClickListener {
            val intent = Intent(this, LoginResultActivity::class.java)
            val loginValue: String = editLogin.getText().toString()
            val passwordValue: String = editPassword.getText().toString()

            intent.putExtra("loginOk", loginValue)
            intent.putExtra("passwordOk",passwordValue)
            startActivity(intent)
        }

        buttonCancel.setOnClickListener {
           // val intent = Intent(this, MainActivity::class.java)
           // startActivity(intent)
            finish()
        }
    }
}
