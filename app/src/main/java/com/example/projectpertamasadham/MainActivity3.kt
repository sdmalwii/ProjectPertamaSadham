package com.example.projectpertamasadham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectpertamasadham.databinding.ActivityMain3Binding
import java.text.NumberFormat

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding //mengambil benda-benda di xml dengan menuliskan id nya
    override fun onCreate(savedInstanceState: Bundle?) {
        //salah satu bagian dari life lifecycle saat aplikasi dibuat, jadi semua code perintah
        //ditarohnya di oncreate biar langsung jalan
        // jadi kaya timeline ketika dibuat



        super.onCreate(savedInstanceState)
        // super.onCreate itu memanggil on create dan melakukan penyiapan aktivitas lainnya
        // saveinstancestate, parameter yang digunakan untuk mengembalikan keadaan aktivitas jika perlu, seperti ketika perangkat berubah orientasi.

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var stringInTextField = binding.calculateButton
        stringInTextField.setOnClickListener{calculateTip()}
        //setContentView(R.layout.activity_main)

    }

    fun calculateTip(){
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()

        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.option_twenty_percent -> 0.20 //karena nilainya 20%
            R.id.option_eighteen_percent -> 0.30 //karena nilainya 30%
            else -> 0.40 //karena nilainya 40%
        }

        var tip = tipPercentage * cost
        val pembulatan = binding.roundUpSwitch.isChecked
        if (pembulatan) {
            tip = kotlin.math.ceil(tip)
        }

        NumberFormat.getCurrencyInstance() //control spasi di NumberFormat, karena harus import lib
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = formattedTip//getString(R.string.tip_amount, formattedTip)


    }
}