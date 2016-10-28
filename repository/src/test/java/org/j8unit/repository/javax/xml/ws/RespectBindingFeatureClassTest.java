package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.RespectBindingFeature;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RespectBindingFeatureClassTest
implements org.j8unit.repository.javax.xml.ws.RespectBindingFeatureClassTests<RespectBindingFeature> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.RespectBindingFeature]

    @Override
    public Class<RespectBindingFeature> createNewSUT() {
        return RespectBindingFeature.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.RespectBindingFeature#RespectBindingFeature() public javax.xml.ws.RespectBindingFeature()}.
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
    public void create_RespectBindingFeature()
    throws Exception {
        // create new instance
        final RespectBindingFeature sut = new RespectBindingFeature();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.RespectBindingFeature#RespectBindingFeature(boolean) public
     * javax.xml.ws.RespectBindingFeature(boolean)}.
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
    public void create_RespectBindingFeature_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RespectBindingFeature sut = null; // = new RespectBindingFeature(boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.RespectBindingFeature]

}
