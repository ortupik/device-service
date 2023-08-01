package com.chris.security.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chris.security.modal.DeviceCommand;

@Repository
public interface DeviceCommandRepository extends CrudRepository<DeviceCommand, String> {
	List<DeviceCommand> findDeviceCommandByDeviceId(String deviceId);
}
