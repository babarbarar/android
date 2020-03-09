package br.ufpr.tads.helloworld

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSoma = findViewById<Button>(R.id.buttonSoma)
        val bSub = findViewById<Button>(R.id.buttonSub)
        val bMult = findViewById<Button>(R.id.buttonMult)
        val bDiv = findViewById<Button>(R.id.buttonDiv)

        bSoma.setOnClickListener {
            val val1 = Integer.parseInt(findViewById<EditText>(R.id.val1).text.toString())
            val val2 = Integer.parseInt(findViewById<EditText>(R.id.val2).text.toString())
            val result = val1 + val2
            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
        }
        bSub.setOnClickListener {
            val val1 = Integer.parseInt(findViewById<EditText>(R.id.val1).text.toString())
            val val2 = Integer.parseInt(findViewById<EditText>(R.id.val2).text.toString())
             val result = val1 - val2
            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
        }
        bMult.setOnClickListener {
            val val1 = Integer.parseInt(findViewById<EditText>(R.id.val1).text.toString())
            val val2 = Integer.parseInt(findViewById<EditText>(R.id.val2).text.toString())
            val result = val1 * val2
            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
        }
        bDiv.setOnClickListener {
            val val1 = Integer.parseInt(findViewById<EditText>(R.id.val1).text.toString())
            val val2 = Integer.parseInt(findViewById<EditText>(R.id.val2).text.toString())
            val result = val1 / val2
            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
