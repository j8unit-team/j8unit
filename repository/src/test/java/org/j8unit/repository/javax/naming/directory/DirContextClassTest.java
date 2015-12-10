package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirContextClassTest
implements org.j8unit.repository.javax.naming.directory.DirContextClassTests<javax.naming.directory.DirContext> {

    @Override
    public Class<javax.naming.directory.DirContext> createNewSUT() {
        return javax.naming.directory.DirContext.class;
    }

}
