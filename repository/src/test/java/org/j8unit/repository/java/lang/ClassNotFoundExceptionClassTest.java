package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassNotFoundExceptionClassTest
implements org.j8unit.repository.java.lang.ClassNotFoundExceptionClassTests<ClassNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ClassNotFoundException]

    @Override
    public Class<ClassNotFoundException> createNewSUT() {
        return ClassNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ClassNotFoundException#ClassNotFoundException(String, Throwable) public
     * java.lang.ClassNotFoundException(java.lang.String,java.lang.Throwable)}.
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
    public void create_ClassNotFoundException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ClassNotFoundException sut = null; // = new ClassNotFoundException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ClassNotFoundException#ClassNotFoundException(String) public
     * java.lang.ClassNotFoundException(java.lang.String)}.
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
    public void create_ClassNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ClassNotFoundException sut = null; // = new ClassNotFoundException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ClassNotFoundException#ClassNotFoundException()
     * public java.lang.ClassNotFoundException()}.
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
    public void create_ClassNotFoundException()
    throws Exception {
        // create new instance
        final ClassNotFoundException sut = new ClassNotFoundException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ClassNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ClassNotFoundException]

}
