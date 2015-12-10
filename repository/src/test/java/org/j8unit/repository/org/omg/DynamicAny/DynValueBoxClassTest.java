package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueBoxClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueBoxClassTests<org.omg.DynamicAny.DynValueBox> {

    @Override
    public Class<org.omg.DynamicAny.DynValueBox> createNewSUT() {
        return org.omg.DynamicAny.DynValueBox.class;
    }

}
