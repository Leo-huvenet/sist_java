package day0209;

public class InheritanceInstance {
	
	public void polymorphism(Parent p) {
		//Child1도 받고 싶고, Child2도 받고 싶다 -> 상속관계의 부모클래스를 받으면
		p.printName(); //Parent라는 이름을 객체를 다르게 사용할 수 있다.
	}

	public static void main(String[] args) {
	//자식클래스로 객체화 : 객체로 부모의 지원, 자식의 자원사용.
	Child1 c1 = new Child1();
	//부모의 변수
	System.out.println(c1.name+ " /"+c1.age);
	//자식의 변수
	System.out.println(c1.child1);
	//부모의 method
	c1.printAge();
	//Child1 클래스에서 Override 한 method
	c1.printName();
	
	System.out.println("---------------------is a관계의 객체화---------------------");
	//자식클래스로 객체를 생성하고 부모클래스에 저장한다.
	Parent p1 = new Child1();
	Parent p2 = new Child2();
	
	//p1객체로 사용할 수 있는 자원
	//변수 : name, age는 사용가능. child1 변수는 사용불가.
	System.out.println(p1.name+" /"+p1.age);
	//method
	p1.printAge(); //부모의 method 호출
	p1.printName();// 부모의 method를 호출 했지만 Overide가 되어있다면, 자식의 method가 
	//최우선적으로 호출 된다.
	
	
	//p2객체로 사용할 수 있는 자원
	//변수 : name, age는 사용가능. child2 변수는 사용불가.
	System.out.println(p2.name+" /"+p2.age);
	p2.printAge(); //부모의 method를 호출 했지만 Override가 되어있다면, 자식의 method가
	//최우선 적으로 호출 된다.
	p2.printName();//부모의 method 호출
	System.out.println("--------------------다형성-----------------------");
	Child1 ch1 = new Child1();
	Child2 ch2 = new Child2();
	
	InheritanceInstance ii = new  InheritanceInstance();
	ii.polymorphism(ch1);
	ii.polymorphism(ch2);
	
	
	
	
	
	
	}

}
