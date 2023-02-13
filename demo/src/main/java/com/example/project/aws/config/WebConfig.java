package com.example.project.aws.config;

import com.example.project.aws.config.auth.LoginUserArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//@LoginUser 환경 구성이 끝난 후, 그로인해 만들어진 LoginUserArgumentResolver 을 스프링에서 인식될 수 있도록
//WebMvcConfigurer 에 추가
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginUserArgumentResolver loginUserArgumentResolver;

    //HandlerMethodArgumentResolver 은 항상 WebMvcConfigurer 의 addArgumentResolvers()를 통해 추가
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(loginUserArgumentResolver);
    }
}

