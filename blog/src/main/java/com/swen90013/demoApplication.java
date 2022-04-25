package com.swen90013;


import com.jerry.domain.ResponseResult;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.jerry", "com.swen90013"})
@MapperScan("com.jerry.mapper")
@RestController
public class demoApplication {
    @GetMapping("/")
    public ResponseResult userInfo(){
        return ResponseResult.okResult();
    }
    public static void main(String[] args) {
        SpringApplication.run(demoApplication.class ,args);
    }
}
