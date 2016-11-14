package org.j8unit.repository.java.text;

import java.text.Collator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Collator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.CollatorTests}).
 */

@RunWith(J8Unit4.class)
public class CollatorTest
implements CollatorTests<Collator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Collator]

    @Override
    public Collator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.Collator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Collator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Collator]

}
