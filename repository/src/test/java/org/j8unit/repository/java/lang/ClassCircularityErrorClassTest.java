package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassCircularityErrorClassTest
implements org.j8unit.repository.java.lang.ClassCircularityErrorClassTests<java.lang.ClassCircularityError> {

    @Override
    public Class<java.lang.ClassCircularityError> createNewSUT() {
        return java.lang.ClassCircularityError.class;
    }

}
