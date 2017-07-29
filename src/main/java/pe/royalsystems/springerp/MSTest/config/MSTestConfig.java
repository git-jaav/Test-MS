package pe.royalsystems.springerp.MSTest.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
public class MSTestConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.dataSource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
    
//    @Bean
//    //@ConfigurationProperties(prefix="spring.jpa.hibernate.current_session_context_class")
//    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
//        return hemf.getSessionFactory();
//    }

    
    
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
    

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

//    @Bean(name = "org.dozer.Mapper")
//    public DozerBeanMapper dozerBean() {
//        return new DozerBeanMapper();
//    }

}
