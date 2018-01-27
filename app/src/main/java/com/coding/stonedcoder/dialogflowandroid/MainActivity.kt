package com.coding.stonedcoder.dialogflowandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var aiService: AIService
    private lateinit var listenButton: Button
    private lateinit var txtView: TextView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeWidgets()
        aiService = createAiService()
    }

    private fun createAiConfig(): AIConfiguration {
        return AIConfiguration("8eb15fcaf41744fdb380ad69c7b6d406",
                SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System)
    }

    
    private fun createAiService(): AIService {
        val aiService = AIService.getService(this, createAiConfig())
        aiService.setListener(DFinstance(txtView, progressBar))
        return aiService
    }


}
