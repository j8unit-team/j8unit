package org.j8unit.repository.java.util.function;

import java.util.function.IntPredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntPredicate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.IntPredicateClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntPredicateClassTest
implements IntPredicateClassTests<IntPredicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntPredicate]

    @Override
    public Class<IntPredicate> createNewSUT() {
        return IntPredicate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntPredicate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntPredicate]

}
