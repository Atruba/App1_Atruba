package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random


class MainActivity2 : AppCompatActivity() {
    val dp1= arrayOf("Oxygen", "Hydrogen")
    val dp2= arrayOf("Carbon", "Nitrogen")

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)

            val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, dp1)
            val ab = ArrayAdapter(this, android.R.layout.simple_spinner_item, dp2)
            var bt = findViewById(R.id.button) as Button

            aa.setDropDownViewResource(android.R.layout.simple_spinner_item)
            ab.setDropDownViewResource(android.R.layout.simple_spinner_item)

            elements1.adapter = aa
            elements1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    if (elements1.selectedItemPosition == 0) {
                        textView.setText(" " + elements1.selectedItem)

                    }
                    if (elements1.selectedItemPosition == 1) {
                        textView.setText(" " + elements1.selectedItem)

                    }
                }
            }

            elements2.adapter = ab
            elements2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    if (elements2.selectedItemPosition == 0) {
                        textView2.setText(" " + elements2.selectedItem)

                    }
                    if (elements2.selectedItemPosition == 1) {
                        textView2.setText(" " + elements2.selectedItem)

                    }
                }
            }

            //Once the user clicks the button, following text should be displayed based on the selected //items position in relevant array
            bt.setOnClickListener {
                if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 0) {
                    textView3.setText("The result is: Carbon dioxide")
                }
                if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 1) {
                    textView3.setText("The result is: Nitric Oxide")
                }

                if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 0) {
                    textView3.setText("The result is: Methane")
                }

                if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 1) {
                    textView3.setText("The result is: Ammonia")
                }


            }
        }
}



