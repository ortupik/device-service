package com.chris.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.security.modal.DeviceCommand;
import com.chris.security.service.DeviceCommandService;

@RestController
@RequestMapping(value = "/device/command")
public class DeviceCommandController {

	@Autowired
	private DeviceCommandService deviceCommandService;

	@GetMapping(value = "/{deviceId}")
	public ResponseEntity<List<DeviceCommand>> findDeviceCommandByDeviceId(@PathVariable String deviceId) {
		return new ResponseEntity<>(deviceCommandService.findDeviceCommandByDeviceId(deviceId), HttpStatus.OK);
	}

	@PostMapping(value = "/{deviceId}")
	public ResponseEntity<DeviceCommand> sendDeviceCommand(@PathVariable String deviceId,
			@RequestBody DeviceCommand deviceCommand) {
		return new ResponseEntity<>(deviceCommandService.sendDeviceCommand(deviceId, deviceCommand),
				HttpStatus.CREATED);
	}

}