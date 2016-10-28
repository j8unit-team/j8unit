package org.j8unit.repository.java.util;

import java.util.Formattable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormattableClassTest
implements org.j8unit.repository.java.util.FormattableClassTests<Formattable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Formattable]

    @Override
    public Class<Formattable> createNewSUT() {
        return Formattable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Formattable]

}
