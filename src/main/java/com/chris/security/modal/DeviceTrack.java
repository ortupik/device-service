package com.chris.security.modal;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Table
public class DeviceTrack implements Serializable {

	private static final long serialVersionUID = 8253884236522733251L;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "device_id")
	private String deviceId;

	@Column(name = "track_data_id")
	private String trackDataId;

	@Column(name = "status")
	private String status;

	@Column(name = "time_created")
	private Timestamp timeCreated;

	public String getDeviceId() {
		return deviceId;
	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public String getTrackDataId() {
		return trackDataId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public void setTrackDataId(String trackDataId) {
		this.trackDataId = trackDataId;
	}

}
