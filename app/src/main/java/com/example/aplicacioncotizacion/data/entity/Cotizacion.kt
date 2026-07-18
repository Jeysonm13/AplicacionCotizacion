package com.example.aplicacioncotizacion.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cotizaciones")
data class Cotizacion(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val proyectoId:Int,

    val fecha:String,

    val total:Double
)