package com.mroliveira.leaflet.services;

import java.util.List;

import com.mroliveira.leaflet.domain.Marker;
import com.mroliveira.leaflet.dto.CreateMarkerDTO;
import com.mroliveira.leaflet.repository.MarkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkerServiceImpl implements MarkerService {

  @Autowired
  private MarkerRepository markerRepository;

  public List<Marker> find() {
    List<Marker> markers = this.markerRepository.findAll();
    return markers;
  }

  public Marker create(CreateMarkerDTO dto) {
    Marker marker = new Marker();
    marker.setType(dto.getType());
    marker.setGeometry(dto.getGeometry());

    Marker savedMarker = this.markerRepository.save(marker);
    return savedMarker;
  }

  public Marker delete(String id) {
    Marker markedToDelete = this.markerRepository.findById(id).get();
    this.markerRepository.delete(markedToDelete);
    return markedToDelete;
  }

}