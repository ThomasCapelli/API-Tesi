package org.thomas.database.repositories;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.thomas.backend.controllers.badges.BadgesDTO;
import org.thomas.database.models.Badges;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-20T17:15:26+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 13.0.12 (Azul Systems, Inc.)"
)
@Component
public class BadgesMapperImpl implements BadgesMapper {

    @Override
    public BadgesDTO toDTO(Badges entity) {
        if ( entity == null ) {
            return null;
        }

        int id = 0;
        String title = null;
        String description = null;
        String image = null;
        String metric = null;
        Date createdAt = null;
        Date updatedAt = null;
        int points = 0;
        int requiredVal = 0;

        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        image = entity.getImage();
        metric = entity.getMetric();
        createdAt = entity.getCreatedAt();
        updatedAt = entity.getUpdatedAt();
        points = entity.getPoints();
        requiredVal = entity.getRequiredVal();

        BadgesDTO badgesDTO = new BadgesDTO( id, title, description, image, metric, createdAt, updatedAt, points, requiredVal );

        return badgesDTO;
    }
}
