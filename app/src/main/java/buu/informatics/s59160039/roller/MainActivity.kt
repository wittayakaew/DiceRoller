package buu.informatics.s59160039.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDrive()}
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{resetRoll()}
    }
    private fun rollDrive(){
        val random = Random().nextInt(6)+1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = random.toString()
        Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
    }

    private fun resetRoll(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = 0.toString()
    }
}
