package com.example.tenantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class SearchHousesActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: androidx.appcompat.widget.SearchView
    private val mList = ArrayList<Houses>()
    private lateinit var adapter: HouseAdapter
    lateinit var houses : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_houses)

        recyclerView = findViewById(R.id.recyclerview)
        searchView = findViewById(R.id.searchview)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        adapter = HouseAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query : String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText : String?): Boolean {
                filterList(newText)
                return true
            }

        })

    }

    private fun filterList(query : String?) {
        if (query!= null ){
            val filteredList = ArrayList<Houses>()
            for (i in mList) {
                if (i.title?.toLowerCase(Locale.ROOT)?.contains(query) == true) {
                    filteredList.add(i)
                }
            }
            if (filteredList.isEmpty()){
                Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show()
            }else{
                adapter.setFilteredList(filteredList)
            }
        }
    }


    private fun addDataToList(){
        mList.add(Houses("Bedsiter available @Ksh 5000/= located along Waiyaki way,MountainView",R.drawable.img1))
        mList.add(Houses("Spacious Houses available @9Ksh 9000/= located at Kangemi",R.drawable.img2))
        mList.add(Houses("House available @Ksh 10000/= located at Kawangare",R.drawable.img3))
        mList.add(Houses("House available @Ksh 15000/= located along Naivasha Road",R.drawable.img4))
        mList.add(Houses("Houses for sell available @Ksh 100000/=negotiable located at Dandora",R.drawable.img5))
        mList.add(Houses("Affordable Houses available @Ksh 2500/= located at south B",R.drawable.img6))
        mList.add(Houses("Houses with spacious parking available @Ksh 26000/= located at Uthiri",R.drawable.img7))
        mList.add(Houses("Houses for sell available @Ksh 500000/= located at Dagoreti",R.drawable.img8))
        mList.add(Houses("spacious Houses available @Ksh 250000/= located at Ruiru",R.drawable.img9))
        mList.add(Houses("House for sell available @Ksh 2500000/= located at Thika",R.drawable.img10))


        adapter.onItemclick = {
            val intent = Intent(this , HouseActivity::class.java)
            intent.putExtra("HousesData",it)

            startActivity(intent)
        }
    }
}