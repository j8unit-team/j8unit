package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.StringSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StringSelection} (by simply reusing
 * the J8Unit test interface {@link StringSelectionTests}).
 */

@RunWith(J8Unit4.class)
public class StringSelectionTest
implements StringSelectionTests<StringSelection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.StringSelection]

    @Override
    public StringSelection createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.datatransfer.StringSelection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.StringSelection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.StringSelection]

}
