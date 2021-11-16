package com.lost.libroskotlin

fun main(){

    var libro1: LibroEscolar = LibroEscolar("Lo que el viento no se llevó", 1, 1980,
        "Ercilla", 345, 29990, "Anonimo",
        TipoLibro.IMPRESO)

    var libro2: LibroEscolar = LibroEscolar("Las aventuras de bob esponja", 2, 1999,
        "Fondo de Vikini", 230, 15990, "Don Cangrejo",
        TipoLibro.DIGITAL)

    var libro3: LibroEscolar = LibroEscolar("Autorretrato de Calamardo", 4, 2000,
        "Fondo de Vikini", 890, 30990, "Calamardo Tentaculos",
        TipoLibro.IMPRESO)

    val libro4: LibroEscolar = LibroEscolar("Aventuras en Hyrule", 5, 1986,
        "Impresiones Nintendo", 1000, 35000, "Link",
        TipoLibro.IMPRESO)

    libro1.imprimir()
    println(libro1.precioFormateado())
    libro2.imprimir()
    libro3.imprimir()
    libro4.imprimir()
}