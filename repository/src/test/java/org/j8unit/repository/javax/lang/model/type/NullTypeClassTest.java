package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.NullType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.NullTypeClassTests<NullType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.NullType]

    @Override
    public Class<NullType> createNewSUT() {
        return NullType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.NullType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.NullType]

}
