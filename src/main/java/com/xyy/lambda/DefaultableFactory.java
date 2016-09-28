package com.xyy.lambda;

import java.util.function.Supplier;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
public interface DefaultableFactory {
     static Defaultable create(Supplier<Defaultable> supplier ){
        return supplier.get();
    }
}
