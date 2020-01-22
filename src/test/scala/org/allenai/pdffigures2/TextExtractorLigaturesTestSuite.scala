package org.allenai.pdffigures2

import org.allenai.common.testkit.UnitSpec
import org.apache.pdfbox.pdmodel.PDDocument

class TextExtractorLigaturesTestSuite extends UnitSpec {

    "TextExtractor" should "handle orthographic ligatures" in {
        val pdf = PDDocument.load( getClass.getClassLoader.getResourceAsStream( "test-pdfs/ligatures-test.pdf" ) )
        val extractedText = TextExtractor.extractText( pdf )
        val result = extractedText.head.paragraphs.head.text

        result shouldBe "conflict, difference, baffling, finished, affirmation"
    }

}
