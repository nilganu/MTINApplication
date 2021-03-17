package com.publish.mtinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
   lateinit var btnNext:Button
    lateinit var btnPrevious:Button
     var counter:Int=1
    lateinit var fr:Fragment

    lateinit var fr1:Fragment
    lateinit var progressbar:ProgressBar
    lateinit var spnrFamily:AppCompatAutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressbar=findViewById(R.id.progressBar2)

        var fragmentmanage=supportFragmentManager
        var framenttransaction=fragmentmanage.beginTransaction()
        fr=Fragment1()
        fr1=Fragment2()
        framenttransaction.add(R.id.layout1,fr,"Fragement1")
        framenttransaction.commit()
        btnNext=findViewById(R.id.btnNext)
        btnPrevious=findViewById(R.id.btnPrevious)
        btnNext!!.setOnClickListener {
            counter++
            if(counter==2)
            {
                progressbar!!.progress=20
                var fragmentmanage1=supportFragmentManager
                var framenttransaction1=fragmentmanage1.beginTransaction()
                framenttransaction1.replace(R.id.layout1,fr1,"Fragment2")
                framenttransaction1.addToBackStack("Fragment2");
                framenttransaction1.commit()
            }



        }
        btnPrevious!!.setOnClickListener {
            if(counter>1)
                counter--
            else
                Toast.makeText(applicationContext,"You are on first page",Toast.LENGTH_LONG).show()
            if(counter==1)
            {
                progressbar!!.progress=10
                var fragmentmanage=supportFragmentManager
                var framenttransaction=fragmentmanage.beginTransaction()
                framenttransaction.replace(R.id.layout1,fr,"Fragement1")
                //framenttransaction.addToBackStack("Fragment1");
                framenttransaction.commit()
            }
        }
    }

    override fun onBackPressed() {

    }

  /*  override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        getSupportFragmentManager().putFragment(outState, "Fragement1", fr!!);
    }*/
}
