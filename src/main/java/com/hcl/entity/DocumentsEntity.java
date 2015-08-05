package com.hcl.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Chandra Sekhar
 * 
 */
@Entity
@Table(name = "wss_ncon_document_tb")
public class DocumentsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	/*
	 * @ManyToOne represents the many-to-one association from
	 * NewConnectionEntity to AddressPremisesEntity
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	/*
	 * @JoinColumn represents that the primary key in the NewConnectionEntity
	 * table is the foreign key column in the AddressPremisesEntity table.
	 */
	@JoinColumn(name = "ncnd_ncon_web_transcation_id")
	private NewConnectionEntity newConnectionEntity;// numeric(18,0),

	@Column(name = "ncnd_document_type")
	private String docType;// character varying(30),

	@Column(name = "ncnd_document_name")
	private String docName;

	@Column(name = "ncnd_document_path")
	private String docPath;// character varying(50),

	@Column(name = "ncnd_created_at")
	private Date cratedAt;// timestamp without time zone NOT NULL DEFAULT
							// now(),

	@Column(name = "ncnd_created_by")
	private String createdBy;// character varying(10) NOT NULL DEFAULT
								// 'WSS'::character varying,

	public NewConnectionEntity getNewConnectionEntity() {
		return newConnectionEntity;
	}

	public void setNewConnectionEntity(NewConnectionEntity newConnectionEntity) {
		this.newConnectionEntity = newConnectionEntity;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	public Date getCratedAt() {
		return cratedAt;
	}

	public void setCratedAt(Date cratedAt) {
		this.cratedAt = cratedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int hashCode() {
		return super.hashCode();
	}

}
