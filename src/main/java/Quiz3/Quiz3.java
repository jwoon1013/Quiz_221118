package Quiz3;

interface Predator {
    String bark();
}

abstract class Animal {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();
        Animal d = new Lion();

        System.out.println(a.hello());  // 1번 // a는 Lion의 인스턴스이고 소속은 Animal이라 됨.
//        System.out.println(a.bark());   // 2번 // a는 Lion 인데, bark메소드는 Dog에 들어가 있어서 안됨.
        System.out.println(b.hello());  // 3번 // Lion인 b도 Animal이기 때문에 됨.
        System.out.println(b.bark());   // 4번 // Lion이 짖으면 "bark bark"
//        System.out.println(c.hello());  // 5번 : hello 메소드는 animal 클래스에 있는데, c는 predator라 안됨.

        System.out.println(c.bark());   // 6번 : 된다!
        System.out.println(d.bark()); // 7번 : 오 안됨. 와우.. 이게 인터페이스와 클래스의 차이인가
    }
}