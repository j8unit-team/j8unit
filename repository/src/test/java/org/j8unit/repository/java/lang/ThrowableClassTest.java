package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Throwable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ThrowableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ThrowableClassTest
implements ThrowableClassTests<Throwable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Throwable]

    @Override
    public Class<Throwable> createNewSUT() {
        return Throwable.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Throwable#Throwable(Throwable) public
     * java.lang.Throwable(java.lang.Throwable)}.
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
    public void create_Throwable_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Throwable sut = null; // = new Throwable(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Throwable#Throwable(String, Throwable) public
     * java.lang.Throwable(java.lang.String,java.lang.Throwable)}.
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
    public void create_Throwable_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Throwable sut = null; // = new Throwable(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Throwable#Throwable(String) public
     * java.lang.Throwable(java.lang.String)}.
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
    public void create_Throwable_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Throwable sut = null; // = new Throwable(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Throwable#Throwable() public
     * java.lang.Throwable()}.
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
    public void create_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Throwable sut = new Throwable();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Throwable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Throwable]

}
