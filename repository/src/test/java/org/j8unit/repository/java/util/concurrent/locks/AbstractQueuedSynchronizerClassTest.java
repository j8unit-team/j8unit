package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractQueuedSynchronizerClassTest
implements org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests<AbstractQueuedSynchronizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.AbstractQueuedSynchronizer]

    @Override
    public Class<AbstractQueuedSynchronizer> createNewSUT() {
        return AbstractQueuedSynchronizer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.AbstractQueuedSynchronizer]

    @RunWith(J8Unit4.class)
    public static class ConditionObjectClassTest
    implements org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests.ConditionObjectClassTests<ConditionObject> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject]

        @Override
        public Class<ConditionObject> createNewSUT() {
            return ConditionObject.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#ConditionObject(java.util.concurrent.locks.AbstractQueuedSynchronizer)
         * public
         * java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject(java.util.concurrent.locks.AbstractQueuedSynchronizer)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ConditionObject_AbstractQueuedSynchronizer()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ConditionObject sut = null; // = new
                                              // ConditionObject(java.util.concurrent.locks.AbstractQueuedSynchronizer);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject]

    }

}
