package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BidiClassTest
implements org.j8unit.repository.java.text.BidiClassTests<java.text.Bidi> {

    @Override
    public Class<java.text.Bidi> createNewSUT() {
        return java.text.Bidi.class;
    }

}
