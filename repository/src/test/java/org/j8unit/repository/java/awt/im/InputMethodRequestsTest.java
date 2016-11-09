package org.j8unit.repository.java.awt.im;

import java.awt.im.InputMethodRequests;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputMethodRequests} (by simply
 * reusing the J8Unit test interface {@link InputMethodRequestsTests}).
 */

@RunWith(J8Unit4.class)
public class InputMethodRequestsTest
implements InputMethodRequestsTests<InputMethodRequests> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputMethodRequests]

    @Override
    public InputMethodRequests createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.im.InputMethodRequests], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.im.InputMethodRequests]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.im.InputMethodRequests]

}
