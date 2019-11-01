package cesar.devapps.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val editLogin = findViewById<EditText>(R.id.edit_login)
        val editPassword = findViewById<EditText>(R.id.edit_password)

        val buttonConfirm = findViewById<Button>(R.id.button_confirm)
        val buttonCancel = findViewById<Button>(R.id.button_cancel)

        buttonConfirm.setOnClickListener {
            val intent = Intent(this, RegisterResultActivity::class.java)
            val loginValue: String = editLogin.text.toString()
            val passwordValue: String = editPassword.text.toString()

            intent.putExtra("registerOk",loginValue)
            intent.putExtra("passwordOk",passwordValue)
            startActivity(intent)
        }

        buttonCancel.setOnClickListener {
          finish()
        }
    }
}
