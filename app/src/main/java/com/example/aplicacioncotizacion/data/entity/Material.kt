package com.example.aplicacioncotizacion.data.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Materiales disponibles para cotización.
 */
@Entity(tableName = "materiales")
data class Material(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val nombre:String,

    val unidad:String,

    val precio:Double,

    val stock:Int
)