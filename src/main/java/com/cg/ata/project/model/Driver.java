package com.cg.ata.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_table")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driId;

	@Column(name = "driverName")
	private String driName;

	@Column(name = "driverAdress")
	private String driAddress;

	@Column(name = "driverContactNo")
	private long driContactNo;

	@Column(name = "driverLincenceNo")
	private String driLinceNo;

	public Driver() {
		super();
	}

	public Driver(int driverId, String driverName) {
		super();
		this.driId = driverId;
		this.driName = driverName;
	}

	public Driver(int driverId, String driverName, String driverAddress) {
		super();
		this.driId = driverId;
		this.driName = driverName;
		this.driAddress = driverAddress;
	}

	public Driver(int driverId, String driverName, String driverAddress, long driverContactNumber) {
		super();
		this.driId = driverId;
		this.driName = driverName;
		this.driAddress = driverAddress;
		this.driContactNo = driverContactNumber;
	}

	public Driver(int driverId, String driverName, String driverAddress, long driverContactNumber,
			String driverLincenceNumber) {
		super();
		this.driId = driverId;
		this.driName = driverName;
		this.driAddress = driverAddress;
		this.driContactNo = driverContactNumber;
		this.driLinceNo = driverLincenceNumber;
	}

	public int getDriverId() {
		return driId;
	}

	public void setDriverId(int driverId) {
		this.driId = driverId;
	}

	public String getDriverName() {
		return driName;
	}

	public void setDriverName(String driverName) {
		this.driName = driverName;
	}

	public String getDriverAddress() {
		return driAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driAddress = driverAddress;
	}

	public long getDriverContactNumber() {
		return driContactNo;
	}

	public void setDriverContactNumber(long driverContactNumber) {
		this.driContactNo = driverContactNumber;
	}

	public String getDriverLincenceNumber() {
		return driLinceNo;
	}

	public void setDriverLincenceNumber(String driverLincenceNumber) {
		this.driLinceNo = driverLincenceNumber;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driId + ", driverName=" + driName + ", driverAddress=" + driAddress
				+ ", driverContactNumber=" + driContactNo + ", driverLincenceNumber=" + driLinceNo
				+ "]";
	}

}