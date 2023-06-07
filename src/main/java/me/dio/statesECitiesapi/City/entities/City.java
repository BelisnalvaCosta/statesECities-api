package me.dio.statesECitiesapi.City.entities;

import jakarta.persistence.*;
import org.springframework.data.geo.Point;

@Entity
@Table(name = "cidade")
/*@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
 */

public class City<String, Long, Integer> {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd - @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    @ManyToOne
    @JoinColumn(name = "new_entity_ID")
    private NewEntity newEntity;

    public NewEntity getNewEntity() {
        return newEntity;
    }

    public void setNewEntity(NewEntity newEntity) {
        this.newEntity = newEntity;
    }

    public City() {
    }

    /**
     *
     * @param id
     * @param name
     * @param uf
     * @param ibge
     * @param geolocation
     * @param location
     */
    public City(final Long id, final String name, final Integer uf, final Integer ibge,
                final String geolocation, final Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.ibge = ibge;
        this.geolocation = geolocation;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return location;
    }
}