package org.acme.resteasy.entities;

import javax.persistence.*;

@Entity
@Table(name = "RACE_TEAMS")
public class RaceTeamEntity {

    @Id
    @Column(name = "ID", length = 26)
    private String id;

    @Column(name = "NAME", nullable = false, length = 256)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
