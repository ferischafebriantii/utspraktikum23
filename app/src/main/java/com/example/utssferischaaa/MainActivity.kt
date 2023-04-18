package com.example.utssferischaaa

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClsAdapterMu
    lateinit var listData: ArrayList<DataMusisi>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()


        listData.add(DataMusisi("Arditho Pramono", "180441100007", "27 Tahun", R.drawable.ar))
        listData.add(DataMusisi("Pamungkas", "160441100043", "30 tahun", R.drawable.pamungkas))
        listData.add(DataMusisi("ari lesmana", "150441100044", "28 tahun", R.drawable.arilesmana))
        listData.add(DataMusisi("Aruma", "150441100010", "23 tahun", R.drawable.arumaa))
        listData.add(DataMusisi("Billie Elish", "130441100010", "21 tahun", R.drawable.billie))
        listData.add(DataMusisi("Danilla Riyadi", "210441100067", "32 tahun", R.drawable.danilla))
        listData.add(DataMusisi("djamad", "180441100043", "33 tahun", R.drawable.djamad))
        listData.add(DataMusisi("fathiaizati", "200441100014", "29 tahun", R.drawable.fathiaizzati))
        listData.add(DataMusisi("heymbenk vokalis SHA", "140441100007", "27 tahun", R.drawable.heymbenk))
        listData.add(DataMusisi("Idghitaf", "210441100019", "21 tahun", R.drawable.idgitaf))
        listData.add(DataMusisi("Iqbaal ramadhan", "220441100118", "23 tahun", R.drawable.iqbal))
        listData.add(DataMusisi("Jason Ranti", "140441100030", "34 tahun", R.drawable.jasonranti))
        listData.add(DataMusisi("Komang raim laode", "160441100120", "27 tahun", R.drawable.komang))
        listData.add(DataMusisi("Mahalini", "2040441100011", "23 tahun", R.drawable.mahalini))
        listData.add(DataMusisi("Rizky Febian", "2040441100192", "25 tahun", R.drawable.rizkyfebian))
        listData.add(DataMusisi("Popi RA", "2040441100023", "28 tahun", R.drawable.popi))
        listData.add(DataMusisi("Tiara Andini", "2040441100181", "21 tahun", R.drawable.tiara))
        listData.add(DataMusisi("Vira Razak", "2040441100002", "30 tahun", R.drawable.vira))
        listData.add(DataMusisi("Ziva Magnoliya", "2040441100013", "22 tahun", R.drawable.ziva))
        listData.add(DataMusisi("Ferischa Febrianti", "210441100019", "20 tahun", R.drawable.acil))
        showList()
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapterMu(listData, this,)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapterMu(listData, this )
        recycle.adapter = recycleAdapter
    }
}

