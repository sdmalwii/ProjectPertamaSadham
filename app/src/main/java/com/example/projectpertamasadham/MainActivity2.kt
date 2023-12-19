package com.example.projectpertamasadham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectpertamasadham.databinding.ActivityBerandaBinding
import com.example.projectpertamasadham.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding //mengambil benda-benda di xml dengan menuliskan id nya
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonOne.setOnClickListener{
            makanan()
    }
}

    private fun makanan()
    {
        val mcy = Roll(6)
        val dR = when(mcy.gambar())
        {
            1-> R.drawable.satu
            2-> R.drawable.dua
            3-> R.drawable.tiga
            4-> R.drawable.empat
            5-> R.drawable.lima
            else -> R.drawable.enam
        }

        binding.imageView.setImageResource(dR)
    }
}

class Roll(private val numSides : Int)
{
    fun gambar() :Int
    {
        return (1..numSides).random()
        }
}