package org.j8unit.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.junit.Test;

public class TestParametersUtilTests {

    @Test
    public void testUtilityContainerCharacteristics()
    throws Exception {
        UtilityContainerTest.testUtilityContainerCharacteristics(TestParametersUtil.class);
    }

    @Test
    public void testParametersViaInstances()
    throws Exception {
        final List<Boolean> instances = testParametersOf(Boolean.TRUE, Boolean.FALSE);
        assertEquals(asList(Boolean.TRUE, Boolean.FALSE), instances);
    }

    @Test
    public void testParametersViaFactories()
    throws Exception {
        final List<Callable<List<?>>> factories = testParametersOf(ArrayList::new, LinkedList::new, Collections::emptyList);
        assertNotNull(factories);
        assertEquals(3, factories.size());

        for (final Callable<List<?>> factory : factories) {
            assertNotNull(factory);
            final List<?> instance = factory.call();
            assert instance != null;
            assertEquals(emptyList(), instance);
        }
    }

    @Test
    public void testParametersViaEnumClass()
    throws Exception {
        final List<State> constants = testParametersOfEnumClass(State.class);
        assertEquals(asList(State.NEW, State.RUNNABLE, State.BLOCKED, State.WAITING, State.TIMED_WAITING, State.TERMINATED), constants);
    }

}
