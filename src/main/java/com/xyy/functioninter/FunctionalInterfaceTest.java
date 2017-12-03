package com.xyy.functioninter;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 自带函数式接口
 * Created by Administrator on 2017/12/2.
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args){

        //接收一个参数，不返回
        Consumer<String> printConsumer = message->print(message);
        printConsumer.accept("str");
        //接收一个参数，不返回
        BiConsumer<String,String> printBiConsumer = (message,message2)->print(message,message2);
        printBiConsumer.accept("str","str2");

        Function<Integer,Integer>  multipliedTwo = a -> a*2;
        print(multipliedTwo.andThen(multipliedTwo).apply(2));

        //没有输入，输出一个值
        Supplier<String> supplierString= ()->{return "supplierString";};
        print(supplierString.get());
        Supplier<Car> supplierCar =  Car::new;
        Car  car = supplierCar.get();
        car.name="name";
        print(car);
    }

    /**
     * 输出字符串
     * @param str
     */
    private static void print(Object ... str ){
        Arrays.stream(str).forEach(System.out::println);
    }
    private static class Car{
        public String name ;

        @Override
        public String toString() {
            return name;
        }
    }
}
