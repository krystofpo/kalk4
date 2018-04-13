package kr.kalk4.checker

import spock.lang.Specification

/**
 * Created by Mario on 13.4.2018.
 */
class CheckerTest extends Specification

{
    def "first state method and check method should throw when 1st char of input is not a number"() {
        given:
        def checker = new Checker()

        when:
        checker.setFirstState()
        checker.check(['a'])

        then:
        thrown(RuntimeException.class)
    }

    def "first state method and check method should not throw when 1st char of input is a number and should remove the char from input"() {
        given:
        def checker = new Checker()
        def input = ['1a']

        when:
        checker.setFirstState()
        checker.check(input)

        then:
        notThrown(Exception.class)
        input == ['a']

    }
}
