package com.lost.libroskotlin

data class LibroEscolar(var nombreLibro: String, var ISBN: Int, var agnoPublicacion: Int,
                        var editorial: String, var pags: Int, var precio:Int, var autor: String,
                        var tipoLibro: TipoLibro)
{

    fun precioFormateado(): String{

        return "El precio es: $$precio"
    }

    fun imprimir(){

        println(this.toString())
    }

}

enum class TipoLibro{
    DIGITAL,
    IMPRESO
}