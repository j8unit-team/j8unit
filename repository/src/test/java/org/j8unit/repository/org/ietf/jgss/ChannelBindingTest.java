package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.ChannelBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChannelBinding} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.ChannelBindingTests}).
 */

@RunWith(J8Unit4.class)
public class ChannelBindingTest
implements ChannelBindingTests<ChannelBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.ChannelBinding]

    @Override
    public ChannelBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.ietf.jgss.ChannelBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.ietf.jgss.ChannelBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.ChannelBinding]

}
