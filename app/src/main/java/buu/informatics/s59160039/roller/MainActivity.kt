package buu.informatics.s59160039.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drableResult = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drableResult)
        Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
    }

    private fun resetRoll(){
        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(R.drawable.empty_dice)
    }
}
