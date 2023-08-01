package com.chris.security.service;

import java.util.List;

import com.chris.security.modal.DeviceCommand;

public interface DeviceCommandService {

	List<DeviceCommand> findDeviceCommandByDeviceId(String deviceId);

	DeviceCommand sendDeviceCommand(String deviceId, DeviceCommand deviceCommand);

}
