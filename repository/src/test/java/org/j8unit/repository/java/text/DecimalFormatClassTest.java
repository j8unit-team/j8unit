package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DecimalFormatClassTest
implements org.j8unit.repository.java.text.DecimalFormatClassTests<java.text.DecimalFormat> {

    @Override
    public Class<java.text.DecimalFormat> createNewSUT() {
        return java.text.DecimalFormat.class;
    }

}