package com.android.wangwh.kotlinframedemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.meituan.android.walle.WalleChannelReader
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

/**
 * Created by wangwh on 2017/12/6.
 */

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mSwitch = find<Button>(R.id.btn_switch)

        btn_switch.setOnClickListener { tv_title.visibility = if (tv_title.visibility == View.VISIBLE) View.GONE else View.VISIBLE }
        btn_print_channel.setOnClickListener { toast("渠道号:" + WalleChannelReader.getChannel(this.getApplicationContext())) }
    }
}
