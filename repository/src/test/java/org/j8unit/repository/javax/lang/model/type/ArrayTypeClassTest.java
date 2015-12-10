package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.ArrayTypeClassTests<javax.lang.model.type.ArrayType> {

    @Override
    public Class<javax.lang.model.type.ArrayType> createNewSUT() {
        return javax.lang.model.type.ArrayType.class;
    }

}
