package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.BoxedValueHelper;

@RunWith(J8Unit4.class)
public class BoxedValueHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperClassTests<BoxedValueHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.BoxedValueHelper]

    @Override
    public Class<BoxedValueHelper> createNewSUT() {
        return BoxedValueHelper.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.BoxedValueHelper]

}
