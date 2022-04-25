package com.libreria;

import com.libreria.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration //antes que se levante el servidor, Spring lee esta clase para ver que config tiene la pagina
@EnableWebSecurity //habilita la seguridad
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {   

	@Autowired
	public ClienteService clienteService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(clienteService). //la pasamos la instancia para que opere
		passwordEncoder(new BCryptPasswordEncoder()); //el BCrypt tiene que hacer match con el que definimos en el service
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()

				.antMatchers("/css/*", "/js/*", "/img/*", "/**","/main/**","/usuario/**","/actividad/**","/login/**", "/glosario/**").permitAll()
				.and().formLogin()
					.loginPage("/login") //url donde se va a mostrar el login
						.loginProcessingUrl("/logincheck") //url de un post que hace spring, se pone el form del login
						.usernameParameter("email") //el name del input tiene que hacer match con esto
						.passwordParameter("password") //idem anterior
						.defaultSuccessUrl("/") //si sale todo bien vamos a /
						.failureUrl("/login?error=error") //si sale todo mal 
						.permitAll()
				.and().logout()
					.logoutUrl("/logout") //para desloguearse
					.logoutSuccessUrl("/login?logout=logout")
					.permitAll()
				.and().csrf()
					.disable();
	}
	

}