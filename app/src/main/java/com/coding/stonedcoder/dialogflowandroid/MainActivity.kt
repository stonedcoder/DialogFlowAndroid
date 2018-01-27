package com.coding.stonedcoder.dialogflowandroid

import ai.api.AIConfiguration.SupportedLanguages
import ai.api.android.AIConfiguration
import ai.api.android.AIService
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import com.dialogflow.dev.dialogflow.app.DFinstance


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
