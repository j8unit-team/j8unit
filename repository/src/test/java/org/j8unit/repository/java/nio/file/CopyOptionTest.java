package org.j8unit.repository.java.nio.file;

import java.nio.file.CopyOption;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CopyOption} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.CopyOptionTests}).
 */
@RunWith(J8Unit4.class)
public class CopyOptionTest
implements CopyOptionTests<CopyOption> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.CopyOption]

    @Override
    public CopyOption createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.CopyOption], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.CopyOption]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.CopyOption]

}
