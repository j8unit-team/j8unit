package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SetOverrideTypeHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.SetOverrideTypeHelperClassTests<org.omg.CORBA.SetOverrideTypeHelper> {

    @Override
    public Class<org.omg.CORBA.SetOverrideTypeHelper> createNewSUT() {
        return org.omg.CORBA.SetOverrideTypeHelper.class;
    }

}
