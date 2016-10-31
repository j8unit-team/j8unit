package org.j8unit.repository.java.util.function;

import java.util.function.BiPredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BiPredicateTest<T, U>
implements org.j8unit.repository.java.util.function.BiPredicateTests<BiPredicate<T, U>, T, U> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.BiPredicate]

    @Override
    public BiPredicate<T, U> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.BiPredicate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.BiPredicate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.BiPredicate]

}
