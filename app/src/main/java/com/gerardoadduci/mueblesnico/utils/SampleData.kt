package com.gerardoadduci.mueblesnico.utils

import com.gerardoadduci.mueblesnico.models.Furniture
import com.gerardoadduci.mueblesnico.models.Dimensions
import java.math.BigDecimal

object SampleData {
    val furnitureList = listOf(
        Furniture(
            id = "1",
            name = "Sofá Moderno",
            description = "Sofá de 3 plazas en color gris",
            price = BigDecimal("599.99"),
            category = "Sofás",
            imageUrl = "https://example.com/sofa.jpg",
            dimensions = Dimensions(220f, 85f, 95f),
            material = "Tela",
            stock = 5
        ),
        Furniture(
            id = "2",
            name = "Mesa de Comedor",
            description = "Mesa de comedor extensible de madera",
            price = BigDecimal("399.99"),
            category = "Mesas",
            imageUrl = "https://example.com/mesa.jpg",
            dimensions = Dimensions(160f, 75f, 90f),
            material = "Madera de roble",
            stock = 3
        ),
        Furniture(
            id = "3",
            name = "Silla de Oficina",
            description = "Silla ergonómica con ruedas",
            price = BigDecimal("199.99"),
            category = "Sillas",
            imageUrl = "https://example.com/silla.jpg",
            dimensions = Dimensions(60f, 120f, 60f),
            material = "Cuero sintético",
            stock = 10
        )
    )
}