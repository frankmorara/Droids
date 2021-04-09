package com.frankmorara.droids.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Droid(@StringRes val userNameId: Int,
                 @DrawableRes val imageResourceId: Int,
                 @StringRes val devDescriptionId: Int)