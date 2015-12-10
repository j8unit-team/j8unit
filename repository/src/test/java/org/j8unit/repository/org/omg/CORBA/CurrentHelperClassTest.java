package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.CurrentHelperClassTests<org.omg.CORBA.CurrentHelper> {

    @Override
    public Class<org.omg.CORBA.CurrentHelper> createNewSUT() {
        return org.omg.CORBA.CurrentHelper.class;
    }

}
