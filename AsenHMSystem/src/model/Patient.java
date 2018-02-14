package model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



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
	private LocalDate admissionDate;
	@Column
	private LocalDate dischargeDate;
	@Column
	private LocalDate appointmentDate;
	@OneToOne
	@JoinColumn(name = "bedId", foreignKey = @ForeignKey(name = "bedId_FK"))
	private Bed bed;
	@ManyToOne
	@JoinColumn(name = "deptId", foreignKey = @ForeignKey(name = "deptId_FK"))
	private Department department;
	@ManyToOne
	@JoinColumn(name = "doctorId", foreignKey = @ForeignKey(name = "doctorId_FK"))	
	private Doctor doctor;
	public Patient(int id, boolean isOutpatient, String foreName, String surName, LocalDate dateOfBirth, boolean gender,
			String address, String phoneNumber, String nextOfKin, LocalDate admissionDate, LocalDate dischargeDate,
			LocalDate appointmentDate, Bed bed, Department department, Doctor doctor) {
		super();
		this.id = id;
		this.isOutpatient = isOutpatient;
		this.foreName = foreName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.nextOfKin = nextOfKin;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
		this.appointmentDate = appointmentDate;
		this.bed = bed;
		this.department = department;
		this.doctor = doctor;
	}
	public Patient(boolean isOutpatient, String foreName, String surName, LocalDate dateOfBirth, boolean gender,
			String address, String phoneNumber, String nextOfKin, LocalDate admissionDate, LocalDate dischargeDate,
			LocalDate appointmentDate, Bed bed, Department department, Doctor doctor) {
		super();
		this.isOutpatient = isOutpatient;
		this.foreName = foreName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.nextOfKin = nextOfKin;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
		this.appointmentDate = appointmentDate;
		this.bed = bed;
		this.department = department;
		this.doctor = doctor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isOutpatient() {
		return isOutpatient;
	}
	public void setOutpatient(boolean isOutpatient) {
		this.isOutpatient = isOutpatient;
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
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
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Bed getBed() {
		return bed;
	}
	public void setBed(Bed bed) {
		this.bed = bed;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admissionDate == null) ? 0 : admissionDate.hashCode());
		result = prime * result + ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
		result = prime * result + ((bed == null) ? 0 : bed.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((dischargeDate == null) ? 0 : dischargeDate.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
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
		if (bed == null) {
			if (other.bed != null)
				return false;
		} else if (!bed.equals(other.bed))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dischargeDate == null) {
			if (other.dischargeDate != null)
				return false;
		} else if (!dischargeDate.equals(other.dischargeDate))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
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
	@Override
	public String toString() {
		return "Patient [id=" + id + ", isOutpatient=" + isOutpatient + ", foreName=" + foreName + ", surName="
				+ surName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", nextOfKin=" + nextOfKin + ", admissionDate=" + admissionDate
				+ ", dischargeDate=" + dischargeDate + ", appointmentDate=" + appointmentDate + ", bed=" + bed
				+ ", department=" + department + ", doctor=" + doctor + "]";
	}
	
	
}

