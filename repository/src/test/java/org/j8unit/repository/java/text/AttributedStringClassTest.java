package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributedStringClassTest
implements org.j8unit.repository.java.text.AttributedStringClassTests<java.text.AttributedString> {

    @Override
    public Class<java.text.AttributedString> createNewSUT() {
        return java.text.AttributedString.class;
    }

}
