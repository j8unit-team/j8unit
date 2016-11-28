package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalScrollButton;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetalScrollButton} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalScrollButtonClassTests}).
 */
@RunWith(J8Unit4.class)
public class MetalScrollButtonClassTest
implements MetalScrollButtonClassTests<MetalScrollButton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalScrollButton]

    @Override
    public Class<MetalScrollButton> createNewSUT() {
        return MetalScrollButton.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.metal.MetalScrollButton#MetalScrollButton(int, int, boolean) public
     * javax.swing.plaf.metal.MetalScrollButton(int,int,boolean)}.
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
    public void create_MetalScrollButton_int_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MetalScrollButton sut = null; // = new MetalScrollButton(int, int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalScrollButton]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalScrollButton]

}
