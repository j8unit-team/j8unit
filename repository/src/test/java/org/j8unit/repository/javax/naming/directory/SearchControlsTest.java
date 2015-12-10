package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SearchControlsTest
implements org.j8unit.repository.javax.naming.directory.SearchControlsTests<javax.naming.directory.SearchControls> {

    @Override
    public javax.naming.directory.SearchControls createNewSUT() {
        return new javax.naming.directory.SearchControls();
    }

}
