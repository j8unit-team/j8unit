package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Holder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class HolderClassTest
implements org.j8unit.repository.javax.xml.ws.HolderClassTests<Holder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Holder]

    @Override
    public Class<Holder> createNewSUT() {
        return Holder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Holder#Holder() public javax.xml.ws.Holder()}.
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
    public void create_Holder()
    throws Exception {
        // create new instance
        final Holder sut = new Holder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Holder#Holder(Object) public
     * javax.xml.ws.Holder(T)}.
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
    public void create_Holder_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Holder sut = null; // = new Holder(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Holder]

}
