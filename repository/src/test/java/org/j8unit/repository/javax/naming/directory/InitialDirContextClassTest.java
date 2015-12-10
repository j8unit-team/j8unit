package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialDirContextClassTest
implements org.j8unit.repository.javax.naming.directory.InitialDirContextClassTests<javax.naming.directory.InitialDirContext> {

    @Override
    public Class<javax.naming.directory.InitialDirContext> createNewSUT() {
        return javax.naming.directory.InitialDirContext.class;
    }

}
