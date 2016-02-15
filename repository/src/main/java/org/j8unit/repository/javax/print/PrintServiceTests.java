package org.j8unit.repository.javax.print;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.PrintService interface javax.print.PrintService}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PrintServiceClassTests}.
 * </p>
 *
 * @see javax.print.PrintService interface javax.print.PrintService (the hereby targeted class-under-test class)
 * @see PrintServiceClassTests PrintServiceClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceTests<SUT extends javax.print.PrintService>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintService#getSupportedAttributeValues(Class, javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract java.lang.Object javax.print.PrintService.getSupportedAttributeValues(java.lang.Class<? extends
     * javax.print.attribute.Attribute>,javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintService#getSupportedAttributeValues(Class, javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract java.lang.Object
     * javax.print.PrintService.getSupportedAttributeValues(java.lang.Class,javax.print.DocFlavor,javax.print.attribute.AttributeSet)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getSupportedAttributeValues(Class, javax.print.DocFlavor,
     *      javax.print.attribute.AttributeSet) public abstract java.lang.Object
     *      javax.print.PrintService.getSupportedAttributeValues(java.lang.Class,javax.print.DocFlavor,javax.print.
     *      attribute.AttributeSet) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedAttributeValues_Class_DocFlavor_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getName() public abstract java.lang.String
     * javax.print.PrintService.getName()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getName() public abstract java.lang.String
     * javax.print.PrintService.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getName() public abstract java.lang.String javax.print.PrintService.getName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getAttributes() public abstract
     * javax.print.attribute.PrintServiceAttributeSet javax.print.PrintService.getAttributes()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getAttributes() public abstract
     * javax.print.attribute.PrintServiceAttributeSet javax.print.PrintService.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getAttributes() public abstract javax.print.attribute.PrintServiceAttributeSet
     *      javax.print.PrintService.getAttributes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getServiceUIFactory() public abstract
     * javax.print.ServiceUIFactory javax.print.PrintService.getServiceUIFactory()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getServiceUIFactory() public abstract
     * javax.print.ServiceUIFactory javax.print.PrintService.getServiceUIFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getServiceUIFactory() public abstract javax.print.ServiceUIFactory
     *      javax.print.PrintService.getServiceUIFactory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServiceUIFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#isAttributeCategorySupported(Class) public abstract boolean
     * javax.print.PrintService.isAttributeCategorySupported(java.lang.Class<? extends
     * javax.print.attribute.Attribute>)}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#isAttributeCategorySupported(Class) public abstract boolean
     * javax.print.PrintService.isAttributeCategorySupported(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#isAttributeCategorySupported(Class) public abstract boolean
     *      javax.print.PrintService.isAttributeCategorySupported(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAttributeCategorySupported_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintService#isAttributeValueSupported(javax.print.attribute.Attribute, javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract boolean
     * javax.print.PrintService.isAttributeValueSupported(javax.print.attribute.Attribute,javax.print.DocFlavor,javax.print.attribute.AttributeSet)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintService#isAttributeValueSupported(javax.print.attribute.Attribute, javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract boolean
     * javax.print.PrintService.isAttributeValueSupported(javax.print.attribute.Attribute,javax.print.DocFlavor,javax.print.attribute.AttributeSet)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#isAttributeValueSupported(javax.print.attribute.Attribute, javax.print.DocFlavor,
     *      javax.print.attribute.AttributeSet) public abstract boolean
     *      javax.print.PrintService.isAttributeValueSupported(javax.print.attribute.Attribute,javax.print.DocFlavor,
     *      javax.print.attribute.AttributeSet) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAttributeValueSupported_Attribute_DocFlavor_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintService#addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     * public abstract void
     * javax.print.PrintService.addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintService#addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     * public abstract void
     * javax.print.PrintService.addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     *      public abstract void
     *      javax.print.PrintService.addPrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPrintServiceAttributeListener_PrintServiceAttributeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getSupportedDocFlavors() public abstract javax.print.DocFlavor[]
     * javax.print.PrintService.getSupportedDocFlavors()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getSupportedDocFlavors() public abstract javax.print.DocFlavor[]
     * javax.print.PrintService.getSupportedDocFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getSupportedDocFlavors() public abstract javax.print.DocFlavor[]
     *      javax.print.PrintService.getSupportedDocFlavors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedDocFlavors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getDefaultAttributeValue(Class) public abstract java.lang.Object
     * javax.print.PrintService.getDefaultAttributeValue(java.lang.Class<? extends javax.print.attribute.Attribute>)}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getDefaultAttributeValue(Class) public abstract java.lang.Object
     * javax.print.PrintService.getDefaultAttributeValue(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getDefaultAttributeValue(Class) public abstract java.lang.Object
     *      javax.print.PrintService.getDefaultAttributeValue(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultAttributeValue_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintService#getUnsupportedAttributes(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract javax.print.attribute.AttributeSet
     * javax.print.PrintService.getUnsupportedAttributes(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintService#getUnsupportedAttributes(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract javax.print.attribute.AttributeSet
     * javax.print.PrintService.getUnsupportedAttributes(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getUnsupportedAttributes(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     *      public abstract javax.print.attribute.AttributeSet
     *      javax.print.PrintService.getUnsupportedAttributes(javax.print.DocFlavor,javax.print.attribute.AttributeSet)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnsupportedAttributes_DocFlavor_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getAttribute(Class) public abstract <T> T
     * javax.print.PrintService.getAttribute(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getAttribute(Class) public abstract
     * javax.print.attribute.PrintServiceAttribute javax.print.PrintService.getAttribute(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getAttribute(Class) public abstract javax.print.attribute.PrintServiceAttribute
     *      javax.print.PrintService.getAttribute(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#getSupportedAttributeCategories() public abstract java.lang.Class
     * <?>[] javax.print.PrintService.getSupportedAttributeCategories()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#getSupportedAttributeCategories() public abstract
     * java.lang.Class[] javax.print.PrintService.getSupportedAttributeCategories()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#getSupportedAttributeCategories() public abstract java.lang.Class[]
     *      javax.print.PrintService.getSupportedAttributeCategories() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedAttributeCategories()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#createPrintJob() public abstract javax.print.DocPrintJob
     * javax.print.PrintService.createPrintJob()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#createPrintJob() public abstract javax.print.DocPrintJob
     * javax.print.PrintService.createPrintJob()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#createPrintJob() public abstract javax.print.DocPrintJob
     *      javax.print.PrintService.createPrintJob() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createPrintJob()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#equals(Object) public abstract boolean
     * javax.print.PrintService.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#equals(Object) public abstract boolean
     * javax.print.PrintService.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#equals(Object) public abstract boolean
     *      javax.print.PrintService.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#hashCode() public abstract int
     * javax.print.PrintService.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#hashCode() public abstract int
     * javax.print.PrintService.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#hashCode() public abstract int javax.print.PrintService.hashCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintService#isDocFlavorSupported(javax.print.DocFlavor) public abstract
     * boolean javax.print.PrintService.isDocFlavorSupported(javax.print.DocFlavor)}.
     *
     * <p>
     * Test method for {@link javax.print.PrintService#isDocFlavorSupported(javax.print.DocFlavor) public abstract
     * boolean javax.print.PrintService.isDocFlavorSupported(javax.print.DocFlavor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#isDocFlavorSupported(javax.print.DocFlavor) public abstract boolean
     *      javax.print.PrintService.isDocFlavorSupported(javax.print.DocFlavor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDocFlavorSupported_DocFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintService#removePrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     * public abstract void
     * javax.print.PrintService.removePrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintService#removePrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     * public abstract void
     * javax.print.PrintService.removePrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintService#removePrintServiceAttributeListener(javax.print.event.PrintServiceAttributeListener)
     *      public abstract void javax.print.PrintService.removePrintServiceAttributeListener(javax.print.event.
     *      PrintServiceAttributeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePrintServiceAttributeListener_PrintServiceAttributeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
