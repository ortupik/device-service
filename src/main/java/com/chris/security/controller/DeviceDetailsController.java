package com.chris.security.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.security.modal.DeviceChild;
import com.chris.security.modal.DeviceDetails;
import com.chris.security.modal.DeviceStatus;
import com.chris.security.service.DeviceDetailsService;

@RestController
@RequestMapping(value = "/device")
public class DeviceDetailsController {

	@Autowired
	private DeviceDetailsService deviceService;

	@GetMapping(value = "/{deviceId}")
	public ResponseEntity<DeviceDetails> findDeviceDetailsByDeviceId(@PathVariable String deviceId) {
		return new ResponseEntity<>(deviceService.findDeviceDetailsByDeviceId(deviceId), HttpStatus.OK);
	}

	@GetMapping(value = "/user/{userId}")
	public ResponseEntity<List<DeviceDetails>> findDeviceDetailsByUserId(@PathVariable String userId) {
		return new ResponseEntity<>(deviceService.findDeviceDetailsByUserId(userId), HttpStatus.OK);
	}

	@GetMapping(value = "/status/{deviceId}")
	public ResponseEntity<DeviceStatus> findDeviceStatusByDeviceId(@PathVariable String deviceId) {
		return new ResponseEntity<>(deviceService.getDeviceStatus(deviceId), HttpStatus.OK);
	}

	@PostMapping(value = "/")
	public ResponseEntity<DeviceDetails> saveDeviceDetails(@RequestBody DeviceDetails deviceDetails) {
		return new ResponseEntity<>(deviceService.saveDeviceDetails(deviceDetails), HttpStatus.CREATED);
	}

	@PutMapping(value = "/status/{deviceId}")
	public ResponseEntity<DeviceStatus> updateDeviceStatus(@PathVariable String deviceId,
			@RequestBody Map<String, Object> data) {
		return new ResponseEntity<>(deviceService.updateDeviceStatus(deviceId, data), HttpStatus.CREATED);
	}

	@GetMapping(value = "/children/{deviceId}")
	public ResponseEntity<List<DeviceChild>> findDeviceChildrenByDeviceId(@PathVariable String deviceId) {
		return new ResponseEntity<>(deviceService.findDeviceChildrenByDeviceId(deviceId), HttpStatus.OK);
	}

	@PostMapping(value = "/child/{deviceId}")
	public ResponseEntity<DeviceChild> saveDeviceChild(@PathVariable String deviceId,
			@RequestBody DeviceChild deviceChild) {
		return new ResponseEntity<>(deviceService.saveDeviceChild(deviceId, deviceChild), HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/child/{deviceId}")
	public ResponseEntity<Void> removeDeviceChild(@PathVariable String deviceId) {
		deviceService.removeDeviceChild(deviceId);
		return new ResponseEntity<>(HttpStatus.GONE);
	}
}