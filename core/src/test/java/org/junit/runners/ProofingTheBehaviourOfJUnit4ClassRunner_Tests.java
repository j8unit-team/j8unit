package org.junit.runners;

import org.junit.Test;
import org.junit.runner.Runner;
import org.junit.runners.model.ClassWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithADirectlyInheritedTestMethod;
import org.junit.runners.model.ClassWithADuallyInheritedTestMethod;
import org.junit.runners.model.ClassWithATestMethod;
import org.junit.runners.model.ClassWithATwiceInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithAnOverriddenDefaultTestMethod;
import org.junit.runners.model.ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation;
import org.junit.runners.model.ClassWithAnOverriddenTestMethod;
import org.junit.runners.model.ClassWithAnOverriddenTestMethodWithoutAnnotation;
import org.junit.runners.model.ClassWithoutATestMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.InterfaceWithADefaultTestMethod;
import org.junit.runners.model.InterfaceWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.InterfaceWithAnOverriddenDefaultTestMethod;
import org.junit.runners.model.InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation;
import org.junit.runners.model.InterfaceWithoutATestMethod;

public class ProofingTheBehaviourOfJUnit4ClassRunner_Tests
extends ProofingTheBehaviourOfRunners {

    protected static final String NOTHING = "%s: [%s] cannot run a test of [%s: %s].%n";

    protected static final String FINDING = "%s: [%s] can    run a test of [%s: %s].%n";

    protected static final String FINDING2 = "%s: [%s] can    run a test of [%s: %s, declard in %s].%n";

    @Override
    protected Runner getRunner(final Class<?> clazz)
    throws InitializationError {
        return new JUnit4(clazz);
    }

    protected Class<? extends Runner> getRunnerClass() {
        return JUnit4.class;
    }

    @Test
    public void proofRunningOf_EmptyInterface()
    throws Exception {
        final Class<?> container = InterfaceWithoutATestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructorAndNoTests(container);
        System.err.format(NOTHING, "c✓t✓", this.getRunnerClass(), "an empty interface", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_InterfaceWithDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithADefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructor(container);
        System.err.format(NOTHING, "c✓t✓", this.getRunnerClass(), "an interface with a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_InterfaceWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithADirectlyInheritedDefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructorAndNoTests(container);
        System.err.format(NOTHING, "c✓t✗", this.getRunnerClass(), "an interface inheriting a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_EmptyClass()
    throws Exception {
        final Class<?> container = ClassWithoutATestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoTests(container);
        System.err.format(NOTHING, "c✓t✓", this.getRunnerClass(), "an empty class", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithTestMethod()
    throws Exception {
        final Class<?> container = ClassWithATestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container);
        System.out.format(FINDING, "c✓t✓", this.getRunnerClass(), "a class with a Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithDirectlyInheritedTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADirectlyInheritedTestMethod.class;
        final Class<?> effective = ClassWithATestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t✓", this.getRunnerClass(), "a class inheriting a @Test method", container.getSimpleName(), effective.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADirectlyInheritedDefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoTests(container);
        System.err.format(NOTHING, "c✓t✗", this.getRunnerClass(), "a class inheriting a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_InterfaceWithOverriddenDefaultTestMethod()
    throws Exception {
        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructor(container);
        System.err.format(NOTHING, "c✓t✓", this.getRunnerClass(), "an interface overriding a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructorAndNoTests(container);
        System.err.format(NOTHING, "c✓t✗", this.getRunnerClass(), "an interface overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithOverriddenDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenDefaultTestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container);
        System.out.format(FINDING, "c✓t✓", this.getRunnerClass(), "a class overriding a default @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofClassRunnerWithInitializationErrorByNoTests(container);
        System.err.format(NOTHING, "c✓t✗", this.getRunnerClass(), "a class overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithOverriddenTestMethod()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenTestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container);
        System.out.format(FINDING, "c✓t✓", this.getRunnerClass(), "a class overriding a @Test method", container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithOverriddenTestMethodWithoutAnnotation()
    throws Exception {
        final Class<?> container = ClassWithAnOverriddenTestMethodWithoutAnnotation.class;
        final Class<?> effective = ClassWithAnOverriddenTestMethodWithoutAnnotation.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t✓", this.getRunnerClass(), "a class overriding a @Test method, without (!) @Test annotation", container.getSimpleName(),
                          effective.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithTwiceInheritedDefaultTestMethod()
    throws Exception {
        final Class<?> container = ClassWithATwiceInheritedDefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoTests(container);
        System.err.format(NOTHING, "c✓t✗", this.getRunnerClass(), "a class inheriting a default @Test method twice (via super-class and interface)",
                          container.getSimpleName());
    }

    @Test
    public void proofRunningOf_ClassWithDuallyInheritedTestMethod()
    throws Exception {
        final Class<?> container = ClassWithADuallyInheritedTestMethod.class;
        final Class<?> effective = ClassWithATestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t✓", this.getRunnerClass(), "a class inheriting a @Test method dually (via super-class and default via interface)",
                          container, effective);
    }

}
