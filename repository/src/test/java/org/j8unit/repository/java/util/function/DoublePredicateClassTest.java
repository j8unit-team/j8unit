package org.j8unit.repository.java.util.function;

import java.util.function.DoublePredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoublePredicate} (by simply reusing the
 * J8Unit test interface {@link DoublePredicateClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoublePredicateClassTest
implements DoublePredicateClassTests<DoublePredicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoublePredicate]

    @Override
    public Class<DoublePredicate> createNewSUT() {
        return DoublePredicate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoublePredicate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoublePredicate]

}
