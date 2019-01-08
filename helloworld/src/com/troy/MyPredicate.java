package com.troy;

/**
 * @author hechaojun
 * @Description: 策略模式接口
 * @ClassName: MyPredicate
 * @date 2019/1/8 10:46
 */
public interface MyPredicate<T> {
    boolean test(T t);
}
