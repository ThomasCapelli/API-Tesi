package org.thomas.database.repositories

import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.thomas.backend.controllers.insects.InsectsDTO
import org.thomas.database.models.Insects

@Repository
interface InsectsRepository : JpaRepository<Insects, Int> {

}

@Mapper
interface InsectsMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    fun toDTO(entity: Insects): InsectsDTO
}