package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Inherited;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InheritedClassTest
implements org.j8unit.repository.java.lang.annotation.InheritedClassTests<Inherited> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Inherited]

    @Override
    public Class<Inherited> createNewSUT() {
        return Inherited.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Inherited]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Inherited]

}
