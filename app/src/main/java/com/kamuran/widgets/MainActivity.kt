package com.kamuran.widgets

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var tbuton:ToggleButton
    private lateinit var swbuton:Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /*
        swbuton=findViewById(R.id.switch1)
        swbuton.setOnCheckedChangeListener(sCCL)


       /*
        window.decorView.rootView.setOnTouchListener(View.OnTouchListener { v, event ->
            Toast.makeText(this, "ekrana dokunuldu", Toast.LENGTH_LONG).show()
            return@OnTouchListener true
        })
        */

        tbuton=findViewById(R.id.toggleButton)

        tbuton.setOnCheckedChangeListener(tbcc)
        */


    }

    fun AlertCikar(){
        var uyariYapici= AlertDialog.Builder(this)
        uyariYapici.setTitle("Uyarı") //baslık
        uyariYapici.setMessage("çıkmak istiyor musunuz?")

        uyariYapici.setPositiveButton("evet",DialogInterface.OnClickListener { dialog, which ->
            finish()
        })

        uyariYapici.setNegativeButton("hayır",null)

        uyariYapici.create().show()
    }

    override fun onBackPressed() { //geri tuşuna basınca
        AlertCikar()
    }

    fun yeniEkranAc(view: View) {
        var intent= Intent(this,MainActivity2::class.java)
        startActivityForResult(intent,0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Toast.makeText(this,"geri gelindi..",Toast.LENGTH_LONG).show()
        //geri gelme işlemini yakalama

    }


/*
    var tbcc= CompoundButton.OnCheckedChangeListener{btn:CompoundButton,status:Boolean->
        Toast.makeText(this,"toggle status "+status, Toast.LENGTH_LONG).show()}


    var sCCL= CompoundButton.OnCheckedChangeListener{btn:CompoundButton,status:Boolean->
       tbuton.visibility= if (status) View.VISIBLE else View.INVISIBLE
        //switci acınca buton kayboluyor kapatınca geliyor
    }
 */

}