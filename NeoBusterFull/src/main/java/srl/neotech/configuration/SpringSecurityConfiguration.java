package srl.neotech.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
    DataSource dataSource;
	

	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}
	
	
        @Override
    	protected void configure(HttpSecurity http) throws Exception {
    		http  
    		.csrf().disable()
    		.authorizeRequests()
    		.antMatchers("/**").permitAll();
    		/*.antMatchers("/homepage*").hasAnyRole("MANAGER", "CUSTOMER")
    		.antMatchers("/customer/**").hasAnyRole("CUSTOMER")
			.antMatchers("/manager/**").hasAnyRole("MANAGER")
			.anyRequest().authenticated()
    		.and()
    	      .formLogin()
    	      .loginPage("/login").permitAll()
    	      .and()
    	      .logout().permitAll();*/
 
    	}
}
