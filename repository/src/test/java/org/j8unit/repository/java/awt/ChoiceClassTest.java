package org.j8unit.repository.java.awt;

import java.awt.Choice;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Choice} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.ChoiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChoiceClassTest
implements ChoiceClassTests<Choice> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Choice]

    @Override
    public Class<Choice> createNewSUT() {
        return Choice.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Choice#Choice() public
     * java.awt.Choice() throws java.awt.HeadlessException}.
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
    public void create_Choice()
    throws Exception {
        // create new instance
        final Choice sut = new Choice();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Choice]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Choice]

}
