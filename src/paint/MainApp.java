package paint;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		draw(p1);
		
		Point p2 = new ColorPoint(50, 100, "red");
		draw(p2);
		
		p1.show(false);
		p2.show(false);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Rect rect = new Rect();
		draw(rect);

		Circle circle = new Circle();
		draw(circle);
		
		draw(new GraphicString("hello"));
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawPoint(Point point) {
//		point.show();
//	}
//
//
//	public static void draw(Shape shape) {
//		shape.draw();
//	}

//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
	
}
