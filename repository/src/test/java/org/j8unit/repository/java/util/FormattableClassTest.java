package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormattableClassTest
implements org.j8unit.repository.java.util.FormattableClassTests<java.util.Formattable> {

    @Override
    public Class<java.util.Formattable> createNewSUT() {
        return java.util.Formattable.class;
    }

}
