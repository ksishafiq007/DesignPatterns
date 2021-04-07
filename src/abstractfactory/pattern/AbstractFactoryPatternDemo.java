package abstractfactory.pattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory2.getShape("RECTANGLE");
		shape3.draw();
		Shape shape4 = shapeFactory2.getShape("SQUARE");
		shape4.draw();
		
	}

}
