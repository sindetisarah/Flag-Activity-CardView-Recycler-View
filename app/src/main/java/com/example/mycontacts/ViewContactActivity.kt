package com.example.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var tvname:TextView
    lateinit var viewPhone:TextView
    lateinit var viewEmail:TextView
    lateinit var viewImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        tvname.findViewById<TextView>(R.id.tvname)
        viewPhone.findViewById<TextView>(R.id.tvphonenumber)
        viewEmail.findViewById<TextView>(R.id.tvemail)
        viewImage.findViewById<ImageView>(R.id.imgView)


        var nameIntent=intent.getStringExtra("name")
        var emailIntent=intent.getStringExtra("email")
        var phoneIntent=intent.getStringExtra("phone")
        var imageIntent=intent.getStringExtra("image").toString()
        Picasso.get()
            .load(imageIntent)
            .into(viewImage)

        tvname.text=nameIntent
        viewPhone.text=phoneIntent
        viewEmail.text=emailIntent

    }
}
