package de.informaticum.j8junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.internal.MethodSorter;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

public class J8TestClass
extends TestClass {

    public J8TestClass(final Class<?> clazz) {
        super(clazz);
    }

    @Override
    protected void scanAnnotatedMembers(final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations, final Map<Class<? extends Annotation>, List<FrameworkField>> fieldsForAnnotations) {
        super.scanAnnotatedMembers(methodsForAnnotations, fieldsForAnnotations);
        this.scanAnnotatedDefaultMethods(methodsForAnnotations);
    }

    protected void scanAnnotatedDefaultMethods(final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations) {
        for (final Class<?> eachInterface : getInterfaces(this.getJavaClass())) {
            // inspect each interface's declared methods
            for (final Method eachMethod : MethodSorter.getDeclaredMethods(eachInterface)) {
                if (eachMethod.isDefault()) {
                    addToAnnotationLists(new FrameworkMethod(eachMethod), methodsForAnnotations);
                }
            }
        }
    }

    private static Set<Class<?>> getInterfaces(final Class<?> clazz) {
        return getInterfaces(clazz.getInterfaces());
    }

    private static Set<Class<?>> getInterfaces(final Class<?>[] allInterfaces) {
        final Set<Class<?>> results = new LinkedHashSet<Class<?>>();
        for (final Class<?> eachInterface : allInterfaces) {
            results.add(eachInterface);
            results.addAll(getInterfaces(eachInterface.getInterfaces()));
        }
        return results;
    }

}
