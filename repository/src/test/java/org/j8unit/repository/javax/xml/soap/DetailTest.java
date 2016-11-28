package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Detail;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Detail} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.soap.DetailTests}).
 */
@RunWith(J8Unit4.class)
public class DetailTest
implements DetailTests<Detail> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.Detail]

    @Override
    public Detail createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.Detail], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.Detail]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.Detail]

}
