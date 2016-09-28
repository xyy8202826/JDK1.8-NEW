package com.xyy.lambda;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
public class DefaultableImpl implements Defaultable {
    @Override
    public void required(String name) {
        System.out.println(name);
    }
}
