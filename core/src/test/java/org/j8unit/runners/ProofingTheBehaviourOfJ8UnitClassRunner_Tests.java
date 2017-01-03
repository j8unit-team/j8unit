package org.j8unit.runners;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.Runner;
import org.junit.runners.ProofingTheBehaviourOfJUnit4ClassRunner_Tests;
import org.junit.runners.model.ClassWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithATwiceInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.InterfaceWithADefaultTestMethod;
import org.junit.runners.model.InterfaceWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation;

public class ProofingTheBehaviourOfJ8UnitClassRunner_Tests
extends ProofingTheBehaviourOfJUnit4ClassRunner_Tests {

    @Override
    protected Runner getRunner(final Class<?> clazz)
    throws InitializationError {
        return new J8Unit4(clazz);
    }

    @Override
    protected Class<? extends Runner> getRunnerClass() {
        return J8Unit4.class;
    }

    @Override
    @Test
    public void proofRunningOf_InterfaceWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofRunningOf_InterfaceWithDirectlyInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = InterfaceWithADirectlyInheritedDefaultTestMethod.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructor(container);
        System.err.format(NOTHING, "c✓t!", this.getRunnerClass(), "an interface inheriting a default @Test method", container.getSimpleName());
    }

    @Override
    @Test
    public void proofRunningOf_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        try {
            super.proofRunningOf_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofClassRunnerWithInitializationErrorByNoConstructor(container);
        System.err.format(NOTHING, "c✓t!", this.getRunnerClass(), "an interface overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName());
    }

    @Override
    @Test
    public void proofRunningOf_ClassWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofRunningOf_ClassWithDirectlyInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithADirectlyInheritedDefaultTestMethod.class;
        final Class<?> effective = InterfaceWithADefaultTestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t!", this.getRunnerClass(), "a class inheriting a default @Test method", container.getSimpleName(),
                          effective.getSimpleName());
    }

    @Override
    @Test
    public void proofRunningOf_ClassWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        try {
            super.proofRunningOf_ClassWithOverriddenDefaultTestMethodWithoutAnnotation();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        final Class<?> effective = ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t!", this.getRunnerClass(), "a class overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName(), effective.getSimpleName());
    }

    @Override
    @Test
    public void proofRunningOf_ClassWithTwiceInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofRunningOf_ClassWithTwiceInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithATwiceInheritedDefaultTestMethod.class;
        final Class<?> effective = InterfaceWithADefaultTestMethod.class;
        this.proofJUnit4ClassRunnerWithASingleTest(container, effective);
        System.out.format(FINDING2, "c✓t!", this.getRunnerClass(), "a class inheriting a default @Test method twice (via super-class and interface)",
                          container.getSimpleName(), effective.getSimpleName());
    }

}
