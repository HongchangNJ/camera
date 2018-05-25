package com.example.hongchang.camerademo

import android.graphics.Camera
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var SELECTED_CAMERA = -1
    private var CAMERA_POST_POSITION = -1
    private var CAMERA_FRONT_POSITION = -1

    private var surfaceView : SurfaceView ?= null
    private var button : Button ?= null
    private var camera : Camera ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        surfaceView = findViewById(R.id.surface_view);
        button = findViewById(R.id.button);
    }

    private fun initCamera() {

    }

    private fun initMediaRecorder() {

    }

    private fun findAvailableCameras() {
        val info = android.hardware.Camera.CameraInfo()
        val cameraNum = android.hardware.Camera.getNumberOfCameras()
        for (i in 0 until cameraNum) {
            android.hardware.Camera.getCameraInfo(i, info)
            when (info.facing) {
                android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT -> CAMERA_FRONT_POSITION = info.facing
                android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK -> CAMERA_POST_POSITION = info.facing
            }
        }
    }

}
