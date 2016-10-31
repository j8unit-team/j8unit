package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialJavaObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialJavaObjectClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialJavaObjectClassTests<SerialJavaObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialJavaObject]

    @Override
    public Class<SerialJavaObject> createNewSUT() {
        return SerialJavaObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialJavaObject#SerialJavaObject(Object) public
     * javax.sql.rowset.serial.SerialJavaObject(java.lang.Object) throws javax.sql.rowset.serial.SerialException}.
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
    public void create_SerialJavaObject_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialJavaObject sut = null; // = new SerialJavaObject(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.serial.SerialJavaObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialJavaObject]

}
