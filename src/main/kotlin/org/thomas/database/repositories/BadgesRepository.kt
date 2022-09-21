package org.thomas.database.repositories

import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.thomas.backend.controllers.badges.BadgesDTO
import org.thomas.database.models.Badges

@Repository
interface BadgesRepository : JpaRepository<Badges, Int>

@Mapper
interface BadgesMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    fun toDTO(entity: Badges): BadgesDTO
}