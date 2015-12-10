package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SearchControlsClassTest
implements org.j8unit.repository.javax.naming.directory.SearchControlsClassTests<javax.naming.directory.SearchControls> {

    @Override
    public Class<javax.naming.directory.SearchControls> createNewSUT() {
        return javax.naming.directory.SearchControls.class;
    }

}
