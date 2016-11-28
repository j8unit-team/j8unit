package org.j8unit.repository.java.awt;

import java.awt.MouseInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.MouseInfoTests}).
 */
@RunWith(J8Unit4.class)
public class MouseInfoTest
implements MouseInfoTests<MouseInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MouseInfo]

    @Override
    public MouseInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.MouseInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MouseInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MouseInfo]

}
