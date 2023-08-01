package com.chris.security.modal;

import java.io.Serializable;

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
public class ParentAccess implements Serializable {

	private static final long serialVersionUID = 342852428473675334L;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "parent_id")
	private String parentId;

	@Column(name = "child_id")
	private String childId;

	@Column(name = "resource")
	private String resource;

	public String getChildId() {
		return childId;
	}

	public Long getId() {
		return id;
	}

	public String getParentId() {
		return parentId;
	}

	public String getResource() {
		return resource;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

}
