package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prescription {
	@Id @GeneratedValue
	private int id;
	@Column
	private int patientId;
	@Column
	private Date date;
	@Column
	private String notes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + patientId;
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
		Prescription other = (Prescription) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (patientId != other.patientId)
			return false;
		return true;
	}
	
	public Prescription() {
		
	}
	
	public Prescription(int id, int patientId, Date date, String notes) {
		this.id = id;
		this.patientId = patientId;
		this.date = date;
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientId=" + patientId + ", date=" + date + ", notes=" + notes + "]";
	}
}
