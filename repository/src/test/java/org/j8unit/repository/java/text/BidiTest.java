package org.j8unit.repository.java.text;

import java.text.Bidi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BidiTest
implements org.j8unit.repository.java.text.BidiTests<Bidi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Bidi]

    @Override
    public Bidi createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Bidi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Bidi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Bidi]

}
