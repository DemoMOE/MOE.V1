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
@Table(name = "wss_ncon_address_tb")
public class AddressPremisesEntity implements Serializable {

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
	@JoinColumn(name = "ncna_ncon_web_transcation_id")
	private NewConnectionEntity newConnectionEntity;// numeric(18,0),

	@Column(name = "ncna_address_type")
	private String addressType;// character varying(20),

	@Column(name = "ncna_address_line1")
	private String addrLine_1A;// character varying(50) NOT NULL,

	@Column(name = "ncna_address_line2")
	private String addrLine_1B;// character varying(50),

	@Column(name = "ncna_city")
	private String city_1;// character varying(20),

	@Column(name = "ncna_pin")
	private Integer pincode_1;// numeric(6,0),

	@Column(name = "ncna_phone_number")
	private Long phoneNo_1;// numeric(11,0),

	@Column(name = "ncna_mobile_number")
	private Long mobileNo_1;// numeric(10,0) NOT NULL,

	@Column(name = "ncna_email_id")
	private String email_1;// character varying(30) NOT NULL,

	@Column(name = "ncna_fax_num")
	private Long faxNo2;

	@Column(name = "ncna_block_number")
	private String blockNo_1;// character varying(8),

	@Column(name = "ncna_local_body")
	private String localBody_1;// character varying(30),

	@Column(name = "ncna_same_address")
	private boolean isSameAddress;// boolean,

	@Column(name = "ncna_created_at")
	private Date cratedAt;// timestamp without time zone NOT NULL DEFAULT
							// now(),

	@Column(name = "ncna_created_by")
	private String createdBy;// character varying(10) NOT NULL DEFAULT
								// 'WSS'::character varying,

	@Column(name = "ncna_updated_at")
	private Date updatedAt;// timestamp without time zone,

	@Column(name = "ncna_updated_by")
	private String UpdatedBy;// character varying(30),

	public NewConnectionEntity getNewConnectionEntity() {
		return newConnectionEntity;
	}

	public void setNewConnectionEntity(NewConnectionEntity newConnectionEntity) {
		this.newConnectionEntity = newConnectionEntity;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddrLine_1A() {
		return addrLine_1A;
	}

	public void setAddrLine_1A(String addrLine_1A) {
		this.addrLine_1A = addrLine_1A;
	}

	public String getAddrLine_1B() {
		return addrLine_1B;
	}

	public void setAddrLine_1B(String addrLine_1B) {
		this.addrLine_1B = addrLine_1B;
	}

	public String getCity_1() {
		return city_1;
	}

	public void setCity_1(String city_1) {
		this.city_1 = city_1;
	}

	public Integer getPincode_1() {
		return pincode_1;
	}

	public void setPincode_1(Integer pincode_1) {
		this.pincode_1 = pincode_1;
	}

	public Long getPhoneNo_1() {
		return phoneNo_1;
	}

	public void setPhoneNo_1(Long phoneNo_1) {
		this.phoneNo_1 = phoneNo_1;
	}

	public Long getMobileNo_1() {
		return mobileNo_1;
	}

	public void setMobileNo_1(Long mobileNo_1) {
		this.mobileNo_1 = mobileNo_1;
	}

	public String getEmail_1() {
		return email_1;
	}

	public void setEmail_1(String email_1) {
		this.email_1 = email_1;
	}

	public Long getFaxNo2() {
		return faxNo2;
	}

	public void setFaxNo2(Long faxNo2) {
		this.faxNo2 = faxNo2;
	}

	public String getBlockNo_1() {
		return blockNo_1;
	}

	public void setBlockNo_1(String blockNo_1) {
		this.blockNo_1 = blockNo_1;
	}

	public String getLocalBody_1() {
		return localBody_1;
	}

	public void setLocalBody_1(String localBody_1) {
		this.localBody_1 = localBody_1;
	}

	public boolean isSameAddress() {
		return isSameAddress;
	}

	public void setSameAddress(boolean isSameAddress) {
		this.isSameAddress = isSameAddress;
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

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}

}
