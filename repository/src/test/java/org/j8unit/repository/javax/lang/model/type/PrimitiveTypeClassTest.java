package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.PrimitiveType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrimitiveTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.PrimitiveTypeClassTests<PrimitiveType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.PrimitiveType]

    @Override
    public Class<PrimitiveType> createNewSUT() {
        return PrimitiveType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.PrimitiveType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.PrimitiveType]

}
