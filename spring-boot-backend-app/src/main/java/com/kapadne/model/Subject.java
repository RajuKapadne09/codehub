package com.kapadne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subject_name")
    private String subjectName;

    /**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the lsubjectType
	 */
	public String getLsubjectType() {
		return lsubjectType;
	}

	/**
	 * @param lsubjectType the lsubjectType to set
	 */
	public void setLsubjectType(String lsubjectType) {
		this.lsubjectType = lsubjectType;
	}

	@Column(name = "subject_type")
    private String lsubjectType;
    
    
    
    
}
