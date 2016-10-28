package org.j8unit.repository.java.text;

import java.text.RuleBasedCollator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuleBasedCollatorClassTest
implements org.j8unit.repository.java.text.RuleBasedCollatorClassTests<RuleBasedCollator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.RuleBasedCollator]

    @Override
    public Class<RuleBasedCollator> createNewSUT() {
        return RuleBasedCollator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.RuleBasedCollator#RuleBasedCollator(String) public java.text.RuleBasedCollator(java.lang.String)
     * throws java.text.ParseException}.
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
    public void create_RuleBasedCollator_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuleBasedCollator sut = null; // = new RuleBasedCollator(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.RuleBasedCollator]

}
