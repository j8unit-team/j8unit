package org.j8unit.repository.java.awt;

import java.awt.PageAttributes;
import java.awt.PageAttributes.ColorType;
import java.awt.PageAttributes.MediaType;
import java.awt.PageAttributes.OrientationRequestedType;
import java.awt.PageAttributes.OriginType;
import java.awt.PageAttributes.PrintQualityType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PageAttributes} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.PageAttributesClassTests}).
 */

@RunWith(J8Unit4.class)
public class PageAttributesClassTest
implements PageAttributesClassTests<PageAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes]

    @Override
    public Class<PageAttributes> createNewSUT() {
        return PageAttributes.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.PageAttributes#PageAttributes(java.awt.PageAttributes) public
     * java.awt.PageAttributes(java.awt.PageAttributes)}.
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
    public void create_PageAttributes_PageAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PageAttributes sut = null; // = new PageAttributes(java.awt.PageAttributes);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.PageAttributes#PageAttributes(java.awt.PageAttributes.ColorType, java.awt.PageAttributes.MediaType, java.awt.PageAttributes.OrientationRequestedType, java.awt.PageAttributes.OriginType, java.awt.PageAttributes.PrintQualityType, int[])
     * public
     * java.awt.PageAttributes(java.awt.PageAttributes$ColorType,java.awt.PageAttributes$MediaType,java.awt.PageAttributes$OrientationRequestedType,java.awt.PageAttributes$OriginType,java.awt.PageAttributes$PrintQualityType,int[])}.
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
    public void create_PageAttributes_ColorType_MediaType_OrientationRequestedType_OriginType_PrintQualityType_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PageAttributes sut = null; // = new PageAttributes(java.awt.PageAttributes.ColorType,
                                         // java.awt.PageAttributes.MediaType,
                                         // java.awt.PageAttributes.OrientationRequestedType,
                                         // java.awt.PageAttributes.OriginType,
                                         // java.awt.PageAttributes.PrintQualityType, int[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.PageAttributes#PageAttributes() public
     * java.awt.PageAttributes()}.
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
    public void create_PageAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PageAttributes sut = new PageAttributes();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PrintQualityType} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.PageAttributesClassTests.PrintQualityTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PrintQualityTypeClassTest
    implements PrintQualityTypeClassTests<PrintQualityType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes$PrintQualityType]

        @Override
        public Class<PrintQualityType> createNewSUT() {
            return PrintQualityType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes$PrintQualityType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes$PrintQualityType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ColorType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.PageAttributesClassTests.ColorTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ColorTypeClassTest
    implements ColorTypeClassTests<ColorType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes$ColorType]

        @Override
        public Class<ColorType> createNewSUT() {
            return ColorType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes$ColorType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes$ColorType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OriginType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.PageAttributesClassTests.OriginTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OriginTypeClassTest
    implements OriginTypeClassTests<OriginType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes$OriginType]

        @Override
        public Class<OriginType> createNewSUT() {
            return OriginType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes$OriginType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes$OriginType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MediaType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.PageAttributesClassTests.MediaTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MediaTypeClassTest
    implements MediaTypeClassTests<MediaType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes$MediaType]

        @Override
        public Class<MediaType> createNewSUT() {
            return MediaType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes$MediaType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes$MediaType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OrientationRequestedType} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.PageAttributesClassTests.OrientationRequestedTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OrientationRequestedTypeClassTest
    implements OrientationRequestedTypeClassTests<OrientationRequestedType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PageAttributes$OrientationRequestedType]

        @Override
        public Class<OrientationRequestedType> createNewSUT() {
            return OrientationRequestedType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PageAttributes$OrientationRequestedType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PageAttributes$OrientationRequestedType]

    }

}
