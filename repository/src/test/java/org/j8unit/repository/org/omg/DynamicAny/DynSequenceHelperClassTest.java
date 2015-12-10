package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynSequenceHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynSequenceHelperClassTests<org.omg.DynamicAny.DynSequenceHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynSequenceHelper> createNewSUT() {
        return org.omg.DynamicAny.DynSequenceHelper.class;
    }

}
