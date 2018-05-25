package com.example.hongchang.camerademo

/**
 * Created by hongchang on 2018/5/25.
 */
class HCamera : ICamera{
    private lateinit var iCamera : ICamera

    constructor(cameraId: Int) {
        iCamera = CameraImpl1()
    }

    override fun openCamera(cameraId: Int) {
        iCamera.openCamera(cameraId)
    }

    override fun startPreview() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun takePicture() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startRecord() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}