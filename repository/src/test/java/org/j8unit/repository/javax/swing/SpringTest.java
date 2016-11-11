package org.j8unit.repository.javax.swing;

import javax.swing.Spring;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Spring} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.SpringTests}).
 */

@RunWith(J8Unit4.class)
public class SpringTest
implements SpringTests<Spring> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Spring]

    @Override
    public Spring createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Spring], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Spring]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Spring]

}
