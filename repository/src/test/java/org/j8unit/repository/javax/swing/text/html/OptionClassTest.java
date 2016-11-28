package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.Option;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Option} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.html.OptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class OptionClassTest
implements OptionClassTests<Option> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.Option]

    @Override
    public Class<Option> createNewSUT() {
        return Option.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.Option#Option(javax.swing.text.AttributeSet) public
     * javax.swing.text.html.Option(javax.swing.text.AttributeSet)}.
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
    public void create_Option_AttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Option sut = null; // = new Option(javax.swing.text.AttributeSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.Option]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.Option]

}
