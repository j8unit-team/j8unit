package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.UIManager class javax.swing.UIManager}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.UIManagerTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.UIManagerTests
 */
@Category(J8UnitRepository.class)
public abstract interface UIManagerClassTests<SUT extends Class<? extends javax.swing.UIManager>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.UIManager#UIManager() public javax.swing.UIManager()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UIManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.UIManager sut = null; // = new UIManager();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.UIManager> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.UIManager.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getBorder(java.lang.Object,java.util.Locale) public static
     * javax.swing.border.Border javax.swing.UIManager.getBorder(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorder_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getBorder(java.lang.Object) public static javax.swing.border.Border
     * javax.swing.UIManager.getBorder(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorder_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getSystemLookAndFeelClassName() public static java.lang.String
     * javax.swing.UIManager.getSystemLookAndFeelClassName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystemLookAndFeelClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getInstalledLookAndFeels() public static
     * javax.swing.UIManager$LookAndFeelInfo[] javax.swing.UIManager.getInstalledLookAndFeels()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstalledLookAndFeels()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getDefaults() public static javax.swing.UIDefaults
     * javax.swing.UIManager.getDefaults()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaults()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getLookAndFeel() public static javax.swing.LookAndFeel
     * javax.swing.UIManager.getLookAndFeel()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLookAndFeel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#removeAuxiliaryLookAndFeel(javax.swing.LookAndFeel) public static
     * boolean javax.swing.UIManager.removeAuxiliaryLookAndFeel(javax.swing.LookAndFeel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAuxiliaryLookAndFeel_LookAndFeel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#put(java.lang.Object,java.lang.Object) public static
     * java.lang.Object javax.swing.UIManager.put(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#get(java.lang.Object,java.util.Locale) public static
     * java.lang.Object javax.swing.UIManager.get(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#get(java.lang.Object) public static java.lang.Object
     * javax.swing.UIManager.get(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#setLookAndFeel(java.lang.String) public static void
     * javax.swing.UIManager.setLookAndFeel(java.lang.String) throws
     * java.lang.ClassNotFoundException,java.lang.InstantiationException,java.lang.IllegalAccessException,javax.swing.UnsupportedLookAndFeelException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLookAndFeel_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#setLookAndFeel(javax.swing.LookAndFeel) public static void
     * javax.swing.UIManager.setLookAndFeel(javax.swing.LookAndFeel) throws javax.swing.UnsupportedLookAndFeelException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLookAndFeel_LookAndFeel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getDimension(java.lang.Object,java.util.Locale) public static
     * java.awt.Dimension javax.swing.UIManager.getDimension(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDimension_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getDimension(java.lang.Object) public static java.awt.Dimension
     * javax.swing.UIManager.getDimension(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDimension_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#addAuxiliaryLookAndFeel(javax.swing.LookAndFeel) public static void
     * javax.swing.UIManager.addAuxiliaryLookAndFeel(javax.swing.LookAndFeel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAuxiliaryLookAndFeel_LookAndFeel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getCrossPlatformLookAndFeelClassName() public static
     * java.lang.String javax.swing.UIManager.getCrossPlatformLookAndFeelClassName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCrossPlatformLookAndFeelClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getBoolean(java.lang.Object) public static boolean
     * javax.swing.UIManager.getBoolean(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBoolean_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getBoolean(java.lang.Object,java.util.Locale) public static boolean
     * javax.swing.UIManager.getBoolean(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBoolean_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getAuxiliaryLookAndFeels() public static javax.swing.LookAndFeel[]
     * javax.swing.UIManager.getAuxiliaryLookAndFeels()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAuxiliaryLookAndFeels()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     * static void javax.swing.UIManager.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getPropertyChangeListeners() public static
     * java.beans.PropertyChangeListener[] javax.swing.UIManager.getPropertyChangeListeners()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getColor(java.lang.Object) public static java.awt.Color
     * javax.swing.UIManager.getColor(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColor_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getColor(java.lang.Object,java.util.Locale) public static
     * java.awt.Color javax.swing.UIManager.getColor(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColor_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getString(java.lang.Object,java.util.Locale) public static
     * java.lang.String javax.swing.UIManager.getString(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getString_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getString(java.lang.Object) public static java.lang.String
     * javax.swing.UIManager.getString(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getString_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getInsets(java.lang.Object,java.util.Locale) public static
     * java.awt.Insets javax.swing.UIManager.getInsets(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInsets_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getInsets(java.lang.Object) public static java.awt.Insets
     * javax.swing.UIManager.getInsets(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInsets_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public static void javax.swing.UIManager.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getIcon(java.lang.Object) public static javax.swing.Icon
     * javax.swing.UIManager.getIcon(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIcon_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getIcon(java.lang.Object,java.util.Locale) public static
     * javax.swing.Icon javax.swing.UIManager.getIcon(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIcon_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getInt(java.lang.Object) public static int
     * javax.swing.UIManager.getInt(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInt_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getInt(java.lang.Object,java.util.Locale) public static int
     * javax.swing.UIManager.getInt(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInt_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.UIManager.getUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getLookAndFeelDefaults() public static javax.swing.UIDefaults
     * javax.swing.UIManager.getLookAndFeelDefaults()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLookAndFeelDefaults()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#installLookAndFeel(javax.swing.UIManager.LookAndFeelInfo) public
     * static void javax.swing.UIManager.installLookAndFeel(javax.swing.UIManager$LookAndFeelInfo)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installLookAndFeel_LookAndFeelInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#installLookAndFeel(java.lang.String,java.lang.String) public static
     * void javax.swing.UIManager.installLookAndFeel(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installLookAndFeel_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getFont(java.lang.Object,java.util.Locale) public static
     * java.awt.Font javax.swing.UIManager.getFont(java.lang.Object,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFont_Object_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#getFont(java.lang.Object) public static java.awt.Font
     * javax.swing.UIManager.getFont(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFont_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.UIManager#setInstalledLookAndFeels(javax.swing.UIManager.LookAndFeelInfo[])
     * public static void javax.swing.UIManager.setInstalledLookAndFeels(javax.swing.UIManager$LookAndFeelInfo[]) throws
     * java.lang.SecurityException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInstalledLookAndFeels_LookAndFeelInfoArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.UIManager$LookAndFeelInfo class javax.swing.UIManager$LookAndFeelInfo},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.UIManagerTests.LookAndFeelInfoTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.UIManagerTests.LookAndFeelInfoTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LookAndFeelInfoClassTests<SUT extends Class<? extends javax.swing.UIManager.LookAndFeelInfo>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.UIManager.LookAndFeelInfo#LookAndFeelInfo(java.lang.String,java.lang.String) public
         * javax.swing.UIManager$LookAndFeelInfo(java.lang.String,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LookAndFeelInfo_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIManager.LookAndFeelInfo sut = null; // = new
                                                                    // LookAndFeelInfo(java.lang.String,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.UIManager.LookAndFeelInfo> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.UIManager.LookAndFeelInfo.class.isAssignableFrom(sut));
        }

    }

}
