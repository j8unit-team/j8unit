package org.j8unit.repository.java.text;

import java.text.ChoiceFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceFormatTest
implements org.j8unit.repository.java.text.ChoiceFormatTests<ChoiceFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.ChoiceFormat]

    @Override
    public ChoiceFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.ChoiceFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.ChoiceFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.ChoiceFormat]

}
