package org.PentaHack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by 王贇超 on 2017/3/28.
 */
@EnableTransactionManagement
@SpringBootApplication
public class PentaHackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PentaHackApplication.class, args);
    }
}


