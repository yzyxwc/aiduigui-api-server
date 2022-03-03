package com.aiduigui.api.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author koal_wc
 * @description
 * @date create at 2022/3/3 15:45
 *
 * http://localhost:8088/swagger-ui.html
 * http://localhost:8088/doc.html
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * 配置swagger2核心配置
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                        // 定义api文档汇总信息
                        .apiInfo(apiInfo())
                        // 指定需要提供文档的Controller类所在的包
                        .select().apis(RequestHandlerSelectors.basePackage("com.aiduigui.api.server.controller"))
                        // 需要生成文档的接口路径
                        .paths(PathSelectors.any())
                        .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱对轨客户端接口文档")
                .contact(new Contact(
                        "name",
                        "http://aiduigui.com",
                        "aiduigui@qq.com"))
                .description("爱对轨客户端官网的相关接口")
                .version("1.0.1")
                .termsOfServiceUrl("http://aiduigui.com")
                .build();
    }
}
