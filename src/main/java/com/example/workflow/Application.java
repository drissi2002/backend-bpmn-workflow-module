package com.example.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }


  /**
   * Configures and returns the Swagger Docket object for the flowvioo project APIs.
   *
   * @return The Swagger Docket object.
   */
  @Bean
  public Docket swaggerConfiguration() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.workflow"))
            .paths(PathSelectors.ant("/**"))
            .build()
            .apiInfo(ApiDocumentationInfo());
  }

  /**
   * Configures and returns the API information for the Swagger UI.
   *
   * @return The API information for the Swagger UI.
   */
  private ApiInfo ApiDocumentationInfo(){
    return new ApiInfo(
            "flowvioo Project APIs",
            "APIs for managing workflows",
            "1.0",
            "use it under WEVIOO LICENSE",
            new springfox.documentation.service.Contact("DRISSI Houcem eddine" , "https://github.com/drissi2002","houssemmedine.drissi@enicar.ucar.tn"),
            "WEVIOO API LICENSE",
            "https://www.wevioo.com/fr",
            Collections.emptyList());
  }

}