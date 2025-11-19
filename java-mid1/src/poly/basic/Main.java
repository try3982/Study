package poly.basic;

public class Main {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();

        // 부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // parent poly는 부모타입이다.
        // 부모는 자식을 담을 수 있다.

        // 자식은 부모를 담을 수 없다.
       // Child child1 = new Parent(); //  컴파일 오류



    }
}
