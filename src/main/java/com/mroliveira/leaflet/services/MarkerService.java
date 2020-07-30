package com.mroliveira.leaflet.services;

import java.util.List;

import com.mroliveira.leaflet.domain.Marker;
import com.mroliveira.leaflet.dto.CreateMarkerDTO;

public interface MarkerService {
  public List<Marker> find();

  public Marker create(CreateMarkerDTO dto);

  public Marker delete(String id);
}