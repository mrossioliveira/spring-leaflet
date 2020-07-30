package com.mroliveira.leaflet.converter;

import java.io.IOException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mroliveira.leaflet.domain.Geometry;

@Converter()
public class GeometryJsonConverter implements AttributeConverter<Geometry, String> {
  private final static ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public String convertToDatabaseColumn(Geometry meta) {
    try {
      return objectMapper.writeValueAsString(meta);
    } catch (JsonProcessingException ex) {
      return null;
    }
  }

  @Override
  public Geometry convertToEntityAttribute(String dbData) {
    try {
      return objectMapper.readValue(dbData, Geometry.class);
    } catch (IOException ex) {
      return null;
    }
  }

}