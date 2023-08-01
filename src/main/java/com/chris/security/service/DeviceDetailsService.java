package com.chris.security.service;

import java.util.List;
import java.util.Map;

import com.chris.security.modal.DeviceChild;
import com.chris.security.modal.DeviceDetails;
import com.chris.security.modal.DeviceStatus;

public interface DeviceDetailsService {

	public DeviceDetails findDeviceDetailsByDeviceId(String deviceId);

	public List<DeviceDetails> findDeviceDetailsByUserId(String userId);

	public DeviceStatus getDeviceStatus(String deviceId);

	public DeviceDetails saveDeviceDetails(DeviceDetails details);

	public DeviceStatus updateDeviceStatus(String deviceId, Map<String, Object> data);

	public List<DeviceChild> findDeviceChildrenByDeviceId(String deviceId);

	public DeviceChild saveDeviceChild(String deviceId, DeviceChild deviceChild);

	public void removeDeviceChild(String deviceId);

}
