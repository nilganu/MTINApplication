package com.publish.mtinapplication.localstorage.dao

import androidx.room.*
import com.publish.mtinapplication.constants.Constants
import com.publish.mtinapplication.entities.FormOne

@Dao
interface FormOneDao {

    @Query("SELECT * from " + Constants.TABLE_FORM_ONE)
    fun getFormOneData(): FormOne

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFormOneData(formOne: FormOne)

    @Update
    fun updateFormOneData(formOne: FormOne)

    @Query("DELETE from " + Constants.TABLE_FORM_ONE)
    fun deleteAllFormOneData()
}