package com.publish.mtinapplication.localstorage.repository

import androidx.annotation.WorkerThread
import com.publish.mtinapplication.entities.FormOne
import com.publish.mtinapplication.localstorage.dao.FormOneDao

class FormOneRepository(private val formOneDao: FormOneDao) {

    @WorkerThread
    fun getFormOneData(): FormOne {
        return formOneDao.getFormOneData()
    }

    @WorkerThread
    fun insertFormOneData(formOne: FormOne) {
        formOneDao.insertFormOneData(formOne)
    }

    @WorkerThread
    fun updateFormOneData(formOne: FormOne) {
        formOneDao.updateFormOneData(formOne)
    }

    @WorkerThread
    fun deleteAllFormOneData() {
        formOneDao.deleteAllFormOneData()
    }
}