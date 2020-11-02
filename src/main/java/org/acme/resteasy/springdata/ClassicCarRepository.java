package org.acme.resteasy.springdata;

import org.acme.resteasy.entities.ClassicCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassicCarRepository extends JpaRepository<ClassicCarEntity, String> {

    /**
     * Camel case issue
     * @param carBrandId
     * @return a list of {@link ClassicCarEntity}
     */
    List<ClassicCarEntity> findByCarBrandIdAndHorsePowerGreaterThan(String carBrandId, int horsePower);


    /**
     * Camel case issue
     * @param teamName
     * @return a list of {@link ClassicCarEntity}
     */
    List<ClassicCarEntity> findByRaceCarDriverTeamName(String teamName);
}
