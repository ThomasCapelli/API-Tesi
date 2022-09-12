package org.thomas.backend.controllers.users

import org.mapstruct.factory.Mappers
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.thomas.database.repositories.UserRepository
import org.thomas.database.repositories.UsersMapper

@RestController
@RequestMapping("/users")
class UsersController {
    private val logger = LoggerFactory.getLogger(UsersController::class.java)

    @Autowired
    lateinit var userRepo: UserRepository
    var userMapper = Mappers.getMapper(UsersMapper::class.java)

    @GetMapping
    fun getAllUsers(): List<UserDTO> {
        logger.info("getting all users...")
        val users = userRepo.findAll()
        logger.info("found {} users", users.size)
        return users.map { userMapper.toDTO(it) }
    }
}