package org.j8unit.generator;

import static java.lang.String.format;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.analysis.TypeNatures.GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.RAW;
import static org.j8unit.generator.api.ModusOperandi.GENERIC_CLASS;
import static org.j8unit.generator.api.ModusOperandi.GENERIC_INSTANCE;
import static org.j8unit.generator.api.ModusOperandi.RAW_CLASS;
import static org.j8unit.generator.api.ModusOperandi.RAW_INSTANCE;
import static org.j8unit.generator.util.Iterators.replaceAll;
import static org.j8unit.generator.util.TypeAnalysis.classHierarchy;
import static org.junit.Assert.assertEquals;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Set;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource;
import javax.xml.stream.XMLEventReader;
import org.j8unit.generator.analysis.TypeNatures;
import org.j8unit.generator.api.ModusOperandi;
import org.j8unit.generator.api.render.ConciseOriginRenderer;
import org.j8unit.generator.api.render.OriginRenderer;
import org.junit.Test;

@SuppressWarnings("rawtypes")
public class RawtypesWarningTest {

    private static final OriginRenderer RENDERER = new ConciseOriginRenderer() {};

    @Test
    public void testWarningsOf_of_XMLEventReader()
    throws Exception {
        final Class<XMLEventReader> type = XMLEventReader.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(RAW, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(RAW_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(singleton("rawtypes"), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(singleton("rawtypes"), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals(format("@SuppressWarnings(\"rawtypes\")%n"), string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(RAW_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(emptySet(), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
    }

    /**
     * Top-level generic types
     *
     * INSTANCE: No warnings required.
     *
     * CLASS: Top-level generic types causes a Class<X> without X's generic parameters --> "rawtypes"!
     */
    @Test
    public void testWarningsOf_of_AbstractMap()
    throws Exception {
        final Class<AbstractMap> type = AbstractMap.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(GENERIC, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(GENERIC_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(emptySet(), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(GENERIC_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(singleton("rawtypes"), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(singleton("rawtypes"), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals(format("@SuppressWarnings(\"rawtypes\")%n"), string);
        }
    }

    /**
     * Enveloped generic type located within a top-level generic type
     *
     * INSTANCE: No warnings required.
     *
     * CLASS: Enveloped generic type located within a top-level generic type causes a Class<X> without X's generic
     * parameters --> "rawtypes"!
     *
     * But (!!!) because of the enveloping type, the warning would be duplicated and, thus, is unnecessary.
     */
    @Test
    public void testWarningsOf_of_SimpleImmutableEntry()
    throws Exception {
        final Class<SimpleImmutableEntry> type = SimpleImmutableEntry.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(GENERIC, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(GENERIC_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(emptySet(), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(GENERIC_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(singleton("rawtypes"), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
    }

    @Test
    public void testWarningsOf_of_SimpleEntry()
    throws Exception {
        final Class<SimpleEntry> type = SimpleEntry.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(GENERIC, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(GENERIC_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(emptySet(), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(GENERIC_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(singleton("rawtypes"), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
    }

    /**
     * Raw sub-types of generic types
     *
     * INSTANCE: "rawtypes"
     *
     * CLASS: Raw sub-types of generic types do not cause a Class<X> with missing generic parameters --> no warnings
     * required!
     */
    @Test
    public void testWarningsOf_of_BasicComboBoxRenderer()
    throws Exception {
        final Class<BasicComboBoxRenderer> type = BasicComboBoxRenderer.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(RAW, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(RAW_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(singleton("rawtypes"), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(singleton("rawtypes"), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals(format("@SuppressWarnings(\"rawtypes\")%n"), string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(RAW_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(emptySet(), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
    }

    /**
     * Enveloped raw sub-types.
     *
     * INSTANCE: "rawtypes"
     *
     * CLASS: Raw sub-types of generic types do not cause a Class<X> with missing generic parameters --> no warnings
     * required!
     */
    @Test
    public void testWarningsOf_of_UIResource()
    throws Exception {
        final Class<UIResource> type = UIResource.class;
        final TypeNatures nature = TypeNatures.natureOf(type);
        assertEquals(RAW, nature);
        {
            final ModusOperandi imo = ModusOperandi.valueOf(INSTANCE, type);
            assertEquals(RAW_INSTANCE, imo);
            final Set<String> iwarnings = imo.getWarnings();
            assertEquals(singleton("rawtypes"), iwarnings);
            final Set<String> ewarnings = imo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = imo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), INSTANCE::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
        {
            final ModusOperandi cmo = ModusOperandi.valueOf(CLASS, type);
            assertEquals(RAW_CLASS, cmo);
            final Set<String> cwarnings = cmo.getWarnings();
            assertEquals(emptySet(), cwarnings);
            final Set<String> ewarnings = cmo.getEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor));
            assertEquals(emptySet(), ewarnings);
            final String string = cmo.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), CLASS::modusOperandiFor), 0, RENDERER);
            assertEquals("", string);
        }
    }

}
