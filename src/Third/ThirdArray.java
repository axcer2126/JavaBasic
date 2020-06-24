package Third;

public class ThirdArray {
    public static void main(String[] args) {
        // 배열을 사용하는 이유 ?
        // 아래처럼 변수를 선언하면 적을것도 많고
        // 이름도 요상해서
        // 각각이 무엇을 의미하는지 알 수 없다.
        int a, b, c, d, e, f, g, h, i, j, k, l,
                m, n, o, p, q, r, s, t, u, w, x;
        // 배열을 사용하면 어떨까 ?
        // 26개의 int형 데이터 타입의 공간이 만들어짐

        // 배열을 작성하는 방법
        // 1. 데이터 타입을 적는다.
        // 2. 대괄호를 열고 닫는다.
        // 3. 변수(배열) 이름을 작성한다.
        // 4. 필요하다면 값을 할당한다.
        //    값을 할당하는 방법은 아래와 같다.
        //    4-1. new를 적는다. (Heap 할당) - 속도 느림
        //    4-2. 데이터 타입을 적는다.
        //    4-3. 대괄호를 열고 개수를 적고 닫는다.
        //    추가적인 방법 (할당을 Stack) - 속도 빠름
        //    - 중괄호를 열고 내부에 집어넣을 값들을 적는다.
        //    - 값들 사이의 구분자는 , 로 구분을 한다.
        //    - 마지막에 중괄호를 닫는다.
        int [] arr = new int[20];
        int sum = 0;

        // 배열이름.length를 하면 길이를 얻을 수 있다.
        // 길이를 얻는다는 것은 위에 new int[20]
        // 위 코드의 의미가 배열의 길이가 20이란 뜻
        // 즉 여기서 arr.length는 20개를 의미함
        for(int idx = 0; idx < arr.length; idx++) {
            // 배열의 시작 인덱스는 0부터
            arr[idx] = idx + 1;
            System.out.println(arr[idx]);
            sum += arr[idx];
        }
        // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
        //  [0] [1] [2] [3] [4] [5] [6] [7]

        System.out.println("sum = " + sum);
    }
}

// 배열만 활용하는 문제 입니다 ~
// 피보나치 수열의 각 항들을 배열에 저장하도록 만들자
// 피보나치 수열은 아래와 같다.
// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
// 사용자 입력이 들어온다.
// ex) 몇 번째 피보나치 수열의 항을 구할까요 ? 7
// 그러면 응답은 13이 출력되면 된다.
// 만약 9를 넣었다면 34가 출력되면 된다.
/*
1. 먼저 사용자 입력을 받는 프로그램을 작성한다.
2. 사용자 입력을 받은만큼 배열을 만들어보자!
3. 각 배열에 피보나치 항을 배치해보자!
4. 마지막으로 결과를 출력한다.
 */
