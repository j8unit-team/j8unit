package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeKindClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeKindClassTests<javax.lang.model.type.TypeKind> {

    @Override
    public Class<javax.lang.model.type.TypeKind> createNewSUT() {
        return javax.lang.model.type.TypeKind.class;
    }

}
