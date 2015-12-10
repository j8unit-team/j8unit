package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.NullTypeClassTests<javax.lang.model.type.NullType> {

    @Override
    public Class<javax.lang.model.type.NullType> createNewSUT() {
        return javax.lang.model.type.NullType.class;
    }

}
