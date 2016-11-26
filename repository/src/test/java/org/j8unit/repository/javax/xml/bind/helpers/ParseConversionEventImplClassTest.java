package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.ParseConversionEventImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParseConversionEventImpl} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.helpers.ParseConversionEventImplClassTests}).
 */
@RunWith(J8Unit4.class)
public class ParseConversionEventImplClassTest
implements ParseConversionEventImplClassTests<ParseConversionEventImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.helpers.ParseConversionEventImpl]

    @Override
    public Class<ParseConversionEventImpl> createNewSUT() {
        return ParseConversionEventImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.helpers.ParseConversionEventImpl#ParseConversionEventImpl(int, String, javax.xml.bind.ValidationEventLocator)
     * public
     * javax.xml.bind.helpers.ParseConversionEventImpl(int,java.lang.String,javax.xml.bind.ValidationEventLocator)}.
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
    public void create_ParseConversionEventImpl_int_String_ValidationEventLocator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParseConversionEventImpl sut = null; // = new ParseConversionEventImpl(int, String,
                                                   // javax.xml.bind.ValidationEventLocator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.helpers.ParseConversionEventImpl#ParseConversionEventImpl(int, String, javax.xml.bind.ValidationEventLocator, Throwable)
     * public
     * javax.xml.bind.helpers.ParseConversionEventImpl(int,java.lang.String,javax.xml.bind.ValidationEventLocator,java.lang.Throwable)}.
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
    public void create_ParseConversionEventImpl_int_String_ValidationEventLocator_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParseConversionEventImpl sut = null; // = new ParseConversionEventImpl(int, String,
                                                   // javax.xml.bind.ValidationEventLocator, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.helpers.ParseConversionEventImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.helpers.ParseConversionEventImpl]

}
