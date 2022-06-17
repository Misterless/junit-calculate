package kr.kro.misterless.junitcalculate.service;

import org.springframework.stereotype.Service;

@Service
public class Sachic {
    
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return (a-b);
    }
    
    public static int mul(int a, int b){
        return a*b;
    }
    public static double div( int a, int b){
        return (double) a/b;
    }
    
}
