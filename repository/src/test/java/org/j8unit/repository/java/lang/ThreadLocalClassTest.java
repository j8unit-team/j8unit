package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ThreadLocalClassTest
implements org.j8unit.repository.java.lang.ThreadLocalClassTests<ThreadLocal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ThreadLocal]

    @Override
    public Class<ThreadLocal> createNewSUT() {
        return ThreadLocal.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ThreadLocal#ThreadLocal() public
     * java.lang.ThreadLocal()}.
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
    public void create_ThreadLocal()
    throws Exception {
        // create new instance
        final ThreadLocal sut = new ThreadLocal();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ThreadLocal#withInitial(java.util.function.Supplier)
     * public static <S> java.lang.ThreadLocal<S> java.lang.ThreadLocal.withInitial(java.util.function.Supplier<?
     * extends S>)}.
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
    public void test_withInitial_Supplier()
    throws Exception {
        // write some test for {@link ThreadLocal#withInitial(java.util.function.Supplier)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ThreadLocal]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ThreadLocal]

}
