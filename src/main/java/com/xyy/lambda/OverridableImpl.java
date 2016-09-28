package com.xyy.lambda;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
public class OverridableImpl implements Defaultable {
    @Override
    public String notRequired() {
        return "OverridableImpl";
    }

    @Override
    public void required(String name) {

    }
}
