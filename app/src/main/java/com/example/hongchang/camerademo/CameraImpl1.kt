package com.example.hongchang.camerademo

import android.hardware.Camera

/**
 * Created by hongchang on 2018/5/25.
 */
class CameraImpl1 : ICamera {
    override fun switchCamera() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var camera: Camera? = null;

    constructor() {

    }


    override fun openCamera(cameraId: Int) {
        if (camera == null) {
            try {
                camera = Camera.open(cameraId)
            } catch (exception: Exception) {

            }
        }
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

    private fun destoryCamera() {
        camera?.setPreviewCallback(null)
        camera?.stopPreview()
        camera?.setPreviewDisplay(null)
        camera?.release()
        camera = null;
    }
}