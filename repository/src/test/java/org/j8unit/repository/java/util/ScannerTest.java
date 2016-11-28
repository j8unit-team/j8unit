package org.j8unit.repository.java.util;

import java.util.Scanner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Scanner} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.ScannerTests}).
 */
@RunWith(J8Unit4.class)
public class ScannerTest
implements ScannerTests<Scanner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Scanner]

    @Override
    public Scanner createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Scanner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Scanner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Scanner]

}
