package io.github.gtang.order.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 全局配置：当使用@Configuration时，会将配置作用于所有的服务提供方
 * 局部配置：如果指向针对某个服务配置，就不要加@Configuration
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
