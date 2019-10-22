package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim =id_nim.text
        val nama=id_nama.text
        val nilai=id_nilai.text

        // button mengirimkan data
        btn_proses.setOnClickListener(){
            intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nim2",nim)
            intent.putExtra("nama2",nama)
            intent.putExtra("nilai2",nilai)


            val nilaiket = nilai2.toString().toInt()
            if (nilaiket >=80) {
                intent.putExtra("Keterangan", "A")
            }
            else if (nilaiket >=60) {
                intent.putExtra("Keterangan", "B")
            }
            else if (nilaiket >=40) {
                intent.putExtra("Keterangan", "C")
            }
            else if (nilaiket >=20) {
                intent.putExtra("Keterangan", "D")
            }
            else if (nilaiket <=20) {
                intent.putExtra("Keterangan", "E")
            }
            startActivity(intent)




        }
    }
}




