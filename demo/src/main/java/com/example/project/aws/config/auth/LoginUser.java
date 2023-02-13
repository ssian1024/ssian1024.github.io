package com.example.project.aws.config.auth;

import javax.transaction.Transactional;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Index Controller 에 Session 값을 가져오는 부분에서, 같은 코드의 반복이 일어날 수 있기 때문에
// 메서드 인자로 세션값을 바로 받을 수 있도록 변경하는것.
@Target(ElementType.PARAMETER) // 어노테이션이 생성될 수 있는 위치 지정 (파라미터로)
@Retention(RetentionPolicy.RUNTIME)
//LoginUser 라는 이름을 가진 어노테이션을 생성 , @Interface 란 이 파일을 어노테이션 클래스로 지정
public @interface LoginUser {
}
