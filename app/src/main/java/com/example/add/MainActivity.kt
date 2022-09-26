package com.example.add

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      val n1=findViewById(R.id.t1)as EditText
      val n2=findViewById(R.id.t2)as EditText
      val total=findViewById(R.id.sum)as EditText
      val btn1=findViewById(R.id.button2)as Button
        val btn2=findViewById(R.id.button3)as Button



        btn1.setOnClickListener{

            val v1=n1.text.toString().toInt()
            val v2=n2.text.toString().toInt()
            val res=v1+v2;
            total.setText(res.toString())

        }


        btn2.setOnClickListener{

            val v3=n1.text.toString().toInt()
            val v4=n2.text.toString().toInt()
            val res=v3-v4;
            total.setText(res.toString())

        }





        val btn3=findViewById(R.id.clr) as Button

        btn3.setOnClickListener {
            n1.getText().clear()
            n2.getText().clear()
            total.getText().clear()
        }







    }
}


