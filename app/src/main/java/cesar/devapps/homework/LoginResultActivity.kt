package cesar.devapps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class LoginResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__login_result)

        val textOut = findViewById<TextView>(R.id.text_result)
        textOut.text = " olá, ${intent.getStringExtra("loginOk")} \n" + " seu cpf é: ${intent.getStringExtra("passwordOk")}"
    }
}
