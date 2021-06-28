package org.tool;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class ReflectionUtils {

    public static <T> Set<Class<? extends T>> getSubClassesFromSamePackage(Class<T> clazz) {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forPackage(clazz.getPackage().getName()))
                .setScanners(new SubTypesScanner());
        return new Reflections(configurationBuilder).getSubTypesOf(clazz);
    }

    public static void invoke(Object target, Method method, Object... args) {
        try {
            method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
