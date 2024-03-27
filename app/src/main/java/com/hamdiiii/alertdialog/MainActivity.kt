package com.hamdiiii.alertdialog

import android.app.ProgressDialog.show
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.hamdiiii.alertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            show()
        }
    }

    private fun show() {
        val builder = AlertDialog.Builder(this)
        builder.apply {
            setTitle("الصلاة علي النبي")
            setMessage("هل صليت علي النبي اليوم")
            setPositiveButton(
                "نعم",
                DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(
                        this@MainActivity,
                        "بارك الله فيك",
                        Toast.LENGTH_LONG
                    ).show()
                }
            )
            setNegativeButton("لا", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(
                    this@MainActivity,
                    "صل علي النبي",
                    Toast.LENGTH_LONG
                ).show()
            })
        }
        val dialog=builder.create()
        dialog.show()

    }
}