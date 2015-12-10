package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GenericDeclarationClassTest
implements org.j8unit.repository.java.lang.reflect.GenericDeclarationClassTests<java.lang.reflect.GenericDeclaration> {

    @Override
    public Class<java.lang.reflect.GenericDeclaration> createNewSUT() {
        return java.lang.reflect.GenericDeclaration.class;
    }

}
