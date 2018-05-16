package org.satff.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.staff.StaffServiceApplication;

@SpringBootApplication
@ComponentScan(basePackages = "org.satff.*") // 添加org.staff包下的依赖
public class StaffWebApplication extends StaffServiceApplication {

	/**
	 * 继承 SpringBootServletInitializer 类并实现 configure 方法，使用 application 的
	 * sources 方法可以通过WAR启动项目。
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(StaffWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StaffWebApplication.class, args);
	}
}
