package com.example.aplicacioncotizacion.data.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.aplicacioncotizacion.data.dao.*
import com.example.aplicacioncotizacion.data.entity.*

/**
 * Base de datos principal de BuildCot.
 */
@Database(
    entities = [
        Usuario::class,
        Cliente::class,
        Material::class,
        Proyecto::class,
        Cotizacion::class,
        DetalleCotizacion::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun UsuarioDao(): UsuarioDao
    abstract fun ClienteDao(): ClienteDao
    abstract fun MaterialDao(): MaterialDao
    abstract fun ProyectoDao(): ProyectoDao
    abstract fun CotizacionDao(): CotizacionDao
    abstract fun DetalleCotizacionDao(): DetalleCotizacionDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "buildcot_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTANCE = instance
                instance
            }
        }
    }
}