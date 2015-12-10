package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatStyleClassTest
implements org.j8unit.repository.java.time.format.FormatStyleClassTests<java.time.format.FormatStyle> {

    @Override
    public Class<java.time.format.FormatStyle> createNewSUT() {
        return java.time.format.FormatStyle.class;
    }

}
