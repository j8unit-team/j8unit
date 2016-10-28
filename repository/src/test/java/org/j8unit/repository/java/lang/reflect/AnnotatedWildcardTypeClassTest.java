package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedWildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedWildcardTypeClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedWildcardTypeClassTests<AnnotatedWildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedWildcardType]

    @Override
    public Class<AnnotatedWildcardType> createNewSUT() {
        return AnnotatedWildcardType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedWildcardType]

}
