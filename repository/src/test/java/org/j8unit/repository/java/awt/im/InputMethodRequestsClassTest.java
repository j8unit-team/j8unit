package org.j8unit.repository.java.awt.im;

import java.awt.im.InputMethodRequests;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputMethodRequests} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.im.InputMethodRequestsClassTests}).
 */

@RunWith(J8Unit4.class)
public class InputMethodRequestsClassTest
implements InputMethodRequestsClassTests<InputMethodRequests> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.im.InputMethodRequests]

    @Override
    public Class<InputMethodRequests> createNewSUT() {
        return InputMethodRequests.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.im.InputMethodRequests]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.im.InputMethodRequests]

}
