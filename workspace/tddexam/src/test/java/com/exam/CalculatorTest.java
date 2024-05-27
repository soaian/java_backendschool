package com.exam;
//static import
import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator cal = new Calculator();
    // 테스트는 앞에 @Test 붙여줘야함
    @Test
    void  plus (){

       assertEquals(5, cal.plus(2,3));
    }

    @Test
    void  minus(){
        assertEquals(2,cal.minus(3,1));
    }
    //beforeall >> 테스트 진행될때 가장 먼저 실행됨 전체테스트가 실행이 될때 처음한번 실행되고 끝남
    @BeforeAll
    static void  beforeall(){
        System.out.println("테스트 클래스가 실행될 때 한 번 실행됨.");
    }

    // 각 테스트가 실행될때마다 실행됨
    @BeforeEach
    void beforeEach(){
        System.out.println("테스트 메서드가 실행되기 전에 실행. 모든 테스트 메소드마다 실행!");
    }

    @AfterEach
    void afterEach(){
        System.out.println("각 테스트 메소드가 실행 된 후 실행!!");
    }

    @AfterAll
    static void afterall(){
        System.out.println("모든 테스트가 종료된 후 실행!!");
    }
    


}
