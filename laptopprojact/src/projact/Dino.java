package projact;

class Dinosour_parent_class {
	protected String name;
	protected String type;
	protected int age;// 나이
	protected int height;// 키
	protected int weight;// 몸무게

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Dinosour_parent_class(String name, String type, int age, int height, int weight) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void DeadDino() {
		if (this.age > 100) {
			System.out.println("공룡이 나이가 많아서 죽어버렸네 ㅠㅠ");
		}
	}

}

class LandDino extends Dinosour_parent_class {

	public LandDino(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void run() {
		System.out.println("땅위를 달린다");
	}

	public static void shouting() {
		System.out.println("시끄러운 울음소리를 낸다");
	}
}

class swimDino extends Dinosour_parent_class {

	public swimDino(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void swim() {
		System.out.println("수영 하기 시작했다");
	}

	public static void chohumpa() {
		System.out.println("초음파를 발사한다");
	}
}

class FlyDino extends Dinosour_parent_class {

	public FlyDino(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void fly() {
		System.out.println("하늘로 날아오른다");
	}

	public static void madehome() {
		System.out.println("둥지를 짓는다");
	}
}

public class Dino {

}
