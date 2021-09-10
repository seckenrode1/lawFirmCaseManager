package org.sarahEckenrode.caseManager.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Size(min=2, max=25, message="Username must be between 2 and 25 characters.")
	@NotNull
	private String username;
	@Size(min=4, max=100, message="Username must be between 4 and 100 characters.")
	private String password;
	private String staffFirstName;
	private String staffLastName;
	private String staffEmail;
	private String userRole;

	public User() {
		this.userRole = "ROLE_USER";
	}
	

	public User(
			@Size(min = 2, max = 25, message = "Username must be between 2 and 25 characters.") @NotNull String username,
			@Size(min = 4, max = 100, message = "Username must be between 4 and 100 characters.") String password,
			String staffFirstName, String staffLastName, String staffEmail) {
		super();
		this.username = username;
		this.password = password;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffEmail = staffEmail;

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((staffEmail == null) ? 0 : staffEmail.hashCode());
		result = prime * result + ((staffFirstName == null) ? 0 : staffFirstName.hashCode());
		result = prime * result + ((staffLastName == null) ? 0 : staffLastName.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (staffEmail == null) {
			if (other.staffEmail != null)
				return false;
		} else if (!staffEmail.equals(other.staffEmail))
			return false;
		if (staffFirstName == null) {
			if (other.staffFirstName != null)
				return false;
		} else if (!staffFirstName.equals(other.staffFirstName))
			return false;
		if (staffLastName == null) {
			if (other.staffLastName != null)
				return false;
		} else if (!staffLastName.equals(other.staffLastName))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}



}