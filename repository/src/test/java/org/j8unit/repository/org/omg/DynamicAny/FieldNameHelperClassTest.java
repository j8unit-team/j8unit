package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FieldNameHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.FieldNameHelperClassTests<org.omg.DynamicAny.FieldNameHelper> {

    @Override
    public Class<org.omg.DynamicAny.FieldNameHelper> createNewSUT() {
        return org.omg.DynamicAny.FieldNameHelper.class;
    }

}
