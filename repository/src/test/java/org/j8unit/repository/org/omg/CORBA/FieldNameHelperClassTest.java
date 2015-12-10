package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FieldNameHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.FieldNameHelperClassTests<org.omg.CORBA.FieldNameHelper> {

    @Override
    public Class<org.omg.CORBA.FieldNameHelper> createNewSUT() {
        return org.omg.CORBA.FieldNameHelper.class;
    }

}
