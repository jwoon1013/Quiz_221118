//// 퀴즈 2
//// 다음 코드를 보고, 주석에서 1,2,3,4,5번이 달린 문장중 오류가 발생하는 문장을 모두 찾고, 오류의 원인에대해 설명하세요.
//
//interface Predator {
//}
//
//class Animal {
//}
//
//class Dog extends Animal {
//}
//
//class Lion extends Animal implements Predator {
//}
//
//public class Quiz2 {
//    public static void main(String[] args) {
////        Animal a = new Animal(); // 1번 : 문제없음
////        Animal b = new Dog(); // 2번 : 문제없음
////        Animal c = new Lion(); // 3번 : 문제없음
////        Dog d = new Animal(); // 4번 : 안됨 / 부모클래스는 자식클래스의 인스턴스가 될 수 없음.
////        Predator e = new Lion();  // 5번 : 어.. 된다. Lion도 Predator에 상속받는 자식클래스니까.
//    }
//}