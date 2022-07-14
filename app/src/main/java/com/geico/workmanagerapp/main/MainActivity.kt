package com.geico.workmanagerapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.geico.workmanagerapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadWorkRequest: WorkRequest =
            OneTimeWorkRequestBuilder<UploadWorker>()
                .build()

        WorkManager
            .getInstance(this)
            .enqueue(uploadWorkRequest)

    }
}