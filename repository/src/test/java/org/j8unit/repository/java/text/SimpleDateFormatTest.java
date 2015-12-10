package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDateFormatTest
implements org.j8unit.repository.java.text.SimpleDateFormatTests<java.text.SimpleDateFormat> {

    @Override
    public java.text.SimpleDateFormat createNewSUT() {
        return new java.text.SimpleDateFormat();
    }

}
