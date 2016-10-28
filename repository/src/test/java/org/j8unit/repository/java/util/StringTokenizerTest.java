package org.j8unit.repository.java.util;

import java.util.StringTokenizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringTokenizerTest
implements org.j8unit.repository.java.util.StringTokenizerTests<StringTokenizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.StringTokenizer]

    @Override
    public StringTokenizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.StringTokenizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.StringTokenizer]

}
