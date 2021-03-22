package com.publish.mtinapplication.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.publish.mtinapplication.constants.Constants
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = Constants.TABLE_FORM_ONE)
data class FormOne(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var areaName: String = "",
    var healthCentreName: String = "",
    var headOfFamilyName: String = "",
    var family: String = "",
    var religion: String = "",
    var subCast: String = ""
) : Parcelable