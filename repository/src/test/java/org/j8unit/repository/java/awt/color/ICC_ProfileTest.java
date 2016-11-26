package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_Profile;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ICC_Profile} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.color.ICC_ProfileTests}).
 */
@RunWith(J8Unit4.class)
public class ICC_ProfileTest
implements ICC_ProfileTests<ICC_Profile> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ICC_Profile]

    @Override
    public ICC_Profile createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.color.ICC_Profile], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.color.ICC_Profile]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.color.ICC_Profile]

}
