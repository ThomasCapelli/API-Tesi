package org.thomas.backend.controllers.insects

import org.mapstruct.factory.Mappers
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.thomas.database.repositories.InsectsMapper
import org.thomas.database.repositories.InsectsRepository
import org.thomas.database.repositories.UsersMapper

@RestController
@RequestMapping("/insects")
class InsectsController {
    private val logger = LoggerFactory.getLogger(InsectsController::class.java)

    @Autowired
    lateinit var insectsRepo: InsectsRepository
    var insectsMapper = Mappers.getMapper(InsectsMapper::class.java)

    @GetMapping
    fun getAllInsects(): List<InsectsDTO> {
        logger.info("getting all insects...")
        val insects = insectsRepo.findAll()
        logger.info("found {} users", insects.size)
        return insects.map { insectsMapper.toDTO(it) }
    }
}