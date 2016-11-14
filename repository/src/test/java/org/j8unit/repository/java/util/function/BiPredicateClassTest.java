package org.j8unit.repository.java.util.function;

import java.util.function.BiPredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BiPredicate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.BiPredicateClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BiPredicateClassTest
implements BiPredicateClassTests<BiPredicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.BiPredicate]

    @Override
    public Class<BiPredicate> createNewSUT() {
        return BiPredicate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.BiPredicate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.BiPredicate]

}
