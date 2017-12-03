package com.xyy.lambda;

import java.util.function.Consumer;

/**
 * 数字操作测试
 * Created by Administrator on 2017/12/2.
 */
public class MathOperationTest {

    public static void main(String[] args){
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;


        System.out.println(operate(1,2,addition));
        System.out.println(operate(1,2,subtraction));
        System.out.println(operate(1,2,multiplication));
        System.out.println(operate(2,1,division));


        int i1= 1;
        int i2=2;
        //lambda 表达式只能引用 final 或 final 局部变量，这就是说不能在 lambda 内部修改定义在域外的变量，否则会编译错误。
        System.out.println(operate(i1,i2,(a,b)->{ return a*b; }));
    }


    private static  int operate(int a ,int b ,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
