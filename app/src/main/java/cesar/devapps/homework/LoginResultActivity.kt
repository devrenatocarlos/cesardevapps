package cesar.devapps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class LoginResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__login_result)

        val stringHello: String = getString(R.string.hello)
        val stringYourCpf: String = getString(R.string.your_cpf)
        val textOut = findViewById<TextView>(R.id.text_result)


        textOut.text = " ${stringHello} ${intent.getStringExtra("loginOk")}, \n" + " ${stringYourCpf}: ${intent.getStringExtra("passwordOk")}"
    }
}
