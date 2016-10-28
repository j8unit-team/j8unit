package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueBox;

@RunWith(J8Unit4.class)
public class DynValueBoxClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueBoxClassTests<DynValueBox> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueBox]

    @Override
    public Class<DynValueBox> createNewSUT() {
        return DynValueBox.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueBox]

}
