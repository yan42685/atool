package org.atool.tool;

import cn.hutool.core.collection.IterUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * 校验参数
 */
public final class ArgUtils {
    /**
     * 断言对象非null
     */
    public static void notNull(Object object, String argName) {
        if (object == null) {
            throw new IllegalArgumentException(argName + " can not be null!");
        }
    }

    /**
     * 断言字符串非空
     */
    public static void notEmpty(String string, String argName) {
        if (StringUtils.isEmpty(string)) {
            throw new IllegalArgumentException(argName + " can not be empty!");
        }
    }

    /**
     * 断言Iterable对象非空
     */
    public static <T> void notEmpty(Iterable<T> iterable, String argName) {
        if (IterUtil.isEmpty(iterable)) {
            throw new IllegalArgumentException(argName + " can not be empty!");
        }
    }
}
