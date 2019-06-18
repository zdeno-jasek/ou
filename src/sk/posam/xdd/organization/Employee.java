package sk.posam.xdd.organization;

import java.time.LocalDate;

public class Employee {

	// Mandatory
	private String givenName;
	// Mandatory
	private String familyName;
	// Mandatory
	private LocalDate birthDate;
	// Optional
	private String addressStreet;
	// Optional
	private String addressZipCode;
	// Optional
	private String addressCity;
	
	// Mandatory
	private String workingPosition;
	
	// Mandatory
	private OrganizationUnit organizationUnit;
	// Mandatory
	private LocalDate assignedToOrgUnitFrom;
	// Mandatory
	private LocalDate assignedToOrgUnitTo;
	
	// TODO
	/** Returns an age of the employee to the given date. */
	public int getAge( LocalDate date ) {
		return 0;
	}
	
	/**
	 * Moves this employee to a new organization unit from the given date.
	 * Working position is optional. If not provided, original working position is used.
	 * If the working position is provided, it has to be changed.
	 */
	public void move( OrganizationUnit newOrganizationUnit, LocalDate fromDate, String workingPosition ) {
		// TODO
	}
}
