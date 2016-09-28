package com.xyy.lambda;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
@FunctionalInterface
public interface Defaultable {
    default String notRequired(){
        return "Defaultable";
    }
    void required(String name);
}
