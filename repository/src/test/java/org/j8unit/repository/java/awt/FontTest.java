package org.j8unit.repository.java.awt;

import java.awt.Font;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FontTest
implements org.j8unit.repository.java.awt.FontTests<Font> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Font]

    @Override
    public Font createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.Font], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Font]

}
