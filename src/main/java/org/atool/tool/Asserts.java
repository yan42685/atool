package org.atool.tool;

import cn.hutool.core.collection.IterUtil;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * 断言结果
 */
public class Asserts {
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new RuntimeException(message);
        }
    }

    public static void notNull(Object object) {
        notNull(object, "非null断言失败");
    }

    public static <T> void notEmpty(Iterable<T> iterable, String message) {
        if (IterUtil.isEmpty(iterable)) {
            throw new RuntimeException(message);
        }
    }

    public static <T> void notEmpty(Iterable<T> collection) {
        notEmpty(collection, "集合为空断言失败");
    }

    public static void notEmpty(String str, String message) {
        if (StringUtils.isEmpty(str)) {
            throw new RuntimeException(message);
        }
    }

    public static void notEmpty(String str) {
        notEmpty("字符串为空断言失败");
    }

    public static void equals(Object objectA, Object objectB, String message) {
        if (!objectA.equals(objectB)) {
            throw new RuntimeException(message);
        }
    }

    public static void equals(Object objectA, Object objectB) {
        equals(objectA, objectB, "对象相等断言失败");
    }

    public static void isTrue(boolean predication, String message) {
        if (!predication) {
            throw new RuntimeException(message);
        }
    }

    public static void isTrue(boolean predication) {
        isTrue(predication, "为真断言失败");
    }


    public static void isFalse(boolean predication, String message) {
        if (predication) {
            throw new RuntimeException(message);
        }
    }

    public static void isFalse(boolean predication) {
        isFalse(predication, "为假断言失败");
    }

    public static void argumentsLength(int expected, Method method) {
        int argumentLength = method.getParameterTypes().length;
        if (argumentLength != expected) {
            throw new RuntimeException(String.format("参数数量期望为%d, 实际为%d", expected, argumentLength));
        }
    }

}
