package buu.informatics.s59160039.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDrive()}
    }
    private fun rollDrive(){
        Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
    }
}
