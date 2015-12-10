package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceFormatClassTest
implements org.j8unit.repository.java.text.ChoiceFormatClassTests<java.text.ChoiceFormat> {

    @Override
    public Class<java.text.ChoiceFormat> createNewSUT() {
        return java.text.ChoiceFormat.class;
    }

}
