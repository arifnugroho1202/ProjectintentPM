package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kedua.*



class ActivityKedua : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val bundle = intent.extras
        val getNim= bundle?.get("nim2")
        val getNama= bundle?.get("nama2")
        val getNilai= bundle?.get("nilai2")
        val getKet= bundle?.get("keterangan2")
        nim2.text=getNim.toString()
        nama2.text=getNama.toString()
        nilai2.text=getNilai.toString()
        keterangan2.text=getKet.toString()



    }
}
