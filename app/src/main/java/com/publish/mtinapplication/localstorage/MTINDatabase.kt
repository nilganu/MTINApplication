package com.publish.mtinapplication.localstorage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.publish.mtinapplication.constants.Constants
import com.publish.mtinapplication.entities.FormOne
import com.publish.mtinapplication.localstorage.dao.FormOneDao

@Database(entities = [FormOne::class], version = 1)
abstract class MTINDatabase : RoomDatabase() {

    abstract fun formOneDao(): FormOneDao

    companion object {
        @Volatile
        private var INSTANCE: MTINDatabase? = null

        fun getDatabase(context: Context): MTINDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MTINDatabase::class.java,
                    Constants.DB_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTANCE = instance
                return instance
            }
        }

        fun destroyDataBaseInstance() {
            INSTANCE = null
        }
    }
}