package org.thomas.backend.controllers.users

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class UserDTO(
    val id: Int?,
    val email: String,
    val username: String,
    val password: String?,
    val birthDate: Date?,
    val createdAt: Date,
    val updatedAt: Date,
    val googleId: String?,
    val points: Int
)