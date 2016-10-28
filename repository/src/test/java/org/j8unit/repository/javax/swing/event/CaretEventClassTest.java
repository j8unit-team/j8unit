package org.j8unit.repository.javax.swing.event;

import static org.junit.Assert.fail;
import javax.swing.event.CaretEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CaretEventClassTest
implements org.j8unit.repository.javax.swing.event.CaretEventClassTests<CaretEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.CaretEvent]

    @Override
    public Class<CaretEvent> createNewSUT() {
        return CaretEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CaretEvent#CaretEvent(Object) public
     * javax.swing.event.CaretEvent(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_CaretEvent_Object()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.CaretEvent]

}
