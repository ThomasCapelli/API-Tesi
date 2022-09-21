package org.thomas.database.repositories;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.thomas.backend.controllers.insects.InsectsDTO;
import org.thomas.database.models.Insects;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-20T17:15:26+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 13.0.12 (Azul Systems, Inc.)"
)
@Component
public class InsectsMapperImpl implements InsectsMapper {

    @Override
    public InsectsDTO toDTO(Insects entity) {
        if ( entity == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        String description = null;
        String image = null;
        String type = null;
        int rarity = 0;

        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        image = entity.getImage();
        type = entity.getType();
        rarity = entity.getRarity();

        InsectsDTO insectsDTO = new InsectsDTO( id, name, description, image, type, rarity );

        return insectsDTO;
    }
}
