package com.alinesno.infra.smart.media.collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 针对大批量流媒体解析收发服务
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MediaCollectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaCollectorApplication.class , args) ;
    }

}
