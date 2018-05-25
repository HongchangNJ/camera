package com.example.hongchang.camerademo

/**
 * Created by hongchang on 2018/5/25.
 */
interface ICamera {
    fun openCamera(cameraId: Int)
    fun switchCamera()
    fun startPreview()
    fun takePicture()
    fun startRecord()
}