package org.acme.resteasy.entities;

import javax.persistence.*;

@Entity
@Table(name = "RACE_CAR_DRIVERS")
public class RaceCarDriverEntity {

    @Id
    @Column(name = "ID", length = 26)
    private String id;

    @ManyToOne
    @JoinColumn(name = "RACE_TEAM_ID", nullable = false)
    private RaceTeamEntity team;

    @Column(name = "NAME", nullable = false, length = 256)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RaceTeamEntity getTeam() {
        return team;
    }

    public void setTeam(RaceTeamEntity team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
