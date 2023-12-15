//package ser.game.config;
//
//import lombok.AllArgsConstructor;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Description;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.spring6.dialect.SpringStandardDialect;
//import org.thymeleaf.spring6.view.ThymeleafViewResolver;
//
//
//@Configuration
//@AllArgsConstructor
//public class WebConfig {
//
//    @Bean
//    public ServletContextTemplateResolver templateResolver() {
//        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".html");
//        resolver.setTemplateMode("HTML5");
//        resolver.setOrder(1);
//        return resolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver());
//        engine.addDialect(new LayoutDialect());
//        engine.addDialect(new SpringSecurityDialect());
//        engine.addDialect(new SpringStandardDialect());
//        return engine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver thymeleafViewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        return resolver;
//    }
//}
