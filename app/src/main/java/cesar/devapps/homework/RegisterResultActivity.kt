package cesar.devapps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class RegisterResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__register_result)

        val textOut = findViewById<TextView>(R.id.text_result)
        textOut.text = " olá ${intent.getStringExtra("registerOk")} \n" + " seu cpf é: ${intent.getStringExtra("passwordOk")}"
    }
}
