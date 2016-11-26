package org.j8unit.repository.javax.annotation;

import javax.annotation.PreDestroy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PreDestroy} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.PreDestroyTests}).
 */
@RunWith(J8Unit4.class)
public class PreDestroyTest
implements PreDestroyTests<PreDestroy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.PreDestroy]

    @Override
    public PreDestroy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.PreDestroy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.PreDestroy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.PreDestroy]

}
