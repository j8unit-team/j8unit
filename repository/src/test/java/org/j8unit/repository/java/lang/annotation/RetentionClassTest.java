package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Retention;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RetentionClassTest
implements org.j8unit.repository.java.lang.annotation.RetentionClassTests<Retention> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Retention]

    @Override
    public Class<Retention> createNewSUT() {
        return Retention.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Retention]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Retention]

}
