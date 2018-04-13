package kr.kalk4;

import kr.kalk4.checker.Checker;
import kr.kalk4.checker.NumberOrOperandState;
import kr.kalk4.checker.NumberState;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * Created by Mario on 12.4.2018.
 */
public class ExpressionProcessorSimple implements ExpressionProcessor {

    private final Checker checker;


@Autowired
    public ExpressionProcessorSimple(Checker checker) {
        this.checker = checker;
    }

    @Override


    public Double calculate(String mathExpression) {
        checkExpression(mathExpression);
        return null;
    }

    private void checkExpression(String mathExpression) {
        if (isEmpty(mathExpression)) {
            throw new RuntimeException("Expression must not be empty");
        }
        List<String> workingExpression = new ArrayList<>();
        workingExpression.add(mathExpression);

        checker.setFirstState();

        while (workingExpression.get(0).length() > 0) {
            checker.check(workingExpression);

            /*
            Stav cislo
            prvni musi byt cislo
            pak se stav prepne do stavu cislo nebo operator
            dalsi znak je cislo, ok, stav se nemeni
            dalsi znak je operator, ok, stav se zmeni na cislo

            na konci opet cislo


             */
        }
    }
}