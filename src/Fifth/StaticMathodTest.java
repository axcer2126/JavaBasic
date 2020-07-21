package Fifth;

class StaticMethod {
    // 어떤것들을 static 매서드로 만드는게 좋을까?
    // new로 생성을 하면 힙으로 생성이 된다 --> 그러므로 느리다
    // 빈번한 입력에 대해서 static매서드를 적용해주면
    // 굳이 쓸데없이 new를 할 필요가 없어진다.
    public static void test() {
        System.out.println("test");
    }
}

public class StaticMathodTest {
    public static void main(String[] args) {
        // 원래 방식은 아래와 같다
        //  StaticMethod sm = new StaticMethod();
        // sm.test();
        // StaticMethod.test();
        StaticMethod.test();
    }
}
