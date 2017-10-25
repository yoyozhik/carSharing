package com.exposit.carsharing.service;

import com.exposit.carsharing.domain.*;
import com.exposit.carsharing.dto.CarParameterRequest;
import com.exposit.carsharing.exception.EntityAlreadyExistException;
import com.exposit.carsharing.exception.EntityNotFoundException;
import com.exposit.carsharing.exception.PrivilegeException;

import java.util.List;

public interface AdminService {

    // ---------------------- Body type --------------------

    void checkBodyTypeExist(String name) throws EntityNotFoundException;

    void checkBodyTypeNameUsed(String name) throws EntityAlreadyExistException;

    BodyType createBodyType(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteBodyType(Long id) throws EntityNotFoundException;

    BodyType updateBodyType(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<BodyType> getAllBodyTypes();

    BodyType getBodyType(Long id) throws EntityNotFoundException;

    // ---------------------- Brand --------------------
    void checkBrandExist(String name) throws EntityNotFoundException;

    void checkBrandAndModelExist(String brand, String model) throws EntityNotFoundException, PrivilegeException;

    void checkBrandNameUsed(String name) throws EntityAlreadyExistException;

    Brand createBrand(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteBrand(Long id) throws EntityNotFoundException;

    Brand updateBrand(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<Brand> getAllBrands();

    Brand getBrand(Long id) throws EntityNotFoundException;

    // ---------------------- Color --------------------
    void checkColorExist(String name) throws EntityNotFoundException;

    void checkColorNameUsed(String name) throws EntityAlreadyExistException;

    Color createColor(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteColor(Long id) throws EntityNotFoundException;

    Color updateColor(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<Color> getAllColors();

    Color getColor(Long id) throws EntityNotFoundException;

    // ---------------------- Drive unit --------------------
    void checkDriveUnitExist(String name) throws EntityNotFoundException;

    void checkDriveUnitNameUsed(String name) throws EntityAlreadyExistException;

    DriveUnit createDriveUnit(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteDriveUnit(Long id) throws EntityNotFoundException;

    DriveUnit updateDriveUnit(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<DriveUnit> getAllDriveUnits();

    DriveUnit getDriveUnit(Long id) throws EntityNotFoundException;

    // ---------------------- Fuel type --------------------
    void checkFuelTypeExist(String name) throws EntityNotFoundException;

    void checkFuelTypeNameUsed(String name) throws EntityAlreadyExistException;

    FuelType createFuelType(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteFuelType(Long id) throws EntityNotFoundException;

    FuelType updateFuelType(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<FuelType> getAllFuelTypes();

    FuelType getFuelType(Long id) throws EntityNotFoundException;

    // ---------------------- Gearbox --------------------
    void checkGearboxExist(String name) throws EntityNotFoundException;

    void checkGearboxNameUsed(String name) throws EntityAlreadyExistException;

    Gearbox createGearbox(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteGearbox(Long id) throws EntityNotFoundException;

    Gearbox updateGearbox(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<Gearbox> getAllGearboxes();

    Gearbox getGearbox(Long id) throws EntityNotFoundException;

    // ---------------------- Interior material --------------------
    void checkInteriorMaterialExist(String name) throws EntityNotFoundException;

    void checkInteriorMaterialNameUsed(String name) throws EntityAlreadyExistException;

    InteriorMaterial createInteriorMaterial(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteInteriorMaterial(Long id) throws EntityNotFoundException;

    InteriorMaterial updateInteriorMaterial(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<InteriorMaterial> getAllInteriorMaterials();

    InteriorMaterial getInteriorMaterial(Long id) throws EntityNotFoundException;

    // ---------------------- Model --------------------
    void checkModelExist(String name) throws EntityNotFoundException;

    void checkModelNameUsed(String name) throws EntityAlreadyExistException;

    Model createModel(Long brandId, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    void deleteModel(Long id) throws EntityNotFoundException;

    Model updateModel(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<Model> getAllModels();

    List<Model> getAllModelsByBrand(Long brand_id) throws EntityNotFoundException;

    Model getModel(Long id) throws EntityNotFoundException;

    // ---------------------- Tires season --------------------
    void checkTiresSeasonExist(String name) throws EntityNotFoundException;

    void checkTiresSeasonNameUsed(String name) throws EntityAlreadyExistException;

    TiresSeason createTiresSeason(CarParameterRequest carParameterRequest) throws EntityAlreadyExistException;

    void deleteTiresSeason(Long id) throws EntityNotFoundException;

    TiresSeason updateTiresSeason(Long id, CarParameterRequest carParameterRequest) throws EntityAlreadyExistException, EntityNotFoundException;

    List<TiresSeason> getAllTiresSeasons();

    TiresSeason getTiresSeason(Long id) throws EntityNotFoundException;
}
