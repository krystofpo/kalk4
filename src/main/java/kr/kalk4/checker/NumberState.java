package kr.kalk4.checker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario on 13.4.2018.
 */
@Scope()
public class NumberState extends AbstractState implements CheckerState{
    private ArrayList<Character> digits0to9=new ArrayList<>();



    @Autowired
    public NumberState(NumberOrOperandState numberOrOperandState) {
        this.nextState = numberOrOperandState;
        fillDigits();
    }

    private void fillDigits() {
        int RADIX = 10;
        for (int i = 0; i <= 9; i++) {
            char ch = Character.forDigit(i, RADIX);
            digits0to9.add(ch);
        }
    }







    @Override
    protected void checkChar(char ch) {
        if (!digits0to9.contains(ch)) {
            throw new RuntimeException();
        }
    }
}
