package com.example.aplicacioncotizacion.data.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Proyecto de construcción.
 */
@Entity(tableName = "proyectos")
data class Proyecto(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val nombre:String,

    val clienteId:Int,

    val largo:Double,

    val ancho:Double,

    val altura:Double,

    val pisos:Int,

    val fecha:String
)