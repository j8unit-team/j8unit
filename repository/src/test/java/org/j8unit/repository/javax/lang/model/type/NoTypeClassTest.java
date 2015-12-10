package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.NoTypeClassTests<javax.lang.model.type.NoType> {

    @Override
    public Class<javax.lang.model.type.NoType> createNewSUT() {
        return javax.lang.model.type.NoType.class;
    }

}
