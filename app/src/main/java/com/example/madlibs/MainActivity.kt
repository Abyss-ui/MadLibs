package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input1 = word1.text
        Toast.makeText(this,input1,Toast.LENGTH_LONG).show()
        var input2 = word2.text
        Toast.makeText(this,input2,Toast.LENGTH_LONG).show()
        var input3 = word3.text
        Toast.makeText(this,input3,Toast.LENGTH_LONG).show()
        var input4 = word4.text
        Toast.makeText(this,input4,Toast.LENGTH_LONG).show()
        var input5 = word5.text
        Toast.makeText(this,input5,Toast.LENGTH_LONG).show()
        var input6 = word6.text
        Toast.makeText(this,input6,Toast.LENGTH_LONG).show()
        var input7 = word7.text
        Toast.makeText(this,input7,Toast.LENGTH_LONG).show()
        var input8 = word8.text
        Toast.makeText(this,input8,Toast.LENGTH_LONG).show()
        var input9 = word9.text
        Toast.makeText(this,input9,Toast.LENGTH_LONG).show()
        var input10 = word10.text
        Toast.makeText(this,input10,Toast.LENGTH_LONG).show()
        var input11 = word11.text
        Toast.makeText(this,input11,Toast.LENGTH_LONG).show()
        var input12 = word12.text
        Toast.makeText(this,input12,Toast.LENGTH_LONG).show()



    }
}
