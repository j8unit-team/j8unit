package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericDeclaration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GenericDeclarationClassTest
implements org.j8unit.repository.java.lang.reflect.GenericDeclarationClassTests<GenericDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.GenericDeclaration]

    @Override
    public Class<GenericDeclaration> createNewSUT() {
        return GenericDeclaration.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.GenericDeclaration]

}
