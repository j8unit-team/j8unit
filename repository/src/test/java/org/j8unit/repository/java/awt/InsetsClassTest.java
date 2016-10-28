package org.j8unit.repository.java.awt;

import java.awt.Insets;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InsetsClassTest
implements org.j8unit.repository.java.awt.InsetsClassTests<Insets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Insets]

    @Override
    public Class<Insets> createNewSUT() {
        return Insets.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Insets#Insets(int, int, int, int) public
     * java.awt.Insets(int,int,int,int)}.
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
    public void create_Insets_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Insets sut = null; // = new Insets(int, int, int, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Insets]

}
