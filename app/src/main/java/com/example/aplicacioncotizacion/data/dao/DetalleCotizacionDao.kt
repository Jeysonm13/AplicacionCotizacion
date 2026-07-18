package com.example.aplicacioncotizacion.data.dao


import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.DetalleCotizacion

@Dao
interface DetalleCotizacionDao {

    @Insert
    suspend fun insertar(detalle: DetalleCotizacion)

    @Query("SELECT * FROM detalle_cotizacion WHERE cotizacionId=:id")
    suspend fun obtenerDetalle(id:Int): List<DetalleCotizacion>
}