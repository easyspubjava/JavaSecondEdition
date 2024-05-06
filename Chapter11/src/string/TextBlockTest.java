package string;

public class TextBlockTest {
    public static void main(String[] args) {
        String myString = "안녕하세요.\n\t반갑습니다.\n다음에 또 만나요.";
        System.out.println("String 출력:");
        System.out.println(myString);

        System.out.println("Text Block 출력:");
        String myTextBlock = """ 
                안녕하세요.
                    반갑습니다.
                다음에 또 만나요.
                """;
        System.out.println(myTextBlock);
        writeHTML();
        printStudent("김유영", 3, 4.0);
    }

    public static void writeHTML() {
        String html = """
                <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

    public static void printStudent(String name, int grade, double point){
        String studentInfo = """
                %s 님은
                %d 학년이고
                평점은 %.1f 입니다.
                """.formatted(name, grade, point);
        System.out.println(studentInfo);
    }
}