package com.example.aplicacioncotizacion.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad que almacena los usuarios del sistema.
 */
@Entity(tableName = "usuarios")
data class Usuario(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val nombre:String,

    val usuario:String,

    val password:String
)