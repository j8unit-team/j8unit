package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnySeqHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnySeqHelperClassTests<org.omg.DynamicAny.DynAnySeqHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynAnySeqHelper> createNewSUT() {
        return org.omg.DynamicAny.DynAnySeqHelper.class;
    }

}
