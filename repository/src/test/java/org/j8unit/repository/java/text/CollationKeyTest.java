package org.j8unit.repository.java.text;

import java.text.CollationKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CollationKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.CollationKeyTests}).
 */

@RunWith(J8Unit4.class)
public class CollationKeyTest
implements CollationKeyTests<CollationKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.CollationKey]

    @Override
    public CollationKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.CollationKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.CollationKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.CollationKey]

}
