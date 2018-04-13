package kr.kalk4.checker;

import java.util.List;

/**
 * Created by Mario on 13.4.2018.
 */
public abstract class AbstractState implements CheckerState{

    protected CheckerState nextState;



    @Override
    public void check(Checker checker, List<String> workingExpression) {
        checkChar(workingExpression.get(0).charAt(0));
        removeFirstChar(workingExpression);
        setNextState(checker);
    }

    protected void setNextState(Checker checker) {
        checker.setState(nextState);
    }

    private void removeFirstChar(List<String> workingExpression) {
        String expressionWithoutFirstChar = workingExpression.get(0).substring(1);
        workingExpression.set(0, expressionWithoutFirstChar);
    }

    protected abstract void checkChar(char c);
}
