package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SetOverrideTypeClassTest
implements org.j8unit.repository.org.omg.CORBA.SetOverrideTypeClassTests<org.omg.CORBA.SetOverrideType> {

    @Override
    public Class<org.omg.CORBA.SetOverrideType> createNewSUT() {
        return org.omg.CORBA.SetOverrideType.class;
    }

}
