package com.ardabozkurt.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var name= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        //mySum(5,6)

        val result = myMultiply(10,20)
        //textView.text = "Result: ${result}"

        /*
        button.setOnClickListener {
            println("clicked")
        }
        */

        // Class

        val homer = Simpson(50, "Homer Simpson", "Nuclear" )
        //homer.age = 50
        //homer.job = "Nuclear"
        //homer.name = "Homer Simpson"
    }

    fun test(){
        println("test function")
    }

    /*fun mySum(a: Int, b:Int) {
        textView.text = "Result: ${a+b}"
    }*/

    fun myMultiply(x:Int, y:Int) : Int{
        return x*y
    }

    fun makeSimpson(view : View){

        name = nameText.text.toString()
        var age = nameText2.text.toString().toIntOrNull()
        if(age == null){
            age = 0
        }
        val job = nameText3.text.toString()

        val simpson = Simpson(age,name,job)

        resultText.text = "Name : ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"



    }

    //Scope
    fun scopeExample(view: View){
        println(name)
    }

}