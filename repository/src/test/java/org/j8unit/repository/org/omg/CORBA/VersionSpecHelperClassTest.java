package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VersionSpecHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.VersionSpecHelperClassTests<org.omg.CORBA.VersionSpecHelper> {

    @Override
    public Class<org.omg.CORBA.VersionSpecHelper> createNewSUT() {
        return org.omg.CORBA.VersionSpecHelper.class;
    }

}
