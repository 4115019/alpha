package com.alpha.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenwen on 16/12/14.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface ColumnRowValue {
    /**
     * 行,从1开始
     * @return
     */
    int row();

    /**
     * 列,从1开始
     * @return
     */
    int col();
}
