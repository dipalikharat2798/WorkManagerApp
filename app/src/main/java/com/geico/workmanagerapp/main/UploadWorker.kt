package com.geico.workmanagerapp.main

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(appContext:Context, workParams:WorkerParameters):
 Worker(appContext,workParams){
    override fun doWork(): Result {
        uploadImages()
        return Result.success()
    }

    private fun uploadImages() {
        Log.d("TAG", "uploadImages: ")
    }
}