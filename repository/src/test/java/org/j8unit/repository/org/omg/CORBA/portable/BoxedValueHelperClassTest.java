package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.BoxedValueHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BoxedValueHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperClassTests}).
 */
@RunWith(J8Unit4.class)
public class BoxedValueHelperClassTest
implements BoxedValueHelperClassTests<BoxedValueHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.BoxedValueHelper]

    @Override
    public Class<BoxedValueHelper> createNewSUT() {
        return BoxedValueHelper.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.BoxedValueHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.BoxedValueHelper]

}
