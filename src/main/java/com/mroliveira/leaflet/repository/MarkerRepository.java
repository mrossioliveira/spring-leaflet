package com.mroliveira.leaflet.repository;

import com.mroliveira.leaflet.domain.Marker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepository extends JpaRepository<Marker, String> {

}