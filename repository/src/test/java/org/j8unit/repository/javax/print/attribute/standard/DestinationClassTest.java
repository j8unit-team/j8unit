package org.j8unit.repository.javax.print.attribute.standard;

import java.net.URI;
import javax.print.attribute.standard.Destination;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestinationClassTest
implements org.j8unit.repository.javax.print.attribute.standard.DestinationClassTests<Destination> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Destination]

    @Override
    public Class<Destination> createNewSUT() {
        return Destination.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Destination#Destination(URI) public
     * javax.print.attribute.standard.Destination(java.net.URI)}.
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
    public void create_Destination_URI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Destination sut = null; // = new Destination(URI);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Destination]

}
