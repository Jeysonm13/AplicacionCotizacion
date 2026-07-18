package com.example.aplicacioncotizacion.data.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Información del cliente.
 */
@Entity(tableName = "clientes")
data class Cliente(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val nombre:String,

    val cedula:String,

    val telefono:String,

    val direccion:String,

    val correo:String
)