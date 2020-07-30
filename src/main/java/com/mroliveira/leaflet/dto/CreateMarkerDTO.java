package com.mroliveira.leaflet.dto;

import com.mroliveira.leaflet.domain.Geometry;

public class CreateMarkerDTO {
  private String type;
  private Geometry geometry;

  public CreateMarkerDTO(String type, Geometry geometry) {
    this.type = type;
    this.geometry = geometry;
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