package org.j8unit.repository.javax.swing;

import javax.swing.Icon;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Icon} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.IconTests}).
 */
@RunWith(J8Unit4.class)
public class IconTest
implements IconTests<Icon> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Icon]

    @Override
    public Icon createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Icon], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Icon]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Icon]

}
