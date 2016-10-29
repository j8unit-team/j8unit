package org.j8unit.repository.java.awt;

import java.awt.JobAttributes;
import java.awt.JobAttributes.DefaultSelectionType;
import java.awt.JobAttributes.DestinationType;
import java.awt.JobAttributes.DialogType;
import java.awt.JobAttributes.MultipleDocumentHandlingType;
import java.awt.JobAttributes.SidesType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobAttributesClassTest
implements org.j8unit.repository.java.awt.JobAttributesClassTests<JobAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes]

    @Override
    public Class<JobAttributes> createNewSUT() {
        return JobAttributes.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.JobAttributes#JobAttributes(java.awt.JobAttributes) public
     * java.awt.JobAttributes(java.awt.JobAttributes)}.
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
    public void create_JobAttributes_JobAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobAttributes sut = null; // = new JobAttributes(java.awt.JobAttributes);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.JobAttributes#JobAttributes(int, java.awt.JobAttributes.DefaultSelectionType, java.awt.JobAttributes.DestinationType, java.awt.JobAttributes.DialogType, String, int, int, java.awt.JobAttributes.MultipleDocumentHandlingType, int[][], String, java.awt.JobAttributes.SidesType)
     * public
     * java.awt.JobAttributes(int,java.awt.JobAttributes$DefaultSelectionType,java.awt.JobAttributes$DestinationType,java.awt.JobAttributes$DialogType,java.lang.String,int,int,java.awt.JobAttributes$MultipleDocumentHandlingType,int[][],java.lang.String,java.awt.JobAttributes$SidesType)}.
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
    public void create_JobAttributes_int_DefaultSelectionType_DestinationType_DialogType_String_int_int_MultipleDocumentHandlingType_intArrayArray_String_SidesType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobAttributes sut = null; // = new JobAttributes(int, java.awt.JobAttributes.DefaultSelectionType,
                                        // java.awt.JobAttributes.DestinationType, java.awt.JobAttributes.DialogType,
                                        // String, int, int, java.awt.JobAttributes.MultipleDocumentHandlingType,
                                        // int[][], String, java.awt.JobAttributes.SidesType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.JobAttributes#JobAttributes() public
     * java.awt.JobAttributes()}.
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
    public void create_JobAttributes()
    throws Exception {
        // create new instance
        final JobAttributes sut = new JobAttributes();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes]

    @RunWith(J8Unit4.class)
    public static class SidesTypeClassTest
    implements org.j8unit.repository.java.awt.JobAttributesClassTests.SidesTypeClassTests<SidesType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$SidesType]

        @Override
        public Class<SidesType> createNewSUT() {
            return SidesType.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$SidesType]

    }

    @RunWith(J8Unit4.class)
    public static class DialogTypeClassTest
    implements org.j8unit.repository.java.awt.JobAttributesClassTests.DialogTypeClassTests<DialogType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DialogType]

        @Override
        public Class<DialogType> createNewSUT() {
            return DialogType.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DialogType]

    }

    @RunWith(J8Unit4.class)
    public static class DestinationTypeClassTest
    implements org.j8unit.repository.java.awt.JobAttributesClassTests.DestinationTypeClassTests<DestinationType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DestinationType]

        @Override
        public Class<DestinationType> createNewSUT() {
            return DestinationType.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DestinationType]

    }

    @RunWith(J8Unit4.class)
    public static class MultipleDocumentHandlingTypeClassTest
    implements org.j8unit.repository.java.awt.JobAttributesClassTests.MultipleDocumentHandlingTypeClassTests<MultipleDocumentHandlingType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

        @Override
        public Class<MultipleDocumentHandlingType> createNewSUT() {
            return MultipleDocumentHandlingType.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

    }

    @RunWith(J8Unit4.class)
    public static class DefaultSelectionTypeClassTest
    implements org.j8unit.repository.java.awt.JobAttributesClassTests.DefaultSelectionTypeClassTests<DefaultSelectionType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DefaultSelectionType]

        @Override
        public Class<DefaultSelectionType> createNewSUT() {
            return DefaultSelectionType.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DefaultSelectionType]

    }

}
