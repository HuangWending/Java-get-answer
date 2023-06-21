import java.util.Scanner;

public class QuestionAnswerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入你的问题（输入'退出'结束程序）: ");
            String userQuestion = scanner.nextLine();

            if (userQuestion.equals("退出")) {
                break;
            }

            String response = getAnswer(userQuestion);
            System.out.println(response);
        }
    }

    public static String getAnswer(String question) {
        if (question.equals("你好")) {
            return "你好";
        } else if (question.equals("你的名字是什么")) {
            return "黄文定";
        } else if (question.equals("你的生日是什么时候")) {
            return "2009年7月18日";
        } else if (question.equals("你是中国人吗")) {
            return "我是中国人";
        } else if (question.equals("台湾是中国的吗")) {
            return "台湾是中国的";
        } else if (question.equals("你爱我吗")) {
            return "这是一个由我决定的选项，我需要认真，但是我还是爱着你";
        } else if (question.equals("你喜欢去哪里")) {
            return "中国大陆和中国台湾";
        } else if (question.equals("你有朋友吗")) {
            return "没有";
        } else if (question.equals("你的心情怎么样")) {
            return "自卑，孤独";
        } else {
            return "抱歉，我黄文定无法回答你的问题。";
        }
    }
}
