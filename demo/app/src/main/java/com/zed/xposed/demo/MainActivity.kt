package com.zed.xposed.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Gravity
import android.widget.LinearLayout
import com.zed.xposed.demo.util.ViewUtil
import com.zed.xposed.demo.widget.WxMomentContactDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
