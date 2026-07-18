package com.example.aplicacioncotizacion.data.dao


import androidx.room.*
import com.example.aplicacioncotizacion.data.entity.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun insertar(usuario: Usuario)

    @Update
    suspend fun actualizar(usuario: Usuario)

    @Delete
    suspend fun eliminar(usuario: Usuario)

    @Query("SELECT * FROM usuarios")
    suspend fun obtenerTodos(): List<Usuario>

    @Query("SELECT * FROM usuarios WHERE usuario=:usuario AND password=:password LIMIT 1")
    suspend fun login(usuario:String,password:String): Usuario?
}