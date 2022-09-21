package org.thomas.backend.controllers.users

import org.hibernate.annotations.Fetch
import org.mapstruct.factory.Mappers
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.thomas.database.models.User
import org.thomas.database.repositories.UserRepository
import org.thomas.database.repositories.UsersMapper
import java.util.Date

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
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Int): UserDTO {
        val user = userRepo.getById(id)
        return userMapper.toDTO(user)
    }

    @PatchMapping("/{id}")
    fun updateUserEmail(@RequestParam email: String, @PathVariable id: Int) {
        val user = userRepo.getById(id)
        user.email = email
        userRepo.save(user)
    }
    @PatchMapping("/{id}")
    fun updateUserDate(@RequestParam date: Date, @PathVariable id: Int) {
        val user = userRepo.getById(id)
        user.birthDate = date
        userRepo.save(user)
    }
    @PatchMapping("/{id}")
    fun updateUserUsername(@RequestParam username: String, @PathVariable id: Int) {
        val user = userRepo.getById(id)
        user.username = username
        userRepo.save(user)
    }
    @PatchMapping("/{id}")
    fun updateUserPassword(@RequestParam password: String, @PathVariable id: Int) {
        val user = userRepo.getById(id)
        user.email = password
        userRepo.save(user)
    }

    @PostMapping("/")
    fun insertUser(@RequestBody user: UserDTO) {
        userRepo.save(userMapper.toDBEntry(user))
    }

}