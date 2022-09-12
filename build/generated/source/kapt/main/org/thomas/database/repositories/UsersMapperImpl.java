package org.thomas.database.repositories;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.thomas.backend.controllers.users.UserDTO;
import org.thomas.database.models.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-12T16:16:34+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 13.0.12 (Azul Systems, Inc.)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UserDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        int id = 0;
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
}
