package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrimitiveTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.PrimitiveTypeClassTests<javax.lang.model.type.PrimitiveType> {

    @Override
    public Class<javax.lang.model.type.PrimitiveType> createNewSUT() {
        return javax.lang.model.type.PrimitiveType.class;
    }

}
