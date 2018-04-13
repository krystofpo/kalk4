package kr.kalk4.checker;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mario on 13.4.2018.
 */
public class Checker {

    private CheckerState state;
    private NumberState numberState;

    @Autowired
    public Checker(NumberState numberState) {
        this.numberState = numberState;
    }

    public void setFirstState() {
        state = numberState;

    }

    public void check(List<String> workingExpression) {
        state.check(this, workingExpression);
    }

    void setState(CheckerState state) {
        this.state = state;
    }
}
