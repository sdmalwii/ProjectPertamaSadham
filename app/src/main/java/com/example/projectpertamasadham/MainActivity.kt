package com.example.projectpertamasadham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectpertamasadham.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding //mengambil benda-benda di xml dengan menuliskan id nya
    override fun onCreate(savedInstanceState: Bundle?) {
        //salah satu bagian dari life lifecycle saat aplikasi dibuat, jadi semua code perintah
        //ditarohnya di oncreate biar langsung jalan
        // jadi kaya timeline ketika dibuat

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //memanggil view atau benda kedalam kotlin berdasarkan id nya melalui binding
        var buttonHitung = binding.buttonHitung
        var inputBerat = binding.inputBerat
        var inputJarak = binding.inputJarak
        var jumlahOngkir = binding.jmlongkir
        var jumlahTip = binding.jmlTip
        var jumlahTotal = binding.jmlTotal

        buttonHitung.setOnClickListener{
            var inputTip = binding.inputTip.isChecked //line ini melakukan pengecekan
            var Rating = binding.inputRatingGroups.checkedRadioButtonId //lakuin pengecekan melalui nilai rating kalau dipilih nya opsi 1 nilai nya 1
            val nilaiRating = when (Rating){
                R.id.opsi1 -> 1.0
                R.id.opsi2 -> 2.0
                R.id.opsi3 -> 3.0
                else -> 4.0 //karena nilainya 40%
            }

            //hitung
            var berat = inputBerat.text.toString().toDouble() // berat itu nilai ketika di double in nilai nya jadi angka misal 5 rb jdi 50 rb
            var jarak = inputJarak.text.toString().toDouble() // jarak itu nilai ketika di double in nilai nya jadi angka double sama kaya berat
            var ongkir = ((0.5 * berat)+jarak)*5000
            var tip = 0.0
            if(inputTip){
                tip = nilaiRating * 0.02 * ongkir
            }

            var grandtotal = ongkir + tip
            jumlahOngkir.text=ongkir.toString() //jumlahongkir diubah jadi string
            jumlahTip.text= tip.toString() //jumlahtip diubah jadi string
            jumlahTotal.text=grandtotal.toString() //jumlahtotal diubaj jadi string
            }
        }
}
