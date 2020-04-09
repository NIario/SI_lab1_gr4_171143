class Point {
	String id
	double x,y;
    String color;

	public Point(String id, double x, double y, String color){
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	public String getId() {
		return id;
	}
	public void move (char xDirection, char yDirection) {
		if(xDirection == "L")
			x--;
		else if(xDirection == "R")
			x++;
		if(yDirection == "U")
			y++;
		else if(yDirection == "D")
			y--;
	}

	public void draw () {
		System.out.println("Kordinati na tockata se X: " + x + ", Y: "+ y);
	}
}