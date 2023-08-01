package com.chris.security.modal;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Table
public class DeviceCommand implements Serializable {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long command_id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "device")
	private DeviceDetails device;

	@Column(name = "device_id")
	private String deviceId;

	@Column(name = "command")
	private String command;

	@Column(name = "extra_text")
	private String extraText;

	@Column(name = "status")
	private String status;

	@Column(name = "time_created")
	private Timestamp timeCreated;

	public String getCommand() {
		return command;
	}

	public Long getCommand_id() {
		return command_id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExtraText() {
		return extraText;
	}

	public String getStatus() {
		return status;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public void setCommand_id(Long command_id) {
		this.command_id = command_id;
	}

	public void setDevice(DeviceDetails device) {
		this.device = device;
	}

	public void setExtraText(String extraText) {
		this.extraText = extraText;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}
}
