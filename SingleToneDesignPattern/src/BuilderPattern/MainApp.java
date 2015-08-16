package BuilderPattern;

public class MainApp {
	public static void main(String[] args) {
		Computer c=new Computer.ComputerBuilder("2gb","500hd").setIsGraphicEnabled(true).build();
		System.out.println(c);
	}

}
