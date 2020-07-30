package com.mroliveira.leaflet.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mroliveira.leaflet.converter.GeometryJsonConverter;

@Entity
@Table(name = "marker")
public class Marker implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @JsonProperty("_id")
  private String id;
  private String type;

  @Convert(converter = GeometryJsonConverter.class)
  private Geometry geometry;

  @PrePersist
  private void ensureId() {
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

}