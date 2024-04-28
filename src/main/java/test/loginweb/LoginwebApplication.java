package test.loginweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("test.loginweb.mapper")
public class LoginwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginwebApplication.class, args);
    }

}
