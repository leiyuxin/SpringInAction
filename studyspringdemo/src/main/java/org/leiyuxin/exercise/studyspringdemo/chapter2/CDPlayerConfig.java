package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@CompontScan在Spring 启用组件扫描，如果没有其他配置这个注解默认会扫描与配置类相同的包,以及子包z,查找带有@Component的类并且为其创建bean
public class CDPlayerConfig {

}
