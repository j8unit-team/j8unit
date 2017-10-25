package org.j8unit.util;

import static org.j8unit.util.Functional.consumeFalse;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import org.junit.Test;
import org.j8unit.util.helper.UtilityContainerTest;

public class FunctionalTest {

    @Test
    public void testUtilityContainerCharacteristics()
    throws Exception {
        UtilityContainerTest.testUtilityContainerCharacteristics(Functional.class);
    }

    @Test
    public void consumeTruePredicateTest()
    throws Exception {
        final AtomicInteger counter = new AtomicInteger();
        final Predicate<String> consumer = consumeFalse(String::isEmpty, s -> counter.incrementAndGet());

        consumer.test("");

        assertTrue(counter.get() == 0);
    }

    @Test
    public void consumeFalsePredicateTest()
    throws Exception {
        final AtomicInteger counter = new AtomicInteger();
        final Predicate<String> consumer = consumeFalse(String::isEmpty, s -> counter.incrementAndGet());

        consumer.test("Hello world!");

        assertTrue(counter.get() == 1);
    }

}
