package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharSequenceClassTest
implements org.j8unit.repository.java.lang.CharSequenceClassTests<java.lang.CharSequence> {

    @Override
    public Class<java.lang.CharSequence> createNewSUT() {
        return java.lang.CharSequence.class;
    }

}
