package model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ForeignKey;

import com.sun.swing.internal.plaf.basic.resources.basic;

// All Date format has been changed to LocalDate formatting
@Entity
public class Patient {
	/**
	 * Encapsulated Fields.
	 * */
	@Id @GeneratedValue
	private int id;
	@Column
	private boolean isOutpatient; // This is a marker that will be used to check whether the patient is an outpatient - certain parameters may apply.
	@Column
	private String foreName;
	@Column
	private String surName;
	@Column
	private LocalDate dateOfBirth;
	@Column
	private boolean gender;
	@Column
	private String address;
	@Column
	private String phoneNumber;
	@Column
	private String nextOfKin;
	@Column
	private int doctorId;
	@Column
	private int departmentId;
	@Column
	private LocalDate admissionDate;
	@Column
	private LocalDate dischargeDate;
	@Column //@ForeignKey
	private int bedId;
	@Column
	private LocalDate appointmentDate;
	
	/**
	 * Mutator Methods.
	 * */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getForeName() {
		return foreName;
	}
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	// This part will need to be tested.
	public boolean isOutpatient() {
		return isOutpatient;
	}
	public void setOutpatient(boolean isOutpatient) {
		this.isOutpatient = isOutpatient;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender, String genderJSP) {
		//if(genderJSP.equals("Male"))
		this.gender = gender;
		//else if(genderJSP.equals("Female"))
			//this.gender = gender;
	}
	//
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNextOfKin() {
		return nextOfKin;
	}
	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public LocalDate getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(LocalDate dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admissionDate == null) ? 0 : admissionDate.hashCode());
		result = prime * result + ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
		result = prime * result + bedId;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + departmentId;
		result = prime * result + ((dischargeDate == null) ? 0 : dischargeDate.hashCode());
		result = prime * result + doctorId;
		result = prime * result + ((foreName == null) ? 0 : foreName.hashCode());
		result = prime * result + (gender ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + (isOutpatient ? 1231 : 1237);
		result = prime * result + ((nextOfKin == null) ? 0 : nextOfKin.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admissionDate == null) {
			if (other.admissionDate != null)
				return false;
		} else if (!admissionDate.equals(other.admissionDate))
			return false;
		if (appointmentDate == null) {
			if (other.appointmentDate != null)
				return false;
		} else if (!appointmentDate.equals(other.appointmentDate))
			return false;
		if (bedId != other.bedId)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (dischargeDate == null) {
			if (other.dischargeDate != null)
				return false;
		} else if (!dischargeDate.equals(other.dischargeDate))
			return false;
		if (doctorId != other.doctorId)
			return false;
		if (foreName == null) {
			if (other.foreName != null)
				return false;
		} else if (!foreName.equals(other.foreName))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (isOutpatient != other.isOutpatient)
			return false;
		if (nextOfKin == null) {
			if (other.nextOfKin != null)
				return false;
		} else if (!nextOfKin.equals(other.nextOfKin))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}
	
	/**
	 * Constructors.
	 * */
	public Patient() {
		
	}
	
	// Inpatient Constructor
	public Patient(String foreName, String surName, boolean isOutpatient, LocalDate dateOfBirth, boolean gender, String address, String phoneNumber,
			String nextOfKin, int doctorId, int departmentId, LocalDate admissionDate, LocalDate dischargeDate, int bedId) {
		this.foreName = foreName;
		this.surName = surName;
		this.isOutpatient = isOutpatient;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.nextOfKin = nextOfKin;
		this.doctorId = doctorId;
		this.departmentId = departmentId;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
		this.bedId = bedId;
	}
	
	// Outpatient Constructor
	public Patient(String foreName, String surName, boolean isOutpatient, LocalDate dateOfBirth, boolean gender, String address, String phoneNumber,
			String nextOfKin, int doctorId, int departmentId,int bedId, LocalDate appointment) {
		this.foreName = foreName;
		this.surName = surName;
		this.isOutpatient = isOutpatient;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.nextOfKin = nextOfKin;
		this.doctorId = doctorId;
		this.departmentId = departmentId;
		this.bedId = bedId;
		this.appointmentDate = appointment;
	}

	/**
	 * toString()
	 * */
	@Override
	public String toString() {
		return "Patient [id=" + id + ", foreName=" + foreName + ", surName=" + surName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", nextOfKin="
				+ nextOfKin + ", doctorId=" + doctorId + ", departmentId=" + departmentId + ", admissionDate="
				+ admissionDate + ", dischargeDate=" + dischargeDate + ", bedId=" + bedId + ", appointmentDate="
				+ appointmentDate + "]";
	}
}
