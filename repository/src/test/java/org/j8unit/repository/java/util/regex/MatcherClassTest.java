package org.j8unit.repository.java.util.regex;

import java.util.regex.Matcher;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MatcherClassTest
implements org.j8unit.repository.java.util.regex.MatcherClassTests<Matcher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.regex.Matcher]

    @Override
    public Class<Matcher> createNewSUT() {
        return Matcher.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.regex.Matcher#quoteReplacement(String)
     * public static java.lang.String java.util.regex.Matcher.quoteReplacement(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_quoteReplacement_String()
    throws Exception {
        // write some test for {@link java.util.regex.Matcher#quoteReplacement(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.regex.Matcher]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.regex.Matcher]

}
