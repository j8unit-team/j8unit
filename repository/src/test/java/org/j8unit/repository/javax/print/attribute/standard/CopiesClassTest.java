package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Copies;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Copies} (by simply reusing the J8Unit
 * test interface {@link CopiesClassTests}).
 */

@RunWith(J8Unit4.class)
public class CopiesClassTest
implements CopiesClassTests<Copies> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Copies]

    @Override
    public Class<Copies> createNewSUT() {
        return Copies.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.Copies#Copies(int) public javax.print.attribute.standard.Copies(int)}.
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
    public void create_Copies_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Copies sut = null; // = new Copies(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Copies]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Copies]

}
