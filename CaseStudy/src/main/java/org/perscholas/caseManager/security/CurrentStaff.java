package org.perscholas.caseManager.security;

import java.util.Collection;
import java.util.Collections;

import org.perscholas.caseManager.models.Staff;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CurrentStaff implements UserDetails {

	private static final long serialVersionUID = 1L;
	private Staff staff;
	
	public CurrentStaff(Staff staff) {
		super();
		this.staff = staff;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("STAFF"));
	}

	@Override
	public String getPassword() {
		return "{noop}" + staff.getStaffPassword();
	}

	@Override
	public String getUsername() {
		return "{noop}" + staff.getStaffEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
