package com.mroliveira.leaflet.controllers;

import java.util.List;

import com.mroliveira.leaflet.domain.Marker;
import com.mroliveira.leaflet.dto.CreateMarkerDTO;
import com.mroliveira.leaflet.services.MarkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("markers")
public class MarkerController {

  @Autowired
  private MarkerService markerService;

  @GetMapping()
  public List<Marker> find() {
    return this.markerService.find();
  }

  @PostMapping()
  public Marker create(@RequestBody CreateMarkerDTO dto) {
    return this.markerService.create(dto);
  }

  @DeleteMapping("{id}")
  public Marker delete(@PathVariable String id) {
    return this.markerService.delete(id);
  }

}