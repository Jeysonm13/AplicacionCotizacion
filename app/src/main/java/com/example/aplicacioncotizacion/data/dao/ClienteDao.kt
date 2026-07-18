package com.example.aplicacioncotizacion.data.dao

import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.Cliente

@Dao
interface ClienteDao {

    @Insert
    suspend fun insertar(cliente: Cliente)

    @Update
    suspend fun actualizar(cliente: Cliente)

    @Delete
    suspend fun eliminar(cliente: Cliente)

    @Query("SELECT * FROM clientes ORDER BY nombre")
    suspend fun obtenerTodos(): List<Cliente>
}