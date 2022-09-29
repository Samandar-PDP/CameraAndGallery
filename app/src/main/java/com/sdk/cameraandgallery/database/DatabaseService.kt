package com.sdk.cameraandgallery.database

import com.sdk.cameraandgallery.model.ImageModel

interface DatabaseService {
    fun saveImage(imageModel: ImageModel)
    fun getAllImages(): MutableList<ImageModel>
}