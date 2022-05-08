package com.zt1994.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop config
 *
 * @author zhongtao
 * @date 2022/5/8 15:25
 */
@Configuration
@ComponentScan(basePackages = {"com.zt1994"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {

}
