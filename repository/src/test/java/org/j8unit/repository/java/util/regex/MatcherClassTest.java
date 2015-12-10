package org.j8unit.repository.java.util.regex;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MatcherClassTest
implements org.j8unit.repository.java.util.regex.MatcherClassTests<java.util.regex.Matcher> {

    @Override
    public Class<java.util.regex.Matcher> createNewSUT() {
        return java.util.regex.Matcher.class;
    }

}
