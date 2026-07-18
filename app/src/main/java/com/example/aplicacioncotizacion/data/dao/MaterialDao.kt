package com.example.aplicacioncotizacion.data.dao


import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.Material

@Dao
interface MaterialDao {

    @Insert
    suspend fun insertar(material: Material)

    @Update
    suspend fun actualizar(material: Material)

    @Delete
    suspend fun eliminar(material: Material)

    @Query("SELECT * FROM materiales")
    suspend fun obtenerTodos(): List<Material>
}