package cn.jiecheng.tenantline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "cn.jiecheng.tenantline.mapper")
@SpringBootApplication
public class TenantLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantLineApplication.class,args);
    }
}
