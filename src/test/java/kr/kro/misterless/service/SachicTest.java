package kr.kro.misterless.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import kr.kro.misterless.junitcalculate.service.Sachic;


@ExtendWith(MockitoExtension.class)
public class SachicTest {

    @Test
    public void contextLoads() {
    }



@Test
public  void Sachic_add테스트(){

    //given
    int result = Sachic.add(3, 4);
    //when 없다
    //then
    assertEquals(7,result);
    

}

@Test
public  void Sachic_sub테스트(){

    //given
    int result = Sachic.sub(9, 4);
    //when 없다
    //then
    assertEquals(5,result);
    

}

@Test
public  void Sachic_mul테스트(){

    //given
    int result = Sachic.mul(9, 4);
    //when 없다
    //then
    assertEquals(36,result);
    

}   

@Test
public  void Sachic_div테스트(){

    //given
    double result = Sachic.div(24, 3);
    //when 없다
    //then
    assertEquals(8,result);
    

}               
            


}
    

