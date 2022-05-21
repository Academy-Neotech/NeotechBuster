package srl.neotech.configuration;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages = "srl.neotech")
@EntityScan("srl.neotech.entity")
@EnableJpaRepositories("srl.neotech.repository")
public class SpringBootTomcatApplication extends SpringBootServletInitializer{

public static void main(String[] args) {



SpringApplication.run(SpringBootTomcatApplication.class, args);

}



@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {


return builder.sources(SpringBootTomcatApplication.class);
}
}
