package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeclaredTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.DeclaredTypeClassTests<javax.lang.model.type.DeclaredType> {

    @Override
    public Class<javax.lang.model.type.DeclaredType> createNewSUT() {
        return javax.lang.model.type.DeclaredType.class;
    }

}
