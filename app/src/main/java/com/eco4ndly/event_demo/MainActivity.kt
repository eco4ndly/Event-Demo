package com.eco4ndly.event_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.eco4ndly.event_demo.event.EventObserver
import com.eco4ndly.event_demo.second.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private lateinit var mainViewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
    handleEvents()

    btn_toast.setOnClickListener {
      mainViewModel.initiateToast()
    }

    btn_nav.setOnClickListener {
      mainViewModel.initiateNavigate()
    }
  }

  private fun handleEvents() {
    mainViewModel.toastEvent.observe(this, EventObserver {
      Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    })


    mainViewModel.navigateEvent.observe(this, EventObserver {
      Intent(this, SecondActivity::class.java).apply {
        startActivity(this)
      }
    })

  }
}
