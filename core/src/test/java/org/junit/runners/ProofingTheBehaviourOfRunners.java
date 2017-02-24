package org.junit.runners;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.mockito.ArgumentCaptor;

public abstract class ProofingTheBehaviourOfRunners {

    protected abstract Runner getRunner(Class<?> container)
    throws InitializationError;

    protected void proofClassRunnerWithInitializationError(final Class<?> container)
    throws InitializationError {
        try {
            this.getRunner(container);
            fail("Runner creation must fail!");
        } catch (final InitializationError expected) {
            // there must be any cause exception
            assertFalse(expected.getCauses().isEmpty());
            throw expected;
        }
    }

    protected void proofClassRunnerWithInitializationErrorByNoConstructor(final Class<?> container)
    throws InitializationError {
        try {
            this.proofClassRunnerWithInitializationError(container);
            fail("Runner creation must fail!");
        } catch (final InitializationError expected) {
            // there must be exactly one specific cause exception (failing construction)
            assertEquals(1, expected.getCauses().size());
            assertEquals(Exception.class, expected.getCauses().get(0).getClass());
            assertEquals("Test class should have exactly one public constructor", expected.getCauses().get(0).getMessage());
        }
    }

    protected void proofClassRunnerWithInitializationErrorByNoTests(final Class<?> container)
    throws InitializationError {
        try {
            this.proofClassRunnerWithInitializationError(container);
            fail("Runner creation must fail!");
        } catch (final InitializationError expected) {
            // there must be exactly one specific cause exception (failing test method exploration)
            assertEquals(1, expected.getCauses().size());
            assertEquals(Exception.class, expected.getCauses().get(0).getClass());
            assertEquals("No runnable methods", expected.getCauses().get(0).getMessage());
        }
    }

    protected void proofClassRunnerWithInitializationErrorByNoConstructorAndNoTests(final Class<?> container)
    throws InitializationError {
        try {
            this.proofClassRunnerWithInitializationError(container);
            fail("Runner creation must fail!");
        } catch (final InitializationError expected) {
            // there must be exactly two specific cause exceptions (failing construction and failing test method exploration)
            assertEquals(2, expected.getCauses().size());
            assertEquals(Exception.class, expected.getCauses().get(0).getClass());
            assertEquals("Test class should have exactly one public constructor", expected.getCauses().get(0).getMessage());
            assertEquals(Exception.class, expected.getCauses().get(1).getClass());
            assertEquals("No runnable methods", expected.getCauses().get(1).getMessage());
        }
    }

    protected void proofJUnit4ClassRunnerWithASingleTest(final Class<?> container)
    throws Exception {
        this.proofJUnit4ClassRunnerWithASingleTest(container, container);
    }

    protected void proofJUnit4ClassRunnerWithASingleTest(final Class<?> container, final Class<?> effective)
    throws Exception {
        final Runner runner = this.getRunner(container);
        // without any exception, there must be a single test
        assertEquals(1, runner.testCount());

        // spy the test run
        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);

        // assert a single test start
        verify(spy, times(1)).fireTestStarted(any());
        // assert a single test failure
        final ArgumentCaptor<Failure> argument = ArgumentCaptor.forClass(Failure.class);
        verify(spy, times(1)).fireTestAssumptionFailed(argument.capture());
        assertEquals(effective.getField("FAILURE_TOKEN").get(null), argument.getValue().getMessage());
        // assert a single test finish
        verify(spy, times(1)).fireTestFinished(any());
    }

}
