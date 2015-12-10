package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassCircularityErrorTest
implements org.j8unit.repository.java.lang.ClassCircularityErrorTests<java.lang.ClassCircularityError> {

    @Override
    public java.lang.ClassCircularityError createNewSUT() {
        return new java.lang.ClassCircularityError();
    }

}
