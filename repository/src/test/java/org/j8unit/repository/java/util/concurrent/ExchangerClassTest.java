package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Exchanger;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Exchanger} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.ExchangerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ExchangerClassTest
implements ExchangerClassTests<Exchanger> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Exchanger]

    @Override
    public Class<Exchanger> createNewSUT() {
        return Exchanger.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.concurrent.Exchanger#Exchanger()
     * public java.util.concurrent.Exchanger()}.
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
    public void create_Exchanger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Exchanger sut = new Exchanger();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Exchanger]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Exchanger]

}
