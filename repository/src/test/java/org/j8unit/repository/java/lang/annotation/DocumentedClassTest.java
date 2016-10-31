package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Documented;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentedClassTest
implements org.j8unit.repository.java.lang.annotation.DocumentedClassTests<Documented> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Documented]

    @Override
    public Class<Documented> createNewSUT() {
        return Documented.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Documented]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Documented]

}
