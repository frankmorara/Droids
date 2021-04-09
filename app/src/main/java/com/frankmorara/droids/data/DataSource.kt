package com.frankmorara.droids.data

import com.frankmorara.droids.R
import com.frankmorara.droids.model.Droid

class DataSource {

    fun loadMembers(): List<Droid>{
        return listOf<Droid>(
            Droid(R.string.frank, R.drawable.frankmorara, R.string.android_engineer),
            Droid(R.string.ezra, R.drawable.android_ezra, R.string.android_engineer),
            Droid(R.string.henry, R.drawable.android_henry, R.string.android_engineer),
            Droid(R.string.kendi, R.drawable.android_kendi, R.string.android_engineer),
            Droid(R.string.michelle, R.drawable.android_michelle, R.string.android_engineer),
            Droid(R.string.pam, R.drawable.android_pam, R.string.android_engineer),
            Droid(R.string.theophilus, R.drawable.android_theo, R.string.android_engineer)
        )
    }
}