package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.DirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirContextClassTest
implements org.j8unit.repository.javax.naming.directory.DirContextClassTests<DirContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.DirContext]

    @Override
    public Class<DirContext> createNewSUT() {
        return DirContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.DirContext]

}
