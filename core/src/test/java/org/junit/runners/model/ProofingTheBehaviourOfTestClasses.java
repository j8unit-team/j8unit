package org.junit.runners.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

public abstract class ProofingTheBehaviourOfTestClasses {

    protected abstract TestClass getTestClass(Class<?> clazz);

    protected void proofDetectionWithoutFinding(final Class<?> clazz) {
        final TestClass testClass = this.getTestClass(clazz);
        final List<FrameworkMethod> testMethods = testClass.getAnnotatedMethods();
        assertTrue(testMethods.isEmpty());
    }

    protected void proofDetectionWithASingleFinding(final Class<?> clazz) {
        this.proofDetectionWithASingleFinding(clazz, clazz);
    }

    protected void proofDetectionWithASingleFinding(final Class<?> clazz, final Class<?> declaringClazz) {
        final TestClass testClass = this.getTestClass(clazz);
        final List<FrameworkMethod> testMethods = testClass.getAnnotatedMethods();
        assertEquals(1, testMethods.size());
        assertEquals(declaringClazz, testMethods.get(0).getDeclaringClass());
    }

}
