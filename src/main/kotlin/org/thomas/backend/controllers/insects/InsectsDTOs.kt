package org.thomas.backend.controllers.insects

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class InsectsDTO(
    val id: Int,
    val name: String,
    val description: String,
    val image: String?,
    val type: String,
    val rarity: Int
    )
