package org.j8unit.repository.javax.annotation;

import javax.annotation.PreDestroy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PreDestroy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.annotation.PreDestroyClassTests}).
 */
@RunWith(J8Unit4.class)
public class PreDestroyClassTest
implements PreDestroyClassTests<PreDestroy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.PreDestroy]

    @Override
    public Class<PreDestroy> createNewSUT() {
        return PreDestroy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.PreDestroy]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.PreDestroy]

}
