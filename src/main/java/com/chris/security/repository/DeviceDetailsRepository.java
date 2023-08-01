package com.chris.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chris.security.modal.DeviceDetails;

@Repository
public interface DeviceDetailsRepository extends CrudRepository<DeviceDetails, String> {
	Optional<DeviceDetails> findDeviceDetailsByDeviceId(String deviceId);

	List<DeviceDetails> findDeviceDetailsByUserId(String userId);
}
