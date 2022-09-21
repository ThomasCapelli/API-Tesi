package org.thomas.database.repositories;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lorg/thomas/database/repositories/InsectsMapper;", "", "toDTO", "Lorg/thomas/backend/controllers/insects/InsectsDTO;", "entity", "Lorg/thomas/database/models/Insects;", "mini-api"})
public abstract interface InsectsMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL)
    public abstract org.thomas.backend.controllers.insects.InsectsDTO toDTO(@org.jetbrains.annotations.NotNull
    org.thomas.database.models.Insects entity);
}