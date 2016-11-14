package org.j8unit.repository.javax.swing.text;

import javax.swing.text.InternationalFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InternationalFormatter} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.InternationalFormatterClassTests}).
 */

@RunWith(J8Unit4.class)
public class InternationalFormatterClassTest
implements InternationalFormatterClassTests<InternationalFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.InternationalFormatter]

    @Override
    public Class<InternationalFormatter> createNewSUT() {
        return InternationalFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.InternationalFormatter#InternationalFormatter() public
     * javax.swing.text.InternationalFormatter()}.
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
    public void create_InternationalFormatter()
    throws Exception {
        // create new instance
        final InternationalFormatter sut = new InternationalFormatter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.InternationalFormatter#InternationalFormatter(java.text.Format) public
     * javax.swing.text.InternationalFormatter(java.text.Format)}.
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
    public void create_InternationalFormatter_Format()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternationalFormatter sut = null; // = new InternationalFormatter(java.text.Format);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.InternationalFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.InternationalFormatter]

}
