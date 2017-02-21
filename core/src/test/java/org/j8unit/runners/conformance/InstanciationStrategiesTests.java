package org.j8unit.runners.conformance;

import static java.util.Arrays.asList;
import static org.j8unit.runners.conformance.InstanciationStrategies.AVAILABLE_FIELDS;
import static org.j8unit.runners.conformance.InstanciationStrategies.DEFAULT_CONSTRUCTOR;
import static org.j8unit.runners.conformance.InstanciationStrategies.ENUM_CONSTANTS;
import static org.j8unit.runners.conformance.InstanciationStrategies.FAIL_INSTANCIATION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InstanciationStrategiesTests {

    @Parameters(name = "{index}: {0}({1})={2}")
    public static Iterable<Object[]> data() {
        return asList(new Object[][] { //
                                       { ENUM_CONSTANTS, DayOfWeek.class, 7 }, //
                                       { AVAILABLE_FIELDS, DayOfWeek.class, 7 }, //
                                       { DEFAULT_CONSTRUCTOR, DayOfWeek.class, 0 }, //
                                       { FAIL_INSTANCIATION, DayOfWeek.class, 1 }, //
                                       { ENUM_CONSTANTS, Object.class, 0 }, //
                                       { AVAILABLE_FIELDS, Object.class, 0 }, //
                                       { DEFAULT_CONSTRUCTOR, Object.class, 1 }, //
                                       { FAIL_INSTANCIATION, Object.class, 1 }, //
                                       { ENUM_CONSTANTS, Character.UnicodeBlock.class, 0 }, //
                                       { AVAILABLE_FIELDS, Character.UnicodeBlock.class, 221 }, //
                                       { DEFAULT_CONSTRUCTOR, Character.UnicodeBlock.class, 0 }, //
                                       { FAIL_INSTANCIATION, Character.UnicodeBlock.class, 1 }, //
        });
    }

    @Parameter(0)
    public InstanciationStrategies strategy;

    @Parameter(1)
    public Class<?> candidate;

    @Parameter(2)
    public int numberOfInstanciations;

    @Test
    public void testNumberOfDiscoveredInstanciations()
    throws Exception {
        final Map<String, Callable<?>> instanciations = new HashMap<>();
        this.strategy.test(this.candidate, instanciations);
        assertEquals(this.numberOfInstanciations, instanciations.size());
    }

    @Test
    public void testInstantiability()
    throws Exception {
        try {
            final Map<String, Callable<?>> instanciations = new HashMap<>();
            this.strategy.test(this.candidate, instanciations);
            for (final Callable<?> factory : instanciations.values()) {
                assertNotNull(factory);
                final Object instance = factory.call();
                if (FAIL_INSTANCIATION.equals(this.strategy)) {
                    fail(FAIL_INSTANCIATION + " must not reach this point!");
                }
                assertNotNull(instance);
            }
        } catch (final AssumptionViolatedException abort) {
            if (!FAIL_INSTANCIATION.equals(this.strategy)) {
                throw new AssertionError(abort);
            }
        }
    }

}
