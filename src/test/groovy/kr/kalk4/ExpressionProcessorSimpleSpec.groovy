package kr.kalk4

import spock.lang.Specification

/**
 * Created by Mario on 12.4.2018.
 */
class ExpressionProcessorSimpleSpec extends Specification {
    def "Calculate throws with invalid input"() {
        given:
        def processor = new ExpressionProcessorSimple()

        when:
        processor.calculate('x')

        then:
        thrown(RuntimeException.class)

    }
}
