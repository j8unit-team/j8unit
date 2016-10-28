package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.DeclaredType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeclaredTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.DeclaredTypeClassTests<DeclaredType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.DeclaredType]

    @Override
    public Class<DeclaredType> createNewSUT() {
        return DeclaredType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.DeclaredType]

}
