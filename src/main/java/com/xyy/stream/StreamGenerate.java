package com.xyy.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
public class StreamGenerate {

    public static void main(String [] args){
        //生成Stream的方法
        Random seed = new Random();
        Supplier<Integer> random =() ->seed.nextInt(100);
        Stream.generate(random).limit(10).forEach(System.out::println);
        //Another way
        IntStream.generate(() -> (int) (System.nanoTime() % 100)).
                limit(10).forEach(System.out::println);

    }
}
