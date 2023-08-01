package com.chris.security.modal;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Table
public class DeviceDetails implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "device_id")
	private String deviceId;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "imei_one")
	private String imeiOne;

	@Column(name = "imei_two")
	private String imeiTwo;

	@Column(name = "sim_type")
	private String SimType;

	@Column(name = "vendor")
	private String vendor;

	@Column(name = "receipt_file_url")
	private String receiptFileUrl;

	@Column(name = "model")
	private String model;

	@Column(name = "date_manufacture")
	private String dateManufacture;

	@Column(name = "location_registered")
	private String locationRegistered;

	@Column(name = "date_bought")
	private String dateBought;

	@Column(name = "time_registered")
	private Timestamp timeRegistered;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id")
	private List<DeviceStatus> status;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "child_id")
	private List<DeviceChild> children;

	public String getDateBought() {
		return dateBought;
	}

	public String getDateManufacture() {
		return dateManufacture;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public Long getId() {
		return id;
	}

	public String getImeiOne() {
		return imeiOne;
	}

	public String getImeiTwo() {
		return imeiTwo;
	}

	public String getLocationRegistered() {
		return locationRegistered;
	}

	public String getModel() {
		return model;
	}

	public String getReceiptFileUrl() {
		return receiptFileUrl;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getSimType() {
		return SimType;
	}

	public List<DeviceStatus> getStatus() {
		return status;
	}

	public Timestamp getTimeRegistered() {
		return timeRegistered;
	}

	public String getUserId() {
		return userId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setDateBought(String dateBought) {
		this.dateBought = dateBought;
	}

	public void setDateManufacture(String dateManufacture) {
		this.dateManufacture = dateManufacture;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImeiOne(String imeiOne) {
		this.imeiOne = imeiOne;
	}

	public void setImeiTwo(String imeiTwo) {
		this.imeiTwo = imeiTwo;
	}

	public void setLocationRegistered(String locationRegistered) {
		this.locationRegistered = locationRegistered;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setReceiptFileUrl(String receiptFileUrl) {
		this.receiptFileUrl = receiptFileUrl;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setSimType(String simType) {
		SimType = simType;
	}

	public void setStatus(List<DeviceStatus> status) {
		this.status = status;
	}

	public void setTimeRegistered(Timestamp timeRegistered) {
		this.timeRegistered = timeRegistered;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public List<DeviceChild> getChildren() {
		return children;
	}

	public void setChildren(List<DeviceChild> children) {
		this.children = children;
	}

}
