package org.geeksforgeeks.changebuttonfont

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing Button from the layout file
        val mButton = findViewById<Button>(R.id.button_1)

        // Declaring integer variable to use in when loop
        var clicks = 0

        // When button is clicked
        mButton.setOnClickListener {
            // Variable is incremented
            clicks += 1
            // Enters when loop and changes typeface
            when(clicks){
                1-> {mButton.setTypeface(Typeface.MONOSPACE)
                    mButton.text = "Monospace"}

                2-> {mButton.setTypeface(Typeface.SANS_SERIF)
                    mButton.text = "Sans Serif"}

                3-> {mButton.setTypeface(Typeface.DEFAULT_BOLD)
                    mButton.text = "Default Bold"}

                4-> {mButton.setTypeface(Typeface.SERIF)
                    mButton.text = "Serif"}

                5-> {mButton.setTypeface(Typeface.DEFAULT)
                    mButton.text = "Default"
                    // Returns back to the top (Monospace)
                    clicks = 0}
            }
        }
    }
}