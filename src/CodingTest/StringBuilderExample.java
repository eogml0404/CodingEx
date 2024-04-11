package CodingTest;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("Hello");

        // 문자열 삽입
        sb.insert(2, " ");
        System.out.println(sb.toString());

        // 문자열 삭제
        sb.delete(0, 3); // "Hello" 중에서 "Hel" 삭제

        // 문자열 대체
        sb.replace(0, 2, "Hi"); // "Hel"을 "Hi"로 대체

        // 문자열 뒤집기
        sb.reverse();

        // StringBuilder에 저장된 문자열 출력
        System.out.println(sb.toString()); // 출력: "iH"
    }
}