package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.DirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirContextTest
implements org.j8unit.repository.javax.naming.directory.DirContextTests<DirContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.DirContext]

    @Override
    public DirContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.directory.DirContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.DirContext]

}
