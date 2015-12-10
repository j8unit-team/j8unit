package org.j8unit.repository.java.util.regex;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PatternClassTest
implements org.j8unit.repository.java.util.regex.PatternClassTests<java.util.regex.Pattern> {

    @Override
    public Class<java.util.regex.Pattern> createNewSUT() {
        return java.util.regex.Pattern.class;
    }

}
