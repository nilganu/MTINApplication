package com.publish.mtinapplication.localstorage.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.publish.mtinapplication.entities.FormOne
import com.publish.mtinapplication.helper.lazyDeferred
import com.publish.mtinapplication.localstorage.MTINDatabase
import com.publish.mtinapplication.localstorage.repository.FormOneRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class FormOneViewModel(application: Application) : AndroidViewModel(application) {

    private var parentJob = Job()

    //By default all the coroutines launched in this scope should be using the Main dispatcher
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)

    private val repository: FormOneRepository

    init {
        val formOneDao = MTINDatabase.getDatabase(application).formOneDao()
        repository = FormOneRepository(formOneDao)
    }

    val formOneData by lazyDeferred {
        repository.getFormOneData()
    }

    fun insertFormOneData(formOne: FormOne) = scope.launch(Dispatchers.IO) {
        repository.insertFormOneData(formOne)
    }

    fun updateFormOneData(formOne: FormOne) = scope.launch(Dispatchers.IO) {
        repository.updateFormOneData(formOne)
    }

    fun deleteAllFormOneData() = scope.launch(Dispatchers.IO) {
        repository.deleteAllFormOneData()
    }
}