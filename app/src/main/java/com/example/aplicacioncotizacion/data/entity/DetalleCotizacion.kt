package com.example.aplicacioncotizacion.data.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "detalle_cotizacion")
data class DetalleCotizacion(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val cotizacionId:Int,

    val materialId:Int,

    val cantidad:Double,

    val precio:Double,

    val subtotal:Double
)