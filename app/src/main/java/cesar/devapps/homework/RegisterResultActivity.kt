package cesar.devapps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class RegisterResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__register_result)
        val stringHello: String = getString(R.string.hello)
        val stringYourCpf: String = getString(R.string.your_cpf)
        val textOut = findViewById<TextView>(R.id.text_result)
        textOut.text = " ${stringHello} ${intent.getStringExtra("registerOk")} \n" + " ${stringYourCpf}: ${intent.getStringExtra("passwordOk")}"
    }
}
