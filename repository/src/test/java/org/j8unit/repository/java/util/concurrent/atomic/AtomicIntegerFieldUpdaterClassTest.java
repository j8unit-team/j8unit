package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AtomicIntegerFieldUpdaterClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerFieldUpdaterClassTests<AtomicIntegerFieldUpdater> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicIntegerFieldUpdater]

    @Override
    public Class<AtomicIntegerFieldUpdater> createNewSUT() {
        return AtomicIntegerFieldUpdater.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AtomicIntegerFieldUpdater#newUpdater(Class, String)
     * public static <U> java.util.concurrent.atomic.AtomicIntegerFieldUpdater
     * <U> java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(java.lang.Class<U>,java.lang.String)}.
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
    public void test_newUpdater_Class_String()
    throws Exception {
        // write some test for {@link AtomicIntegerFieldUpdater#newUpdater(Class, String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicIntegerFieldUpdater]

}
