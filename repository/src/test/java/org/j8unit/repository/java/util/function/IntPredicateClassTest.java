package org.j8unit.repository.java.util.function;

import java.util.function.IntPredicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntPredicateClassTest
implements org.j8unit.repository.java.util.function.IntPredicateClassTests<IntPredicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntPredicate]

    @Override
    public Class<IntPredicate> createNewSUT() {
        return IntPredicate.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntPredicate]

}
