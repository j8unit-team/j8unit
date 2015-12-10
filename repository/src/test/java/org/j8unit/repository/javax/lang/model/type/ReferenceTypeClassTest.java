package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.ReferenceTypeClassTests<javax.lang.model.type.ReferenceType> {

    @Override
    public Class<javax.lang.model.type.ReferenceType> createNewSUT() {
        return javax.lang.model.type.ReferenceType.class;
    }

}
