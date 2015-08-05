package com.hcl.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Chandra Sekhar
 * 
 */
@Entity
@Table(name = "wss_new_connection_tb")
public class NewConnectionEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ncon_web_transcation_id", unique = true, nullable = false)
	private Long webTxtId;// numeric(11,0) NOT NULL,

	@Column(name = "ncon_application_number")
	private Long applicationNo;// numeric(18,0)

	@Column(name = "ncon_application_status")
	private boolean applicanteStatus;

	@Column(name = "ncon_applicant_first_name")
	private String firstName;// character varying(80) NOT NULL,

	@Column(name = "ncon_applicant_middle_name")
	private String middleName;// character varying(80)

	@Column(name = "ncon_applicant_last_name")
	private String lastName;// character varying(80)

	@Column(name = "ncon_tan_no")
	private String tanNo;

	@Column(name = "ncon_requested_load")
	private Double requestedLoad;// numeric(4,2),

	@Column(name = "ncon_category")
	private String consumerCategory;// character varying(12),

	@Column(name = "ncon_supply_type")
	private Integer supplyType;// smallint,

	@Column(name = "ncon_reference_consumer_number")
	private Long existingOrNearestConsumerNo;// numeric(13,0),

	@Column(name = "ncon_existing_consumer_number")
	private Long consumerNoIfExisting;// numeric(13,0)

	@Column(name = "ncon_electric_post_number")
	private String nearestElectricPostNo;// character varying(40),

	@Column(name = "ncon_remit_cd_now")
	private boolean remitCDAmount;// boolean,

	@Column(name = "ncon_election_section")
	private String electionSectionName;// character varying(40),

	@Column(name = "ncon_distance_post_to_meterbox")
	private Double distanceFromMeterBox;// numeric(5,2),

	@Column(name = "ncon_purpose")
	private String purposeOfConnection;// character varying(40),

	@Column(name = "ncon_industry_name")
	private String comName;

	@Column(name = "ncon_registration_no")
	private String companyRegNo;

	@Column(name = "ncon_entitlement_type")
	private String entitlementType;

	@Column(name = "ncon_claim_turn_priority")
	private boolean turnPriority;// boolean,

	@Column(name = "ncon_claim_document")
	private String turnPrioritySpecify;// character varying(40),

	@Column(name = "ncon_occupant_type")
	private String statusOfapplicant;// character varying(10),

	@Column(name = "ncon_owner_consent")
	private boolean consentOfOwner;// boolean,

	@Column(name = "ncon_property_cross")
	private boolean whetherLandPropOfOtherPersonCrossed;// boolean,

	@Column(name = "ncon_number_cross")
	private Integer noOfPropToBecrossed;// smallint,

	@Column(name = "ncon_number_consent")
	private Integer noOfConsentObtained;// smallint,

	@Column(name = "ncon_quantity_per_month")
	private String qtyPerMnth;

	@Column(name = "ncon_working_hrs_per_day")
	private String workHourPerDay;

	@Column(name = "ncon_furnace_type")
	private String furnaceType;

	@Column(name = "ncon_manufacture_cost_per_month")
	private String mnfactureCostPerMnth;

	@Column(name = "ncon_exis_conn_contract_demand")
	private Integer exConnContactDemand;

	@Column(name = "ncon_exis_conn_connected_load")
	private Double exConnConnectLoad;

	@Column(name = "ncon_exis_conn_supply_voltage")
	private Integer exConnSupplyVoltage;

	@Column(name = "ncon_sub_meter_flag")
	private boolean subMeterFlag;

	@Column(name = "ncon_engine_make")
	private String engineMake;

	@Column(name = "ncon_engine_sl_no")
	private String engineSerialNo;

	@Column(name = "ncon_engine_rpm")
	private String engineRMP;

	@Column(name = "ncon_engine_fuel")
	private String engineFuel;

	@Column(name = "ncon_generator_make")
	private String generatorMake;

	@Column(name = "ncon_generator_si_no")
	private String generatorSerialNo;

	@Column(name = "ncon_generator_voltage")
	private String generatorVoltage;

	@Column(name = "ncon_generator_kva")
	private String generatorKVA;

	@Column(name = "ncon_generator_phase")
	private String generatorPhase;

	@Column(name = "ncon_generator_rpm")
	private String generatorRPM;

	@Column(name = "ncon_generator_amps")
	private String generatorAMPS;

	@Column(name = "ncon_generator_freq")
	private String frqncy;

	@Column(name = "ncon_created_at")
	private Date cratedAt;// timestamp without time zone NOT NULL DEFAULT
							// now(),

	@Column(name = "ncon_created_by")
	private String createdBy;// character varying(10) NOT NULL DEFAULT
								// 'WSS'::character varying,

	@Column(name = "ncon_updated_at")
	private Date updatedAt;// timestamp without time zone,

	@Column(name = "ncon_updated_by")
	private String UpdatedBy;// character varying(30),
	// CONSTRAINT wss_new_connection_tb_pk PRIMARY KEY (ncon_application_number)

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "newConnectionEntity", orphanRemoval = true)
	private List<DocumentsEntity> documentsEntities;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "newConnectionEntity", orphanRemoval = true)
	private List<AddressPremisesEntity> addressPremisesEntities;

	public Long getWebTxtId() {
		return webTxtId;
	}

	public void setWebTxtId(Long webTxtId) {
		this.webTxtId = webTxtId;
	}

	public Long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(Long applicationNo) {
		this.applicationNo = applicationNo;
	}

	public boolean getApplicanteStatus() {
		return applicanteStatus;
	}

	public void setApplicanteStatus(boolean applicanteStatus) {
		this.applicanteStatus = applicanteStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTanNo() {
		return tanNo;
	}

	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}

	public Double getRequestedLoad() {
		return requestedLoad;
	}

	public void setRequestedLoad(Double requestedLoad) {
		this.requestedLoad = requestedLoad;
	}

	public String getConsumerCategory() {
		return consumerCategory;
	}

	public void setConsumerCategory(String consumerCategory) {
		this.consumerCategory = consumerCategory;
	}

	public Integer getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(Integer supplyType) {
		this.supplyType = supplyType;
	}

	public Long getExistingOrNearestConsumerNo() {
		return existingOrNearestConsumerNo;
	}

	public void setExistingOrNearestConsumerNo(Long existingOrNearestConsumerNo) {
		this.existingOrNearestConsumerNo = existingOrNearestConsumerNo;
	}

	public Long getConsumerNoIfExisting() {
		return consumerNoIfExisting;
	}

	public void setConsumerNoIfExisting(Long consumerNoIfExisting) {
		this.consumerNoIfExisting = consumerNoIfExisting;
	}

	public String getNearestElectricPostNo() {
		return nearestElectricPostNo;
	}

	public void setNearestElectricPostNo(String nearestElectricPostNo) {
		this.nearestElectricPostNo = nearestElectricPostNo;
	}

	public boolean getRemitCDAmount() {
		return remitCDAmount;
	}

	public void setRemitCDAmount(boolean remitCDAmount) {
		this.remitCDAmount = remitCDAmount;
	}

	public String getElectionSectionName() {
		return electionSectionName;
	}

	public void setElectionSectionName(String electionSectionName) {
		this.electionSectionName = electionSectionName;
	}

	public Double getDistanceFromMeterBox() {
		return distanceFromMeterBox;
	}

	public void setDistanceFromMeterBox(Double distanceFromMeterBox) {
		this.distanceFromMeterBox = distanceFromMeterBox;
	}

	public String getPurposeOfConnection() {
		return purposeOfConnection;
	}

	public void setPurposeOfConnection(String purposeOfConnection) {
		this.purposeOfConnection = purposeOfConnection;
	}

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getEntitlementType() {
		return entitlementType;
	}

	public void setEntitlementType(String entitlementType) {
		this.entitlementType = entitlementType;
	}

	public boolean getTurnPriority() {
		return turnPriority;
	}

	public void setTurnPriority(boolean turnPriority) {
		this.turnPriority = turnPriority;
	}

	public String getTurnPrioritySpecify() {
		return turnPrioritySpecify;
	}

	public void setTurnPrioritySpecify(String turnPrioritySpecify) {
		this.turnPrioritySpecify = turnPrioritySpecify;
	}

	public String getStatusOfapplicant() {
		return statusOfapplicant;
	}

	public void setStatusOfapplicant(String statusOfapplicant) {
		this.statusOfapplicant = statusOfapplicant;
	}

	public boolean getConsentOfOwner() {
		return consentOfOwner;
	}

	public void setConsentOfOwner(boolean consentOfOwner) {
		this.consentOfOwner = consentOfOwner;
	}

	public boolean getWhetherLandPropOfOtherPersonCrossed() {
		return whetherLandPropOfOtherPersonCrossed;
	}

	public void setWhetherLandPropOfOtherPersonCrossed(boolean whetherLandPropOfOtherPersonCrossed) {
		this.whetherLandPropOfOtherPersonCrossed = whetherLandPropOfOtherPersonCrossed;
	}

	public Integer getNoOfPropToBecrossed() {
		return noOfPropToBecrossed;
	}

	public void setNoOfPropToBecrossed(Integer noOfPropToBecrossed) {
		this.noOfPropToBecrossed = noOfPropToBecrossed;
	}

	public Integer getNoOfConsentObtained() {
		return noOfConsentObtained;
	}

	public void setNoOfConsentObtained(Integer noOfConsentObtained) {
		this.noOfConsentObtained = noOfConsentObtained;
	}

	public String getQtyPerMnth() {
		return qtyPerMnth;
	}

	public void setQtyPerMnth(String qtyPerMnth) {
		this.qtyPerMnth = qtyPerMnth;
	}

	public String getWorkHourPerDay() {
		return workHourPerDay;
	}

	public void setWorkHourPerDay(String workHourPerDay) {
		this.workHourPerDay = workHourPerDay;
	}

	public String getFurnaceType() {
		return furnaceType;
	}

	public void setFurnaceType(String furnaceType) {
		this.furnaceType = furnaceType;
	}

	public String getMnfactureCostPerMnth() {
		return mnfactureCostPerMnth;
	}

	public void setMnfactureCostPerMnth(String mnfactureCostPerMnth) {
		this.mnfactureCostPerMnth = mnfactureCostPerMnth;
	}

	public Integer getExConnContactDemand() {
		return exConnContactDemand;
	}

	public void setExConnContactDemand(Integer exConnContactDemand) {
		this.exConnContactDemand = exConnContactDemand;
	}

	public Double getExConnConnectLoad() {
		return exConnConnectLoad;
	}

	public void setExConnConnectLoad(Double exConnConnectLoad) {
		this.exConnConnectLoad = exConnConnectLoad;
	}

	public Integer getExConnSupplyVoltage() {
		return exConnSupplyVoltage;
	}

	public void setExConnSupplyVoltage(Integer exConnSupplyVoltage) {
		this.exConnSupplyVoltage = exConnSupplyVoltage;
	}

	public boolean getSubMeterFlag() {
		return subMeterFlag;
	}

	public void setSubMeterFlag(boolean subMeterFlag) {
		this.subMeterFlag = subMeterFlag;
	}

	public String getEngineMake() {
		return engineMake;
	}

	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}

	public String getEngineSerialNo() {
		return engineSerialNo;
	}

	public void setEngineSerialNo(String engineSerialNo) {
		this.engineSerialNo = engineSerialNo;
	}

	public String getEngineRMP() {
		return engineRMP;
	}

	public void setEngineRMP(String engineRMP) {
		this.engineRMP = engineRMP;
	}

	public String getEngineFuel() {
		return engineFuel;
	}

	public void setEngineFuel(String engineFuel) {
		this.engineFuel = engineFuel;
	}

	public String getGeneratorMake() {
		return generatorMake;
	}

	public void setGeneratorMake(String generatorMake) {
		this.generatorMake = generatorMake;
	}

	public String getGeneratorSerialNo() {
		return generatorSerialNo;
	}

	public void setGeneratorSerialNo(String generatorSerialNo) {
		this.generatorSerialNo = generatorSerialNo;
	}

	public String getGeneratorVoltage() {
		return generatorVoltage;
	}

	public void setGeneratorVoltage(String generatorVoltage) {
		this.generatorVoltage = generatorVoltage;
	}

	public String getGeneratorKVA() {
		return generatorKVA;
	}

	public void setGeneratorKVA(String generatorKVA) {
		this.generatorKVA = generatorKVA;
	}

	public String getGeneratorPhase() {
		return generatorPhase;
	}

	public void setGeneratorPhase(String generatorPhase) {
		this.generatorPhase = generatorPhase;
	}

	public String getGeneratorRPM() {
		return generatorRPM;
	}

	public void setGeneratorRPM(String generatorRPM) {
		this.generatorRPM = generatorRPM;
	}

	public String getGeneratorAMPS() {
		return generatorAMPS;
	}

	public void setGeneratorAMPS(String generatorAMPS) {
		this.generatorAMPS = generatorAMPS;
	}

	public String getFrqncy() {
		return frqncy;
	}

	public void setFrqncy(String frqncy) {
		this.frqncy = frqncy;
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

	public List<DocumentsEntity> getDocumentsEntities() {
		return documentsEntities;
	}

	public void setDocumentsEntities(List<DocumentsEntity> documentsEntities) {
		this.documentsEntities = documentsEntities;
	}

	public List<AddressPremisesEntity> getAddressPremisesEntities() {
		return addressPremisesEntities;
	}

	public void setAddressPremisesEntities(List<AddressPremisesEntity> addressPremisesEntities) {
		this.addressPremisesEntities = addressPremisesEntities;
	}

}
