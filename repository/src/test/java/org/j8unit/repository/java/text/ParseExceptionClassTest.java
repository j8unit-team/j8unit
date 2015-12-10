package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParseExceptionClassTest
implements org.j8unit.repository.java.text.ParseExceptionClassTests<java.text.ParseException> {

    @Override
    public Class<java.text.ParseException> createNewSUT() {
        return java.text.ParseException.class;
    }

}
