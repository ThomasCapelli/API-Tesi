package org.thomas.backend.controllers.badges

import org.mapstruct.factory.Mappers
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.thomas.backend.controllers.insects.InsectsController
import org.thomas.backend.controllers.insects.InsectsDTO
import org.thomas.database.repositories.BadgesMapper
import org.thomas.database.repositories.BadgesRepository
import org.thomas.database.repositories.InsectsMapper
import org.thomas.database.repositories.InsectsRepository


@RestController
@RequestMapping("/badges")
class BadgesController {
    private val logger = LoggerFactory.getLogger(BadgesController::class.java)

    @Autowired
    lateinit var badgesRepo: BadgesRepository
    var badgesMapper = Mappers.getMapper(BadgesMapper::class.java)

    @GetMapping
    fun getAllBadges(): List<BadgesDTO> {
        logger.info("getting all insects...")
        val badges = badgesRepo.findAll()
        logger.info("found {} users", badges.size)
        return badges.map { badgesMapper.toDTO(it) }
    }
}