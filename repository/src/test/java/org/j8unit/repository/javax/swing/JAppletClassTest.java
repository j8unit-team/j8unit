package org.j8unit.repository.javax.swing;

import javax.swing.JApplet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JApplet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.JAppletClassTests}).
 */
@RunWith(J8Unit4.class)
public class JAppletClassTest
implements JAppletClassTests<JApplet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JApplet]

    @Override
    public Class<JApplet> createNewSUT() {
        return JApplet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JApplet#JApplet() public
     * javax.swing.JApplet() throws java.awt.HeadlessException}.
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
    public void create_JApplet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JApplet sut = new JApplet();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JApplet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JApplet]

}
