package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.W3CDomHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class W3CDomHandlerClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.W3CDomHandlerClassTests<W3CDomHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.W3CDomHandler]

    @Override
    public Class<W3CDomHandler> createNewSUT() {
        return W3CDomHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.annotation.W3CDomHandler#W3CDomHandler(javax.xml.parsers.DocumentBuilder) public
     * javax.xml.bind.annotation.W3CDomHandler(javax.xml.parsers.DocumentBuilder)}.
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
    public void create_W3CDomHandler_DocumentBuilder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final W3CDomHandler sut = null; // = new W3CDomHandler(javax.xml.parsers.DocumentBuilder);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.annotation.W3CDomHandler#W3CDomHandler() public javax.xml.bind.annotation.W3CDomHandler()}.
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
    public void create_W3CDomHandler()
    throws Exception {
        // create new instance
        final W3CDomHandler sut = new W3CDomHandler();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.W3CDomHandler]

}
