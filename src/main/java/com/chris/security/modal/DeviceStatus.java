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
public class DeviceStatus implements Serializable {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "status_id")
	private Long statusId;

	@Column(name = "battery_life")
	private int batteryLife;

	@Column(name = "reported_lost")
	private int reportedLost;

	@Column(name = "time_reported")
	private Timestamp timeReported;

	@Column(name = "place_reported")
	private String placeReported;

	@Column(name = "current_status")
	private String currentStatus;

	@Column(name = "how_lost")
	private String howLost;

	@Column(name = "lost_report")
	private String lostReport;

	@Column(name = "ob_file_url")
	private String obFileUrl;

	@Column(name = "last_active")
	private Timestamp lastActive;

	public int getBatteryLife() {
		return batteryLife;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public String getHowLost() {
		return howLost;
	}

	public Long getId() {
		return id;
	}

	public Timestamp getLastActive() {
		return lastActive;
	}

	public String getLostReport() {
		return lostReport;
	}

	public String getObFileUrl() {
		return obFileUrl;
	}

	public String getPlaceReported() {
		return placeReported;
	}

	public int getReportedLost() {
		return reportedLost;
	}

	public Long getStatusId() {
		return statusId;
	}

	public Timestamp getTimeReported() {
		return timeReported;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public void setHowLost(String howLost) {
		this.howLost = howLost;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastActive(Timestamp lastActive) {
		this.lastActive = lastActive;
	}

	public void setLostReport(String lostReport) {
		this.lostReport = lostReport;
	}

	public void setObFileUrl(String obFileUrl) {
		this.obFileUrl = obFileUrl;
	}

	public void setPlaceReported(String placeReported) {
		this.placeReported = placeReported;
	}

	public void setReportedLost(int reportedLost) {
		this.reportedLost = reportedLost;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public void setTimeReported(Timestamp timeReported) {
		this.timeReported = timeReported;
	}

}
