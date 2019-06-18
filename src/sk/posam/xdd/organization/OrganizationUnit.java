package sk.posam.xdd.organization;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public class OrganizationUnit {

	// Mandatory
	private String code;
	// Mandatory
	private String name;
	// Mandatory
	private LocalDate validFrom;
	// Mandatory
	private LocalDate validTo;
	// Mandatory
	private Collection<OrganizationUnit> suborganizations;
	// Mandatory
	private OrganizationUnit parent;
	// Mandatory
	private Collection<Employee> employees;
	
	/** Returns TRUE, if the organization unit is valid in the given date. */
	public boolean isOrganizationValid( LocalDate toDate ) {
		// TODO
		return false;
	}


	/** Returns a list of employees assigned to this organization unit. */
	public Collection<Employee> getEmployees() {
		// TODO
		return employees;
	}
	
	/** Adds the employee to this organization unit. */
	public void addEmployee( Employee employee ) {
		// TODO
	}
	
	/** Terminates the organization. */
	public void terminatesTo( LocalDate date ) {
		// TODO
	}
	
	/** 
	 * Moves this organization unit under a new parent.
	 * Input parameter is optional. If it is not provided, this organization unit becomes a root.
	 * There can be more roots in the hierarchy.
	 */
	public void move( OrganizationUnit newParent ) {
		// TODO
	}

}
