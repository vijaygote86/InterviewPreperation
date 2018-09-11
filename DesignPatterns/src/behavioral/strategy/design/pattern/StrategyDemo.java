package behavioral.strategy.design.pattern;

public class StrategyDemo {

	public static void main(String[] args) {

		Context ctx = new Context(new AddtionStrategy());
		System.out.println(ctx.executeStartegy(10, 10));

		ctx = new Context(new MultiplyStrategy());
		System.out.println(ctx.executeStartegy(10, 10));	
	}

}
