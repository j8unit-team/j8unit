package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VisibilityHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.VisibilityHelperClassTests<org.omg.CORBA.VisibilityHelper> {

    @Override
    public Class<org.omg.CORBA.VisibilityHelper> createNewSUT() {
        return org.omg.CORBA.VisibilityHelper.class;
    }

}
