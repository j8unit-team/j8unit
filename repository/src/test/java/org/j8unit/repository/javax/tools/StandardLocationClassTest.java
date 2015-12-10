package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardLocationClassTest
implements org.j8unit.repository.javax.tools.StandardLocationClassTests<javax.tools.StandardLocation> {

    @Override
    public Class<javax.tools.StandardLocation> createNewSUT() {
        return javax.tools.StandardLocation.class;
    }

}
