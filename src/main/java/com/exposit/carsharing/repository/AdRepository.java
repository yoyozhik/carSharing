package com.exposit.carsharing.repository;

import com.exposit.carsharing.model.Ad;
import com.exposit.carsharing.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {
    List<Ad> findAllByOwner(Profile owner);
}
