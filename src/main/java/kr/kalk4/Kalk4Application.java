package kr.kalk4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kalk4Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Kalk4Application.class, args);
	}

	private ExpressionProcessor processor;

	@Autowired
	public Kalk4Application(ExpressionProcessorSimple expressionProcessor) {
		this.processor = expressionProcessor;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ahoj");
		UserInput input = new FileInput();

		ResultPrinter printer = new ResultPrinter();

		try {
			String mathExpression = input.readInput();
			Double result = processor.calculate(mathExpression);
			printer.print(result);
		} catch (Exception e) {
			printer.print(e);
		}

	}
}
