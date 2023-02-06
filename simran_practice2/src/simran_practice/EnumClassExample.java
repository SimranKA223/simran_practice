package simran_practice;

enum Color{
	RED,
	BLUE,
	ORANGE,
	BLACK,
	GREEN
}


public class EnumClassExample {
	
	static Color col;
	
	EnumClassExample(Color col){
		this.col=col;
	}
	
	public void show() {
		
		switch(col) {
		
		case RED:
			System.out.println("Apple is red");
			break;
		
		case BLUE:
			System.out.println("Sky is blue");
			break;
		
		case ORANGE:
			System.out.println("My favourite fruite is Orange");
			break;
		
		case BLACK:
			System.out.println("My speakers are black");
			break;
		
		case GREEN:
			System.out.println("Eat green Veggies!");
			
		default:
			System.out.println("White");
			break;
		
		}
		
	}

	public static void main(String[] args) {
		
		Color c = Color.RED;
		System.out.println(c);
		
		
		String str="BLUE";
		
		
		
		EnumClassExample t = new EnumClassExample(col.valueOf(str));
		t.show();
		
		

	}

}
