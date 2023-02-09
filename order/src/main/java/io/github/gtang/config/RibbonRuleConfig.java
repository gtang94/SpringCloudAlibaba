package io.github.gtang.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 配置负载均衡策略方式1
 * RibbonRuleConfig不能被@SpringBootApplication的@ComponentScan扫描到，否则就是全局配置的效果
 */
@Component
public class RibbonRuleConfig {

    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
