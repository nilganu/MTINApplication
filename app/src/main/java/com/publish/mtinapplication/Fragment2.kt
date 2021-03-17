package com.publish.mtinapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import androidx.fragment.app.Fragment

class Fragment2:Fragment()
{

    lateinit var spnrtypeofhouse: AppCompatAutoCompleteTextView
    lateinit var spnrrooms: AppCompatAutoCompleteTextView
    lateinit var spnroccupancy: AppCompatAutoCompleteTextView
    lateinit var spnrventilation: AppCompatAutoCompleteTextView
    lateinit var spnrlighting: AppCompatAutoCompleteTextView
    lateinit var spnrwatersupply: AppCompatAutoCompleteTextView
    lateinit var spnrkitchen: AppCompatAutoCompleteTextView
    lateinit var spnrdrainage: AppCompatAutoCompleteTextView
    lateinit var spnrlavatory: AppCompatAutoCompleteTextView
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var v:View=inflater.inflate(R.layout.second_form,null)
        spnrtypeofhouse=v.findViewById(R.id.typeofhouse)
        spnrrooms=v.findViewById(R.id.rooms)
        spnroccupancy=v.findViewById(R.id.occupancy)
        spnrventilation=v.findViewById(R.id.ventilation)
        spnrlighting=v.findViewById(R.id.lighting)
        spnrwatersupply=v.findViewById(R.id.watersupply)
        spnrkitchen=v.findViewById(R.id.kitchen)
        spnrdrainage=v.findViewById(R.id.drainage)
        spnrlavatory=v.findViewById(R.id.lavatory)
        setupAutoCompleteView()
        return v
    }

    private fun setupAutoCompleteView() {
        var houseType=resources.getStringArray(R.array.typeofhouse)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                houseType)
        spnrtypeofhouse.setAdapter(adapter)
        spnrtypeofhouse.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }

        var rooms=resources.getStringArray(R.array.rooms)
        val adapter1: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                rooms)
        spnrrooms.setAdapter(adapter1)
        spnrrooms.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var occupancy=resources.getStringArray(R.array.occupancy)
        val adapter2: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                occupancy)
        spnroccupancy.setAdapter(adapter2)
        spnroccupancy.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var ventilation=resources.getStringArray(R.array.ventilation)
        val adapter3: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                ventilation)
        spnrventilation.setAdapter(adapter3)
        spnrventilation.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }

        var lighting=resources.getStringArray(R.array.lighting)
        val adapter4: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                lighting)
        spnrlighting.setAdapter(adapter4)
        spnrlighting.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var watersupply=resources.getStringArray(R.array.watersupply)
        val adapter5: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                watersupply)
        spnrwatersupply.setAdapter(adapter5)
        spnrwatersupply.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var kitchen=resources.getStringArray(R.array.kitchen)
        val adapter6: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                kitchen)
        spnrkitchen.setAdapter(adapter6)
        spnrkitchen.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var drainage=resources.getStringArray(R.array.drainage)
        val adapter7: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                drainage)
        spnrdrainage.setAdapter(adapter7)
        spnrdrainage.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
        var lavatory=resources.getStringArray(R.array.lavatory)
        val adapter8: ArrayAdapter<String> = ArrayAdapter<String>(
                activity!!.applicationContext,android.R.layout.simple_list_item_1,
                lavatory)
        spnrlavatory.setAdapter(adapter8)
        spnrlavatory.onItemClickListener =
                AdapterView.OnItemClickListener { parent, arg1, position, id ->
                    //TODO: You can your own logic.
                }
    }
}
