package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.leiyuxin.exercise.studyspringdemo.App;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lyx
 *
 * 字符串的命中的包名在重构代码的时候如果包名改变了那么指定的基础包名也将改变，有可能出现错误
 *
 *组件ComponentScan  支持将指定为包中所包含的类或接口，而这些类或接口所在的包将作为组件扫描的基础包
 */

//@ComponentScan("org.leiyuxin.exercise.studyspringdemo.chapter2") //使用字符串的方式作为基础包的值。简写形式
//@ComponentScan(basePackages="org.leiyuxin.exercise.studyspringdemo.chapter2")//更加清楚的形式  字为字符串
//@ComponentScan(basePackages= {"org.leiyuxin.exercise.studyspringdemo.chapter2"})//如果有多个基础包要扫描可以使用这种方式{package1,package2...}  字为字符串
//@CompontScan在Spring 启用组件扫描，如果没有其他配置这个注解默认会扫描与配置类相同的包,以及子包z,查找带有@Component的类并且为其创建bean

//@ComponentScan(basePackageClasses= {CDPlayerConfig.class}) //支持多个
@ComponentScan(basePackageClasses= {App.class}) //包的层级更加高
@Configuration
public class CDPlayerConfig {

}
