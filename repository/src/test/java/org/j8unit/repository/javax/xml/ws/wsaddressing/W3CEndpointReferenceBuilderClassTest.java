package org.j8unit.repository.javax.xml.ws.wsaddressing;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class W3CEndpointReferenceBuilderClassTest
implements org.j8unit.repository.javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilderClassTests<W3CEndpointReferenceBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder]

    @Override
    public Class<W3CEndpointReferenceBuilder> createNewSUT() {
        return W3CEndpointReferenceBuilder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link W3CEndpointReferenceBuilder#W3CEndpointReferenceBuilder() public
     * javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder()}.
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
    public void create_W3CEndpointReferenceBuilder()
    throws Exception {
        // create new instance
        final W3CEndpointReferenceBuilder sut = new W3CEndpointReferenceBuilder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder]

}
