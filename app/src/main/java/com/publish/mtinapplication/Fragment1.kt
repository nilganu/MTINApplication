package com.publish.mtinapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import androidx.fragment.app.Fragment

class Fragment1:Fragment()
{
    var etname:EditText?=null;
    lateinit var spnrFamily: AppCompatAutoCompleteTextView
    lateinit var spnrReligion: AppCompatAutoCompleteTextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v:View=inflater.inflate(R.layout.first_form,null)
        etname=v.findViewById<EditText>(R.id.edtareaname)
        spnrFamily=v.findViewById(R.id.typeoffamily)
        spnrReligion=v.findViewById(R.id.religion)
        setupAutoCompleteView()
        return v
    }
    private fun setupAutoCompleteView() {
        var familyType=resources.getStringArray(R.array.familytype)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                familyType)
        spnrFamily.setAdapter(adapter)
        spnrFamily.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }

        var religion=resources.getStringArray(R.array.Religion)
        val adapter1: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                religion)
        spnrReligion.setAdapter(adapter1)
        spnrReligion.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }

    }

   /* override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("cityname",etname!!.text.toString())
    }*/

   /* override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(savedInstanceState!=null)
        {
            etname!!.setText(savedInstanceState.getString("cityname"))
        }
    }*/
}
