package com.cgj.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        // 何时使用用哪个解释器,应该由Context的内容决定,此处省略该过程
        List<AbstractExpression> expressions = new ArrayList<AbstractExpression>();
        expressions.add(new AExpression());
        expressions.add(new BExpression());
        expressions.add(new AExpression());
        expressions.add(new BExpression());
        expressions.add(new BExpression());
        expressions.add(new AExpression());

        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }

}
