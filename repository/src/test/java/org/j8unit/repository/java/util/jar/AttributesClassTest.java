package org.j8unit.repository.java.util.jar;

import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attributes} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.jar.AttributesClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributesClassTest
implements AttributesClassTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Attributes]

    @Override
    public Class<Attributes> createNewSUT() {
        return Attributes.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.jar.Attributes#Attributes(java.util.jar.Attributes) public
     * java.util.jar.Attributes(java.util.jar.Attributes)}.
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
    public void create_Attributes_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attributes sut = null; // = new Attributes(java.util.jar.Attributes);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.jar.Attributes#Attributes(int) public
     * java.util.jar.Attributes(int)}.
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
    public void create_Attributes_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attributes sut = null; // = new Attributes(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.jar.Attributes#Attributes() public
     * java.util.jar.Attributes()}.
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
    public void create_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attributes sut = new Attributes();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.jar.Attributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Attributes]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Name} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.util.jar.AttributesClassTests.NameClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class NameClassTest
    implements NameClassTests<Name> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Attributes$Name]

        @Override
        public Class<Name> createNewSUT() {
            return Name.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link java.util.jar.Attributes.Name#Name(String)
         * public java.util.jar.Attributes$Name(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Name_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Name sut = null; // = new Name(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.jar.Attributes$Name]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Attributes$Name]

    }

}
