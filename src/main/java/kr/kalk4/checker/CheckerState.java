package kr.kalk4.checker;

import java.util.List;

/**
 * Created by Mario on 13.4.2018.
 */
public interface CheckerState {
    void check(Checker checker, List<String> workingExpression);
}
