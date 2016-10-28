package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericDeclaration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GenericDeclarationTest
implements org.j8unit.repository.java.lang.reflect.GenericDeclarationTests<GenericDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.GenericDeclaration]

    @Override
    public GenericDeclaration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.GenericDeclaration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.GenericDeclaration]

}
