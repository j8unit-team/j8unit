package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.DirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DirContext} (by simply reusing the J8Unit
 * test interface {@link DirContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class DirContextClassTest
implements DirContextClassTests<DirContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.DirContext]

    @Override
    public Class<DirContext> createNewSUT() {
        return DirContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.DirContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.DirContext]

}
