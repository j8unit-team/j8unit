package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.Character.Subset;
import java.lang.Character.UnicodeBlock;
import java.lang.Character.UnicodeScript;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CharacterTest
implements org.j8unit.repository.java.lang.CharacterTests<Character> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Character]

    @Override
    public Character createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Character], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Character]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Character]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnicodeScriptTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeScriptTests<UnicodeScript> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Character$UnicodeScript]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(UnicodeScript.class);
        }

        @Parameter(0)
        public UnicodeScript sut;

        @Override
        public UnicodeScript createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Character$UnicodeScript]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Character$UnicodeScript]

    }

    @RunWith(J8Unit4.class)
    public static class SubsetTest
    implements org.j8unit.repository.java.lang.CharacterTests.SubsetTests<Subset> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Character$Subset]

        @Override
        public Subset createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Character.Subset], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Character$Subset]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Character$Subset]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnicodeBlockTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeBlockTests<UnicodeBlock> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Character$UnicodeBlock]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(UnicodeBlock.LIMBU, //
                                    UnicodeBlock.DESERET, //
                                    UnicodeBlock.LYCIAN, //
                                    UnicodeBlock.CURRENCY_SYMBOLS, //
                                    UnicodeBlock.GEORGIAN_SUPPLEMENT, //
                                    UnicodeBlock.LEPCHA, //
                                    UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT, //
                                    UnicodeBlock.TAKRI, //
                                    UnicodeBlock.KHAROSHTHI, //
                                    UnicodeBlock.INSCRIPTIONAL_PAHLAVI, //
                                    UnicodeBlock.MEETEI_MAYEK, //
                                    UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS, //
                                    UnicodeBlock.LISU, //
                                    UnicodeBlock.ENCLOSED_ALPHANUMERICS, //
                                    UnicodeBlock.HANGUL_SYLLABLES, //
                                    UnicodeBlock.SUNDANESE, //
                                    UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT, //
                                    UnicodeBlock.GEOMETRIC_SHAPES, //
                                    UnicodeBlock.CYPRIOT_SYLLABARY, //
                                    UnicodeBlock.SORA_SOMPENG, //
                                    UnicodeBlock.TIBETAN, //
                                    UnicodeBlock.BRAILLE_PATTERNS, //
                                    UnicodeBlock.KANA_SUPPLEMENT, //
                                    UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES, //
                                    UnicodeBlock.BAMUM_SUPPLEMENT, //
                                    UnicodeBlock.BASIC_LATIN, //
                                    UnicodeBlock.GOTHIC, //
                                    UnicodeBlock.OL_CHIKI, //
                                    UnicodeBlock.BAMUM, //
                                    UnicodeBlock.SAURASHTRA, //
                                    UnicodeBlock.LYDIAN, //
                                    UnicodeBlock.TAI_THAM, //
                                    UnicodeBlock.MISCELLANEOUS_SYMBOLS, //
                                    UnicodeBlock.ALCHEMICAL_SYMBOLS, //
                                    UnicodeBlock.NUMBER_FORMS, //
                                    UnicodeBlock.KHMER_SYMBOLS, //
                                    UnicodeBlock.CYRILLIC_EXTENDED_A, //
                                    UnicodeBlock.CYRILLIC_EXTENDED_B, //
                                    UnicodeBlock.CJK_STROKES, //
                                    UnicodeBlock.HANGUL_JAMO_EXTENDED_A, //
                                    UnicodeBlock.TAGBANWA, //
                                    UnicodeBlock.VAI, //
                                    UnicodeBlock.HANGUL_JAMO_EXTENDED_B, //
                                    UnicodeBlock.PLAYING_CARDS, //
                                    UnicodeBlock.OLD_ITALIC, //
                                    UnicodeBlock.TIFINAGH, //
                                    UnicodeBlock.ETHIOPIC, //
                                    UnicodeBlock.BOPOMOFO, //
                                    UnicodeBlock.GUJARATI, //
                                    UnicodeBlock.MEROITIC_HIEROGLYPHS, //
                                    UnicodeBlock.GREEK, //
                                    UnicodeBlock.MIAO, //
                                    UnicodeBlock.TAI_LE, //
                                    UnicodeBlock.KANBUN, //
                                    UnicodeBlock.DEVANAGARI_EXTENDED, //
                                    UnicodeBlock.BALINESE, //
                                    UnicodeBlock.TAMIL, //
                                    UnicodeBlock.INSCRIPTIONAL_PARTHIAN, //
                                    UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS, //
                                    UnicodeBlock.ARROWS, //
                                    UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A, //
                                    UnicodeBlock.MANDAIC, //
                                    UnicodeBlock.CYRILLIC_SUPPLEMENTARY, //
                                    UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B, //
                                    UnicodeBlock.CARIAN, //
                                    UnicodeBlock.MALAYALAM, //
                                    UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, //
                                    UnicodeBlock.CJK_RADICALS_SUPPLEMENT, //
                                    UnicodeBlock.ORIYA, //
                                    UnicodeBlock.OLD_PERSIAN, //
                                    UnicodeBlock.HANUNOO, //
                                    UnicodeBlock.NKO, //
                                    UnicodeBlock.KATAKANA, //
                                    UnicodeBlock.PRIVATE_USE_AREA, //
                                    UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT, //
                                    UnicodeBlock.REJANG, //
                                    UnicodeBlock.TAGS, //
                                    UnicodeBlock.EGYPTIAN_HIEROGLYPHS, //
                                    UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS, //
                                    UnicodeBlock.OLD_TURKIC, //
                                    UnicodeBlock.DOMINO_TILES, //
                                    UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS, //
                                    UnicodeBlock.IMPERIAL_ARAMAIC, //
                                    UnicodeBlock.BLOCK_ELEMENTS, //
                                    UnicodeBlock.COPTIC, //
                                    UnicodeBlock.MAHJONG_TILES, //
                                    UnicodeBlock.MATHEMATICAL_OPERATORS, //
                                    UnicodeBlock.SYLOTI_NAGRI, //
                                    UnicodeBlock.BOPOMOFO_EXTENDED, //
                                    UnicodeBlock.IPA_EXTENSIONS, //
                                    UnicodeBlock.SHARADA, //
                                    UnicodeBlock.GENERAL_PUNCTUATION, //
                                    UnicodeBlock.MODIFIER_TONE_LETTERS, //
                                    UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, //
                                    UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, //
                                    UnicodeBlock.KAITHI, //
                                    UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C, //
                                    UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D, //
                                    UnicodeBlock.COMMON_INDIC_NUMBER_FORMS, //
                                    UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B, //
                                    UnicodeBlock.HIRAGANA, //
                                    UnicodeBlock.PHAGS_PA, //
                                    UnicodeBlock.DINGBATS, //
                                    UnicodeBlock.CJK_COMPATIBILITY_FORMS, //
                                    UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A, //
                                    UnicodeBlock.MEETEI_MAYEK_EXTENSIONS, //
                                    UnicodeBlock.DEVANAGARI, //
                                    UnicodeBlock.RUNIC, //
                                    UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS, //
                                    UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, //
                                    UnicodeBlock.OLD_SOUTH_ARABIAN, //
                                    UnicodeBlock.SHAVIAN, //
                                    UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, //
                                    UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS, //
                                    UnicodeBlock.LATIN_EXTENDED_B, //
                                    UnicodeBlock.LATIN_EXTENDED_A, //
                                    UnicodeBlock.LATIN_EXTENDED_D, //
                                    UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS, //
                                    UnicodeBlock.LATIN_EXTENDED_C, //
                                    UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS, //
                                    UnicodeBlock.ARABIC_EXTENDED_A, //
                                    UnicodeBlock.PHONETIC_EXTENSIONS, //
                                    UnicodeBlock.SUPPLEMENTAL_ARROWS_A, //
                                    UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, //
                                    UnicodeBlock.SUPPLEMENTAL_ARROWS_B, //
                                    UnicodeBlock.KAYAH_LI, //
                                    UnicodeBlock.CONTROL_PICTURES, //
                                    UnicodeBlock.COMBINING_HALF_MARKS, //
                                    UnicodeBlock.HEBREW, //
                                    UnicodeBlock.MYANMAR_EXTENDED_A, //
                                    UnicodeBlock.THAI, //
                                    UnicodeBlock.VARIATION_SELECTORS, //
                                    UnicodeBlock.GLAGOLITIC, //
                                    UnicodeBlock.AEGEAN_NUMBERS, //
                                    UnicodeBlock.GREEK_EXTENDED, //
                                    UnicodeBlock.GEORGIAN, //
                                    UnicodeBlock.SUPPLEMENTAL_PUNCTUATION, //
                                    UnicodeBlock.ETHIOPIC_SUPPLEMENT, //
                                    UnicodeBlock.ANCIENT_GREEK_NUMBERS, //
                                    UnicodeBlock.MEROITIC_CURSIVE, //
                                    UnicodeBlock.VEDIC_EXTENSIONS, //
                                    UnicodeBlock.CJK_COMPATIBILITY, //
                                    UnicodeBlock.AVESTAN, //
                                    UnicodeBlock.MISCELLANEOUS_TECHNICAL, //
                                    UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS, //
                                    UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT, //
                                    UnicodeBlock.ARABIC_SUPPLEMENT, //
                                    UnicodeBlock.SMALL_FORM_VARIANTS, //
                                    UnicodeBlock.LINEAR_B_IDEOGRAMS, //
                                    UnicodeBlock.TAGALOG, //
                                    UnicodeBlock.LATIN_EXTENDED_ADDITIONAL, //
                                    UnicodeBlock.TAI_VIET, //
                                    UnicodeBlock.HANGUL_JAMO, //
                                    UnicodeBlock.BUHID, //
                                    UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT, //
                                    UnicodeBlock.LINEAR_B_SYLLABARY, //
                                    UnicodeBlock.TAI_XUAN_JING_SYMBOLS, //
                                    UnicodeBlock.MONGOLIAN, //
                                    UnicodeBlock.KANNADA, //
                                    UnicodeBlock.SAMARITAN, //
                                    UnicodeBlock.OGHAM, //
                                    UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, //
                                    UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS, //
                                    UnicodeBlock.BOX_DRAWING, //
                                    UnicodeBlock.ETHIOPIC_EXTENDED_A, //
                                    UnicodeBlock.BUGINESE, //
                                    UnicodeBlock.COUNTING_ROD_NUMERALS, //
                                    UnicodeBlock.BRAHMI, //
                                    UnicodeBlock.MYANMAR, //
                                    UnicodeBlock.RUMI_NUMERAL_SYMBOLS, //
                                    UnicodeBlock.COMBINING_DIACRITICAL_MARKS, //
                                    UnicodeBlock.ARABIC_PRESENTATION_FORMS_A, //
                                    UnicodeBlock.BATAK, //
                                    UnicodeBlock.HIGH_SURROGATES, //
                                    UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS, //
                                    UnicodeBlock.ANCIENT_SYMBOLS, //
                                    UnicodeBlock.YI_RADICALS, //
                                    UnicodeBlock.ETHIOPIC_EXTENDED, //
                                    UnicodeBlock.CUNEIFORM, //
                                    UnicodeBlock.LETTERLIKE_SYMBOLS, //
                                    UnicodeBlock.EMOTICONS, //
                                    UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION, //
                                    UnicodeBlock.ARABIC, //
                                    UnicodeBlock.ARABIC_PRESENTATION_FORMS_B, //
                                    UnicodeBlock.NEW_TAI_LUE, //
                                    UnicodeBlock.THAANA, //
                                    UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED, //
                                    UnicodeBlock.SYRIAC, //
                                    UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION, //
                                    UnicodeBlock.SURROGATES_AREA, //
                                    UnicodeBlock.YI_SYLLABLES, //
                                    UnicodeBlock.OSMANYA, //
                                    UnicodeBlock.CHEROKEE, //
                                    UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS, //
                                    UnicodeBlock.SUNDANESE_SUPPLEMENT, //
                                    UnicodeBlock.SPECIALS, //
                                    UnicodeBlock.SINHALA, //
                                    UnicodeBlock.BENGALI, //
                                    UnicodeBlock.LOW_SURROGATES, //
                                    UnicodeBlock.VERTICAL_FORMS, //
                                    UnicodeBlock.CYRILLIC, //
                                    UnicodeBlock.CHAKMA, //
                                    UnicodeBlock.CHAM, //
                                    UnicodeBlock.ARMENIAN, //
                                    UnicodeBlock.GURMUKHI, //
                                    UnicodeBlock.SPACING_MODIFIER_LETTERS, //
                                    UnicodeBlock.KANGXI_RADICALS, //
                                    UnicodeBlock.LAO, //
                                    UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS, //
                                    UnicodeBlock.KHMER, //
                                    UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS, //
                                    UnicodeBlock.MUSICAL_SYMBOLS, //
                                    UnicodeBlock.UGARITIC, //
                                    UnicodeBlock.PHOENICIAN, //
                                    UnicodeBlock.LATIN_1_SUPPLEMENT, //
                                    UnicodeBlock.PHAISTOS_DISC, //
                                    UnicodeBlock.ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS, //
                                    UnicodeBlock.HANGUL_COMPATIBILITY_JAMO, //
                                    UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION, //
                                    UnicodeBlock.TELUGU, //
                                    UnicodeBlock.JAVANESE);
        }

        @Parameter(0)
        public UnicodeBlock sut;

        @Override
        public UnicodeBlock createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Character$UnicodeBlock]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Character$UnicodeBlock]

    }

}
