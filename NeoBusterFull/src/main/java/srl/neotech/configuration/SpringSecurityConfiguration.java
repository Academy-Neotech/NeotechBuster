package srl.neotech.configuration;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{ 
	

	@Autowired
    DataSource dataSource;

	private static final String usersQuery = "select username, password, 1 FROM users where username = ? and enabled=1";
	private static final String rolesQuery = "select a.username, a.authority FROM authorities a where a.username = ?";
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	web.ignoring().antMatchers("/resources/**");
	}
	

	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().usersByUsernameQuery(usersQuery).dataSource(dataSource).authoritiesByUsernameQuery(rolesQuery).passwordEncoder(passwordEncoder());
	}

	
	/*
	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		  auth.inMemoryAuthentication()
          .withUser("customer").password("{noop}customer").roles("CUSTOMER");
	}
	
	   @Bean
   	@Override
   	public UserDetailsService userDetailsService() {
   		UserDetails user =
   			 User.withDefaultPasswordEncoder()
   				.username("customer")
   				.password("customer")
   				.roles("CUSTOMER")
   				.build();

   		return new InMemoryUserDetailsManager(user);
   	}
	*/
        @Override
    	protected void configure(HttpSecurity http) throws Exception {
    		http  
   		    .csrf().disable();
//    		.authorizeRequests()
//    		.antMatchers("/static/**").permitAll()
//    		.antMatchers("/login").permitAll()
//    		.antMatchers("/api/**").permitAll()
//    		.antMatchers("/blank").permitAll()
//    		.antMatchers("/customer/**").hasAnyRole("CUSTOMER")
//			.antMatchers("/manager/**").hasAnyRole("MANAGER")
//			.anyRequest().authenticated()
//			.and()
//			.httpBasic()
//			.and()
//			.formLogin()
//		    .loginPage("/login")
//		    .defaultSuccessUrl("/perform_login");
    	}
        
  
        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth)
          throws Exception {
            auth.jdbcAuthentication()
              .dataSource(dataSource);
        }
}


