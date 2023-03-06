package com.example.bestmenuinzawarudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.bestmenuinzawarudo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)



        bind.bopenmenu.setOnClickListener {
            bind.iddrawer.openDrawer(GravityCompat.START)
        }
        bind.navview.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
                R.id.item5 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
                R.id.item6 -> {
                    Toast.makeText(this, "Выбрана опция ${it.title}", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}