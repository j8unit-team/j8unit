package org.j8unit.repository.java.util;

import java.util.Observable;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Observable} (by simply reusing the J8Unit
 * test interface {@link ObservableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObservableClassTest
implements ObservableClassTests<Observable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Observable]

    @Override
    public Class<Observable> createNewSUT() {
        return Observable.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Observable#Observable() public
     * java.util.Observable()}.
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
    public void create_Observable()
    throws Exception {
        // create new instance
        final Observable sut = new Observable();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Observable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Observable]

}
