package dd.wan.baitaptuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        nav_menu.background = null
        appCompatButton2.setOnClickListener{
            startActivity(Intent(this,Cards::class.java))
        }
        viewCard.setOnClickListener {

            startActivity(Intent(this,Pay::class.java))
        }
    }
}