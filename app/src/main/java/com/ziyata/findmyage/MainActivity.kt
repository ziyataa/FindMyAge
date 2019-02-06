package com.ziyata.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1 Membuat predeteksi pada saat tombol hitung di tekan
        btnHitung.setOnClickListener {
            // TODO 2 Mengambil inputan user
            val year = edtTahun.text.toString().toIntOrNull()
            // TODO 3 Mengecek variable year apakah sudah ada isinya atau belum
            if (year != null){
                // Apabila year ada isinya maka jalankan perintah dibawah ini
                // TODO 4 Melakukan operasi perhitungan umur dengan rumus tahun sekarang - tahun lahir
                val age = Calendar.getInstance().get(Calendar.YEAR) - year
                // TODO 5 Kita tampilkan hasil umur ke layar
                txtUmur.text = age.toString()
            }else{
                // Apabila year tidak ada isinya
                // TODO 6 Membuat pesan error pada view editText
                edtTahun.error = "Tahun lahir harus di isi"
            }
        }
    }
}
