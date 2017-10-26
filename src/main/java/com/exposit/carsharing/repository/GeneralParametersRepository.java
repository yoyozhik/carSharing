package com.exposit.carsharing.repository;

import com.exposit.carsharing.domain.Car;
import com.exposit.carsharing.domain.GeneralParameters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralParametersRepository extends JpaRepository<GeneralParameters, Long> {
    GeneralParameters findByCar(Car car);
}
