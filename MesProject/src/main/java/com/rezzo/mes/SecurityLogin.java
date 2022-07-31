package com.rezzo.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.emp.mapper.EmpMapper;
import com.rezzo.mes.comm.emp.service.EmpVO;

@Service
public class SecurityLogin implements UserDetailsService {
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Autowired
    private EmpMapper mapper;
	

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		EmpVO emp = mapper.getEmp(id);
        
		if (emp == null) {
			throw new UsernameNotFoundException(id);
        }
		
        String pw = emp.getPw();
        String role = emp.getRole();
        
		return User.builder()
				.username(id)
				.password(pw)
				.roles(role)
				.build();

	}
}
