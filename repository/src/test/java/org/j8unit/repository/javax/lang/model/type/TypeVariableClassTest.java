package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeVariableClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeVariableClassTests<javax.lang.model.type.TypeVariable> {

    @Override
    public Class<javax.lang.model.type.TypeVariable> createNewSUT() {
        return javax.lang.model.type.TypeVariable.class;
    }

}
