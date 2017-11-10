package com.exposit.carsharing.service;

import com.exposit.carsharing.domain.Profile;
import com.exposit.carsharing.dto.ProfileRequest;
import com.exposit.carsharing.dto.ProfileResponse;
import com.exposit.carsharing.dto.UserResponse;
import com.exposit.carsharing.exception.ConfirmProfileException;
import com.exposit.carsharing.exception.EntityNotFoundException;
import com.exposit.carsharing.exception.PrivilegeException;

import java.util.List;

public interface ProfileService {
    Profile getProfile(Long id) throws EntityNotFoundException;

    ProfileResponse getProfileResponse(Long id) throws EntityNotFoundException;

    ProfileResponse updateProfile(Long id, ProfileRequest profileRequest) throws EntityNotFoundException;

    List<ProfileResponse> getAll();

    void delete(Long profileId) throws EntityNotFoundException;

    UserResponse findByEmail(String email) throws EntityNotFoundException;

    void setConfirmProfileCheck(Long profileId) throws EntityNotFoundException, ConfirmProfileException;

    void setConfirmProfileNo(Long profileId) throws EntityNotFoundException;
}
