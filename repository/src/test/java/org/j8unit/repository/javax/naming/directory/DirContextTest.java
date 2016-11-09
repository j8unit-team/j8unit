package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.DirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DirContext} (by simply reusing the
 * J8Unit test interface {@link DirContextTests}).
 */

@RunWith(J8Unit4.class)
public class DirContextTest
implements DirContextTests<DirContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.DirContext]

    @Override
    public DirContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.directory.DirContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.DirContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.DirContext]

}
