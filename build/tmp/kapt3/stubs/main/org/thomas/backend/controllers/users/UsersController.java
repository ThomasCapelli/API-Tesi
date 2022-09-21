package org.thomas.backend.controllers.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0017J\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0017J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0014H\u0017J\u001c\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0017R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lorg/thomas/backend/controllers/users/UsersController;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "userMapper", "Lorg/thomas/database/repositories/UsersMapper;", "getUserMapper", "()Lorg/thomas/database/repositories/UsersMapper;", "setUserMapper", "(Lorg/thomas/database/repositories/UsersMapper;)V", "userRepo", "Lorg/thomas/database/repositories/UserRepository;", "getUserRepo", "()Lorg/thomas/database/repositories/UserRepository;", "setUserRepo", "(Lorg/thomas/database/repositories/UserRepository;)V", "getAllUsers", "", "Lorg/thomas/backend/controllers/users/UserDTO;", "getUserById", "id", "", "insertUser", "", "user", "updateUserEmail", "email", "", "mini-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/users"})
@org.springframework.web.bind.annotation.RestController
public class UsersController {
    private final org.slf4j.Logger logger = null;
    @org.springframework.beans.factory.annotation.Autowired
    public org.thomas.database.repositories.UserRepository userRepo;
    private org.thomas.database.repositories.UsersMapper userMapper;
    
    public UsersController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.thomas.database.repositories.UserRepository getUserRepo() {
        return null;
    }
    
    public void setUserRepo(@org.jetbrains.annotations.NotNull
    org.thomas.database.repositories.UserRepository p0) {
    }
    
    public org.thomas.database.repositories.UsersMapper getUserMapper() {
        return null;
    }
    
    public void setUserMapper(org.thomas.database.repositories.UsersMapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/alluser"})
    public java.util.List<org.thomas.backend.controllers.users.UserDTO> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/user/{id}"})
    public org.thomas.backend.controllers.users.UserDTO getUserById(@org.springframework.web.bind.annotation.PathVariable
    int id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/user/{id}"})
    public void updateUserEmail(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String email, @org.springframework.web.bind.annotation.PathVariable
    int id) {
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/user"})
    public void insertUser(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    org.thomas.backend.controllers.users.UserDTO user) {
    }
}