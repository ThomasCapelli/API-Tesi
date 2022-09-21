package org.thomas.database.repositories;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.thomas.backend.controllers.users.UserDTO;
import org.thomas.database.models.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-20T17:15:26+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 13.0.12 (Azul Systems, Inc.)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UserDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String email = null;
        String username = null;
        String password = null;
        Date birthDate = null;
        Date createdAt = null;
        Date updatedAt = null;
        String googleId = null;
        int points = 0;

        id = entity.getId();
        email = entity.getEmail();
        username = entity.getUsername();
        password = entity.getPassword();
        birthDate = entity.getBirthDate();
        createdAt = entity.getCreatedAt();
        updatedAt = entity.getUpdatedAt();
        googleId = entity.getGoogleId();
        points = entity.getPoints();

        UserDTO userDTO = new UserDTO( id, email, username, password, birthDate, createdAt, updatedAt, googleId, points );

        return userDTO;
    }

    @Override
    public User toDBEntry(UserDTO entity) {
        if ( entity == null ) {
            return null;
        }

        String email = null;
        int id = 0;
        String username = null;
        String password = null;
        Date birthDate = null;
        Date createdAt = null;
        Date updatedAt = null;
        String googleId = null;
        int points = 0;

        email = entity.getEmail();
        if ( entity.getId() != null ) {
            id = entity.getId();
        }
        username = entity.getUsername();
        password = entity.getPassword();
        birthDate = entity.getBirthDate();
        createdAt = entity.getCreatedAt();
        updatedAt = entity.getUpdatedAt();
        googleId = entity.getGoogleId();
        points = entity.getPoints();

        User user = new User( id, email, username, password, birthDate, createdAt, updatedAt, googleId, points );

        return user;
    }
}
