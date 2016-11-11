package org.j8unit.repository.javax.management.loading;

import javax.management.loading.MLetContent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MLetContent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.loading.MLetContentTests}).
 */

@RunWith(J8Unit4.class)
public class MLetContentTest
implements MLetContentTests<MLetContent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLetContent]

    @Override
    public MLetContent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.loading.MLetContent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.MLetContent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.MLetContent]

}
