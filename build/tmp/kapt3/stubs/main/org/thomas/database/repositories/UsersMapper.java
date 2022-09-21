package org.thomas.database.repositories;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lorg/thomas/database/repositories/UsersMapper;", "", "toDBEntry", "Lorg/thomas/database/models/User;", "entity", "Lorg/thomas/backend/controllers/users/UserDTO;", "toDTO", "mini-api"})
public abstract interface UsersMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL)
    public abstract org.thomas.backend.controllers.users.UserDTO toDTO(@org.jetbrains.annotations.NotNull
    org.thomas.database.models.User entity);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL)
    public abstract org.thomas.database.models.User toDBEntry(@org.jetbrains.annotations.NotNull
    org.thomas.backend.controllers.users.UserDTO entity);
}