package com.example.signup_signin_functionality.employees.management.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class EmployeesEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotNull @Size(min = 2, max = 50)
    private String name;

    @Email 
    private String email;

    @NotNull
    private Boolean isActive;

    @Positive
    private Integer age;

    @Size(max = 15)
    private String phoneNumber;

    @NotNull @Past
    private Date dateOfBirth;

    // Employment and Salary Information
    @Positive
    private Double salary;

    private String department;

    private String jobTitle;

    // Address Information
    private String address;

    private String city;

    private String state;

    private String country;

    @Pattern(regexp = "\\d{5}", message = "Postal Code must be 5 digits")
    private String postalCode;

    // Employment Details
    private String employmentType;

    private Date joinDate;

    private Date contractEndDate;

    // Performance & Review
    private Integer rating;

    private String feedback;

    private BigDecimal bonus;

    // Bank Information
    @Size(max = 20)
    private String bankAccountNumber;

    @Pattern(regexp = "^[A-Z]{4}0[A-Z0-9]{6}$", message = "Invalid IFSC code")
    private String bankIFSC;

    // Financial and Tax Information
    private BigDecimal annualSalary;

    private Double taxPercentage;

    @NotNull
    private Boolean isRemote;

    private LocalDateTime lastPromotionDate;

    private Integer paidLeaveBalance;

    private Integer sickLeaveBalance;

    private Integer earnedLeaveBalance;

    // Emergency Contact Information
    @Size(max = 15)
    private String emergencyContactName;

    private String emergencyContactRelationship;

    @Size(max = 15)
    private String emergencyContactPhone;

    // System Metadata
    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;

    private String createdBy;

    private String modifiedBy;

    // Insurance Details
    private String insuranceProvider;

    private String insurancePolicyNumber;

    private Date insuranceValidTill;

    private BigDecimal insuranceCoverageAmount;

    // Employment Benefits
    private Boolean isEligibleForGratuity;

    private BigDecimal gratuityAmount;

    private Integer retirementAge;

    // Additional Information
    private String supervisorName;

    private String workLocation;

    private String bloodGroup;

    private String maritalStatus;

    private String spouseName;

    private Integer numberOfDependents;

    private Double shiftAllowance;

    private List<String> languagesKnown;

    private String previousEmployer;

    private String socialSecurityNumber;

    private Date resignationDate;

    private Boolean isOnProbation;

    private LocalDateTime probationEndDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public BigDecimal getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(BigDecimal annualSalary) {
		this.annualSalary = annualSalary;
	}

	public Double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Boolean getIsRemote() {
		return isRemote;
	}

	public void setIsRemote(Boolean isRemote) {
		this.isRemote = isRemote;
	}

	public LocalDateTime getLastPromotionDate() {
		return lastPromotionDate;
	}

	public void setLastPromotionDate(LocalDateTime lastPromotionDate) {
		this.lastPromotionDate = lastPromotionDate;
	}

	public Integer getPaidLeaveBalance() {
		return paidLeaveBalance;
	}

	public void setPaidLeaveBalance(Integer paidLeaveBalance) {
		this.paidLeaveBalance = paidLeaveBalance;
	}

	public Integer getSickLeaveBalance() {
		return sickLeaveBalance;
	}

	public void setSickLeaveBalance(Integer sickLeaveBalance) {
		this.sickLeaveBalance = sickLeaveBalance;
	}

	public Integer getEarnedLeaveBalance() {
		return earnedLeaveBalance;
	}

	public void setEarnedLeaveBalance(Integer earnedLeaveBalance) {
		this.earnedLeaveBalance = earnedLeaveBalance;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactRelationship() {
		return emergencyContactRelationship;
	}

	public void setEmergencyContactRelationship(String emergencyContactRelationship) {
		this.emergencyContactRelationship = emergencyContactRelationship;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}

	public void setInsurancePolicyNumber(String insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}

	public Date getInsuranceValidTill() {
		return insuranceValidTill;
	}

	public void setInsuranceValidTill(Date insuranceValidTill) {
		this.insuranceValidTill = insuranceValidTill;
	}

	public BigDecimal getInsuranceCoverageAmount() {
		return insuranceCoverageAmount;
	}

	public void setInsuranceCoverageAmount(BigDecimal insuranceCoverageAmount) {
		this.insuranceCoverageAmount = insuranceCoverageAmount;
	}

	public Boolean getIsEligibleForGratuity() {
		return isEligibleForGratuity;
	}

	public void setIsEligibleForGratuity(Boolean isEligibleForGratuity) {
		this.isEligibleForGratuity = isEligibleForGratuity;
	}

	public BigDecimal getGratuityAmount() {
		return gratuityAmount;
	}

	public void setGratuityAmount(BigDecimal gratuityAmount) {
		this.gratuityAmount = gratuityAmount;
	}

	public Integer getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(Integer retirementAge) {
		this.retirementAge = retirementAge;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public Integer getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(Integer numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public Double getShiftAllowance() {
		return shiftAllowance;
	}

	public void setShiftAllowance(Double shiftAllowance) {
		this.shiftAllowance = shiftAllowance;
	}

	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public String getPreviousEmployer() {
		return previousEmployer;
	}

	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public Boolean getIsOnProbation() {
		return isOnProbation;
	}

	public void setIsOnProbation(Boolean isOnProbation) {
		this.isOnProbation = isOnProbation;
	}

	public LocalDateTime getProbationEndDate() {
		return probationEndDate;
	}

	public void setProbationEndDate(LocalDateTime probationEndDate) {
		this.probationEndDate = probationEndDate;
	}

	public EmployeesEntity() {
		super();
		
	}

	
}
