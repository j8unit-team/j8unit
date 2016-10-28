package org.j8unit.repository.javax.xml.bind;

import static org.junit.Assert.fail;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Marshaller.Listener;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.MarshallerClassTests<Marshaller> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Marshaller]

    @Override
    public Class<Marshaller> createNewSUT() {
        return Marshaller.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Marshaller]

    @RunWith(J8Unit4.class)
    public static class ListenerClassTest
    implements org.j8unit.repository.javax.xml.bind.MarshallerClassTests.ListenerClassTests<Listener> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Marshaller$Listener]

        @Override
        public Class<Listener> createNewSUT() {
            return Listener.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link Listener#Listener() public
         * javax.xml.bind.Marshaller$Listener()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_Listener()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Marshaller$Listener]

    }

}
