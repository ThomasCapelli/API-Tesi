package org.thomas.backend.controllers.badges;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0017R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/thomas/backend/controllers/badges/BadgesController;", "", "()V", "badgesMapper", "Lorg/thomas/database/repositories/BadgesMapper;", "kotlin.jvm.PlatformType", "getBadgesMapper", "()Lorg/thomas/database/repositories/BadgesMapper;", "setBadgesMapper", "(Lorg/thomas/database/repositories/BadgesMapper;)V", "badgesRepo", "Lorg/thomas/database/repositories/BadgesRepository;", "getBadgesRepo", "()Lorg/thomas/database/repositories/BadgesRepository;", "setBadgesRepo", "(Lorg/thomas/database/repositories/BadgesRepository;)V", "logger", "Lorg/slf4j/Logger;", "getAllBadges", "", "Lorg/thomas/backend/controllers/badges/BadgesDTO;", "mini-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/badges"})
@org.springframework.web.bind.annotation.RestController
public class BadgesController {
    private final org.slf4j.Logger logger = null;
    @org.springframework.beans.factory.annotation.Autowired
    public org.thomas.database.repositories.BadgesRepository badgesRepo;
    private org.thomas.database.repositories.BadgesMapper badgesMapper;
    
    public BadgesController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.thomas.database.repositories.BadgesRepository getBadgesRepo() {
        return null;
    }
    
    public void setBadgesRepo(@org.jetbrains.annotations.NotNull
    org.thomas.database.repositories.BadgesRepository p0) {
    }
    
    public org.thomas.database.repositories.BadgesMapper getBadgesMapper() {
        return null;
    }
    
    public void setBadgesMapper(org.thomas.database.repositories.BadgesMapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<org.thomas.backend.controllers.badges.BadgesDTO> getAllBadges() {
        return null;
    }
}