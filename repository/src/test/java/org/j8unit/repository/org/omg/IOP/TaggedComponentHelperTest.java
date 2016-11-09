package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TaggedComponentHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TaggedComponentHelper} (by simply
 * reusing the J8Unit test interface {@link TaggedComponentHelperTests}).
 */

@RunWith(J8Unit4.class)
public class TaggedComponentHelperTest
implements TaggedComponentHelperTests<TaggedComponentHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TaggedComponentHelper]

    @Override
    public TaggedComponentHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TaggedComponentHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TaggedComponentHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TaggedComponentHelper]

}
