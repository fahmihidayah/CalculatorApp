package com.widsons.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var calculatorEngine = CalculatorEngine(
                editTextAngkaSatu.text.toString().toDouble(),
                editText2.text.toString().toDouble()
            )
            var hasil = calculatorEngine.tambah()
            textViewHasil.setText(hasil.toString())
        }

        var calculatorEngine : CalculatorEngine = CalculatorEngine(9.0)
    }

    class OnClickTambah : View.OnClickListener {
        override fun onClick(v: View?) {

        }
    }

    class OnClickKurang : View.OnClickListener {
        override fun onClick(v: View?) {

        }

    }

}
