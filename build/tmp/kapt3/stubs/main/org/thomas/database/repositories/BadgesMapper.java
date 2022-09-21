package org.thomas.database.repositories;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lorg/thomas/database/repositories/BadgesMapper;", "", "toDTO", "Lorg/thomas/backend/controllers/badges/BadgesDTO;", "entity", "Lorg/thomas/database/models/Badges;", "mini-api"})
public abstract interface BadgesMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL)
    public abstract org.thomas.backend.controllers.badges.BadgesDTO toDTO(@org.jetbrains.annotations.NotNull
    org.thomas.database.models.Badges entity);
}