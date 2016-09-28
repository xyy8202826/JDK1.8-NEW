package com.xyy.lambda;

import com.xyy.lambda.*;
import com.xyy.lambda.DefaultableImpl;
import com.xyy.lambda.Defaultable;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Supplier<Defaultable> supplier=()-> new DefaultableImpl();
        Defaultable defaultableImpl = DefaultableFactory.create(supplier);
        Defaultable overridableImpl= DefaultableFactory.create(OverridableImpl:: new);
        System.out.println(defaultableImpl.notRequired());
        System.out.println(overridableImpl.notRequired());

        Consumer<String> consumerImple=(s)->{
            System.out.println("ConsumerImple:"+s);
            System.out.println("ConsumerImple:"+s);
        };
        Arrays.asList("a","b","c").forEach(consumerImple);
    }
}
