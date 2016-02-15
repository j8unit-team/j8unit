package org.j8unit.repository.javax.xml.bind.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.helpers.ParseConversionEventImpl class
 * javax.xml.bind.helpers.ParseConversionEventImpl}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ParseConversionEventImplClassTests}.
 * </p>
 *
 * @see javax.xml.bind.helpers.ParseConversionEventImpl class javax.xml.bind.helpers.ParseConversionEventImpl (the
 *      hereby targeted class-under-test class)
 * @see ParseConversionEventImplClassTests ParseConversionEventImplClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParseConversionEventImplTests<SUT extends javax.xml.bind.helpers.ParseConversionEventImpl>
extends org.j8unit.repository.javax.xml.bind.ParseConversionEventTests<SUT>, ValidationEventImplTests<SUT> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.xml.bind.ValidationEvent#getMessage() interface javax.xml.bind.ValidationEvent}</li>
     * <li>{@linkplain javax.xml.bind.helpers.ValidationEventImpl#getMessage() class
     * javax.xml.bind.helpers.ValidationEventImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.xml.bind.ValidationEvent#getLocator() interface javax.xml.bind.ValidationEvent}</li>
     * <li>{@linkplain javax.xml.bind.helpers.ValidationEventImpl#getLocator() class
     * javax.xml.bind.helpers.ValidationEventImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLocator()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.xml.bind.ValidationEvent#getSeverity() interface javax.xml.bind.ValidationEvent}</li>
     * <li>{@linkplain javax.xml.bind.helpers.ValidationEventImpl#getSeverity() class
     * javax.xml.bind.helpers.ValidationEventImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSeverity()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.xml.bind.ValidationEvent#getLinkedException() interface javax.xml.bind.ValidationEvent}
     * </li>
     * <li>{@linkplain javax.xml.bind.helpers.ValidationEventImpl#getLinkedException() class
     * javax.xml.bind.helpers.ValidationEventImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLinkedException()
    throws Exception {
    }

}
