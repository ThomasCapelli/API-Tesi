package org.thomas.database.repositories

import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.thomas.backend.controllers.users.UserDTO
import org.thomas.database.models.User

@Repository
interface UserRepository : JpaRepository<User, Int>

@Mapper
interface UsersMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    fun toDTO(entity: User): UserDTO
}