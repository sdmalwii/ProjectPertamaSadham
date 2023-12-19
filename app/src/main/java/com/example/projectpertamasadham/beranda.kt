package com.example.projectpertamasadham

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.projectpertamasadham.databinding.ActivityBerandaBinding

class beranda : AppCompatActivity(), View.OnClickListener {
    // jadi view onclicklistener adalah ketika mengklik tombol metode onclick akan dipanggil dan kaya menentukan apa yang harus dilakukan
    // kalau AppCompatActivity digunakan untuk mengelola antarmuka pengguna dan tampilan

    lateinit var binding: ActivityBerandaBinding //mengambil benda-benda di xml dengan menuliskan id nya
    override fun onCreate(savedInstanceState: Bundle?) {
        //salah satu bagian dari life lifecycle saat aplikasi dibuat, jadi semua code perintah
        //ditarohnya di oncreate biar langsung jalan
        // jadi kaya timeline ketika dibuat

        super.onCreate(savedInstanceState)
        // super.onCreate itu memanggil on create dan melakukan penyiapan aktivitas lainnya
        // saveinstancestate, parameter yang digunakan untuk mengembalikan keadaan aktivitas jika perlu, seperti ketika perangkat berubah orientasi.
        setContentView(R.layout.activity_beranda) //menghubungkan tampilan layoutnya si acktivity beranda ketika tampilannya aktif

        val pindah : Button = findViewById(R.id.pindah)
        pindah.setOnClickListener(this)
        // membuat variabel pindah , button nya tuh menggunakan findviewvyid untuk mencari tombol dengan id pindah
        // nah ketika si id pindah itu diklik menggunakan button maka akan ke halaman 1 nya(activity main) kalo this disini sebagai parameter aja.

        val pindah2 : Button = findViewById(R.id.pindah2)
        pindah2.setOnClickListener(this)

        val pindah3 : Button = findViewById(R.id.pindah3)
        pindah3.setOnClickListener(this)

        val pindah4 : Button = findViewById(R.id.pindah4)
        pindah4.setOnClickListener(this)

        val pindah5 : Button = findViewById(R.id.pindah5)
        pindah5.setOnClickListener(this)


}
    override fun onClick(v: View?){
    if (v != null)
        when(v.id){
            R.id.pindah -> {
                val halaman1 = Intent(this,MainActivity::class.java)
                startActivity(halaman1)
            }

            R.id.pindah2 -> {
                val halaman2 = Intent(this,MainActivity2::class.java)
                startActivity(halaman2)
            }

            R.id.pindah3 -> {
                val halaman3 = Intent(this,MainActivity3::class.java)
                startActivity(halaman3)
            }

            R.id.pindah4 -> {
                val halaman4 = Intent(this,ListMovies::class.java)
                startActivity(halaman4)
            }

            R.id.pindah5 -> {
                val halaman5 = Intent(this,MainActivity4::class.java)
                startActivity(halaman5)
            }

        }

            }

    }

// tombol ini bertujuan untuk mengatur respon ketika mengklik tombol untuk mengarahkan ke halaman utama(mainactivity) dengan menggunakan id button yang ditelah ditentukan