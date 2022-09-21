package org.thomas.backend.controllers.badges

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class BadgesDTO(
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val metric: String,
    val createdAt: Date,
    val updatedAt: Date,
    val points: Int,
    val requiredVal: Int
)