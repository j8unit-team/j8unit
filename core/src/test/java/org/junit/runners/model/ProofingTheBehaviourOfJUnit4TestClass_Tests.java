package org.junit.runners.model;

import org.junit.Test;

public class ProofingTheBehaviourOfJUnit4TestClass_Tests
extends ProofingTheBehaviourOfTestClasses {

    protected static final String NOTHING = "%s: [%s] cannot detect a test method within [%s: %s].%n";

    protected static final String FINDING = "%s: [%s] can    detect a test method within [%s: %s].%n";

    protected static final String FINDING2 = "%s: [%s] can    detect a test method within [%s: %s, declard in %s].%n";

    @Override
    protected TestClass getTestClass(final Class<?> clazz) {
        return new TestClass(clazz);
    }

    protected Class<?> getTestClassClass() {
        return TestClass.class;
    }

    @Test
    public void proofDetectionFor_EmptyInterface()
    throws Exception {
        final Class<?> container = InterfaceWithoutATestMethod.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✓", this.getTestClassClass(), "an empty interface", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_InterfaceWithDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container);
        System.out.format(FINDING, "✓", this.getTestClassClass(), "an interface with a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_InterfaceWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithADirectlyInheritedDefaultTestMethod.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✗", this.getTestClassClass(), "an interface inheriting a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_EmptyClass()
    throws Exception {
        final Class<?> container = ClassWithoutATestMethod.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✓", this.getTestClassClass(), "an empty class", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithTestMethod()
    throws Exception {
        final Class<?> container = ClassWithATestMethod.class;
        this.proofDetectionWithASingleFinding(container);
        System.out.format(FINDING, "✓", this.getTestClassClass(), "a class with a Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithDirectlyInheritedTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADirectlyInheritedTestMethod.class;
        final Class<?> declarer = ClassWithATestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "✓", this.getTestClassClass(), "a class inheriting a @Test method", container.getSimpleName(), declarer.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADirectlyInheritedDefaultTestMethod.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✗", this.getTestClassClass(), "a class inheriting a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_InterfaceWithOverriddenDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container);
        System.out.format(FINDING, "✓", this.getTestClassClass(), "an interface overriding a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✗", this.getTestClassClass(), "an interface overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithOverriddenDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenDefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container);
        System.out.format(FINDING, "✓", this.getTestClassClass(), "a class overriding a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✗", this.getTestClassClass(), "a class overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithOverriddenTestMethod()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenTestMethod.class;
        this.proofDetectionWithASingleFinding(container);
        System.out.format(FINDING, "✓", this.getTestClassClass(), "a class overriding a @Test method", container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithOverriddenTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenTestMethodWithoutAnnotation.class;
        final Class<?> declarer = ClassWithATestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "✓", this.getTestClassClass(), "a class overriding a @Test method, without (!) @Test annotation", container.getSimpleName(),
                          declarer.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithTwiceInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithATwiceInheritedDefaultTestMethod.class;
        this.proofDetectionWithoutFinding(container);
        System.err.format(NOTHING, "✗", this.getTestClassClass(), "a class inheriting a default @Test method twice (via super-class and interface)",
                          container.getSimpleName());
    }

    @Test
    public void proofDetectionFor_ClassWithDuallyInheritedTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADuallyInheritedTestMethod.class;
        final Class<?> declarer = ClassWithATestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "✓", this.getTestClassClass(), "a class inheriting a @Test method dually (via super-class and default via interface)",
                          container, declarer);
    }

}
