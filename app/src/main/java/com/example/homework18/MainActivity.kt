package com.example.homework18

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.image_view)
        val button = findViewById<Button>(R.id.image_button)
        val arrayPics = arrayOf(
            getString(R.string.picture1),
            getString(R.string.picture2),
            getString(R.string.picture3),
            getString(R.string.picture4),
            getString(R.string.picture5),
            getString(R.string.picture6),
            getString(R.string.picture7),
            getString(R.string.picture8),
            getString(R.string.picture9),
            getString(R.string.picture10)
        )

        var counter = 0

        button.setOnClickListener {
            Glide
                .with(this)
                .load(arrayPics[counter])
                .into(imageView)
            counter++
            if (counter == 10) {
                counter = 0
            }
        }
    }
}