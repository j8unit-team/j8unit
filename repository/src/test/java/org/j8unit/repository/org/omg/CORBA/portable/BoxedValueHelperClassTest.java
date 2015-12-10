package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoxedValueHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperClassTests<org.omg.CORBA.portable.BoxedValueHelper> {

    @Override
    public Class<org.omg.CORBA.portable.BoxedValueHelper> createNewSUT() {
        return org.omg.CORBA.portable.BoxedValueHelper.class;
    }

}
