package org.j8unit.repository.javax.management;

import javax.management.ValueExp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValueExp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.ValueExpTests}).
 */

@RunWith(J8Unit4.class)
public class ValueExpTest
implements ValueExpTests<ValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ValueExp]

    @Override
    public ValueExp createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.ValueExp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.ValueExp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.ValueExp]

}
