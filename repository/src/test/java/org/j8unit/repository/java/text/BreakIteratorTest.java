package org.j8unit.repository.java.text;

import java.text.BreakIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BreakIteratorTest
implements org.j8unit.repository.java.text.BreakIteratorTests<BreakIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.BreakIterator]

    @Override
    public BreakIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.BreakIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.BreakIterator]

}
