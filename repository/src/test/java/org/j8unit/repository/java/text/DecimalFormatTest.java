package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DecimalFormatTest
implements org.j8unit.repository.java.text.DecimalFormatTests<java.text.DecimalFormat> {

    @Override
    public java.text.DecimalFormat createNewSUT() {
        return new java.text.DecimalFormat();
    }

}
