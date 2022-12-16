package com.ardabozkurt.kotlinoopproject

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.ardabozkurt.kotlinoopproject.databinding.ActivityDetailsBinding
import com.ardabozkurt.kotlinoopproject.databinding.ActivityMainBinding

var sLandmark : Landmark? = null

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //Data

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.colessium)
        val londonBridge = Landmark("London Bridge", "England", R.drawable.towerbridge)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(londonBridge)
        landmarkList.add(eiffel)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


        /*
        //Adapter : Layout & Data

        //Mapping

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name})

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(i))
            startActivity(intent)
        }

        */


    }



}