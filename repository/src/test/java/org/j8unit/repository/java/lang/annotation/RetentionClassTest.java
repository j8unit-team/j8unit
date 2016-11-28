package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Retention;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Retention} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.annotation.RetentionClassTests}).
 */
@RunWith(J8Unit4.class)
public class RetentionClassTest
implements RetentionClassTests<Retention> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Retention]

    @Override
    public Class<Retention> createNewSUT() {
        return Retention.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Retention]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Retention]

}
