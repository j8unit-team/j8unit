package org.j8unit.repository.java.util.function;

import java.util.function.LongPredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongPredicate} (by simply reusing the
 * J8Unit test interface {@link LongPredicateClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongPredicateClassTest
implements LongPredicateClassTests<LongPredicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongPredicate]

    @Override
    public Class<LongPredicate> createNewSUT() {
        return LongPredicate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongPredicate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongPredicate]

}
