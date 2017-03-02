package org.junit.runners.model;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public abstract class ProofingTheBehaviourOfTestClasses {

    protected abstract TestClass getTestClass(Class<?> clazz);

    protected void proofDetectionWithoutFinding(final Class<?> clazz) {
        final TestClass testClass = this.getTestClass(clazz);
        final List<FrameworkMethod> annotatedMethods = testClass.getAnnotatedMethods();
        assertEquals(0, annotatedMethods.size());
        final List<FrameworkMethod> testMethods = testClass.getAnnotatedMethods(Test.class);
        assertEquals(0, testMethods.size());
    }

    protected void proofDetectionWithASingleFinding(final Class<?> clazz) {
        this.proofDetectionWithASingleFinding(clazz, clazz);
    }

    protected void proofDetectionWithASingleFinding(final Class<?> clazz, final Class<?> declaringClazz) {
        final TestClass testClass = this.getTestClass(clazz);
        final List<FrameworkMethod> annotatedMethods = testClass.getAnnotatedMethods();
        assertEquals(1, annotatedMethods.size());
        assertEquals(declaringClazz, annotatedMethods.get(0).getDeclaringClass());
        final List<FrameworkMethod> testMethods = testClass.getAnnotatedMethods(Test.class);
        assertEquals(1, testMethods.size());
        assertEquals(declaringClazz, testMethods.get(0).getDeclaringClass());
    }

}
