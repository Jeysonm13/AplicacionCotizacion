package com.example.aplicacioncotizacion.data.dao


import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.Cotizacion

@Dao
interface CotizacionDao {

    @Insert
    suspend fun insertar(cotizacion: com.example.aplicacioncotizacion.data.entity.Cotizacion)

    @Query("SELECT * FROM cotizaciones")
    suspend fun obtenerTodas(): List<Cotizacion>
}