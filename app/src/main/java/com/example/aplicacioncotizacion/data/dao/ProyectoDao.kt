package com.example.aplicacioncotizacion.data.dao


import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.Proyecto

@Dao
interface ProyectoDao {

    @Insert
    suspend fun insertar(proyecto: Proyecto)

    @Query("SELECT * FROM proyectos")
    suspend fun obtenerTodos(): List<Proyecto>
}