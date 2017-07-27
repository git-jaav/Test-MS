package pe.royalsystems.springerp.MSTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"pe.royalsystems.springerp"})
//@SpringBootApplication(scanBasePackages={"pe.royalsystems.springerp"})
@EntityScan(basePackages={"pe.royalsystems.springerp.model"})
@EnableConfigurationProperties
@EnableScheduling
@EnableCaching
public class MsTestApplication  /*extends SpringBootServletInitializer */{

	public static void main(String[] args) {
		SpringApplication.run(MsTestApplication.class, args);
	}
	
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(MsTestApplication.class);
//    }
//    
}
