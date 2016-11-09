package org.j8unit.repository.java.text;

import java.text.RuleBasedCollator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RuleBasedCollator} (by simply reusing
 * the J8Unit test interface {@link RuleBasedCollatorTests}).
 */

@RunWith(J8Unit4.class)
public class RuleBasedCollatorTest
implements RuleBasedCollatorTests<RuleBasedCollator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.RuleBasedCollator]

    @Override
    public RuleBasedCollator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.RuleBasedCollator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.RuleBasedCollator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.RuleBasedCollator]

}
