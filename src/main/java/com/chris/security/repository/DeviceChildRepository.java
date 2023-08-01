package com.chris.security.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chris.security.modal.DeviceChild;

@Repository
public interface DeviceChildRepository extends CrudRepository<DeviceChild, String> {
	Optional<DeviceChild> findDeviceChildByDeviceId(String deviceId);
}
