package org.example.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfig {
    @Bean
    public MyCustomViewResolver myCustomViewResolver(){
        MyCustomViewResolver resolver = new MyCustomViewResolver();
        resolver.setOrder(0);//우선순위를 가장낮게 설정함으로써 가장 먼저 실행함
        return resolver;
    }
}
