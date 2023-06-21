# Java-get-answer
Java问答程序
import java.util.Scanner;：这行代码从java.util包中导入Scanner类，它允许你从控制台读取用户的输入。

public class QuestionAnswerProgram {：这行代码开始声明一个名为QuestionAnswerProgram的新类。

public static void main(String[] args) {：这行代码声明了程序的主方法，也是程序的入口点。

Scanner scanner = new Scanner(System.in);：这行代码创建了一个名为scanner的新的Scanner对象，用于从控制台读取输入。

while (true) {：这行代码开始一个无限循环，直到显式地终止为止。

System.out.print("请输入你的问题（输入'退出'结束程序）: ");：这行代码显示一个提示，要求用户输入一个问题。

String userQuestion = scanner.nextLine();：这行代码从控制台读取用户输入，并将其存储在变量userQuestion中。

if (userQuestion.equals("退出")) {：这行代码检查用户是否输入了"退出"作为问题。

break;：如果用户输入了"退出"，则终止循环并结束程序。

String response = getAnswer(userQuestion);：这行代码调用getAnswer方法，将用户的问题作为参数传递，并将返回的答案存储在变量response中。

System.out.println(response);：这行代码将回答输出到控制台。

public static String getAnswer(String question) {：这行代码声明了一个名为getAnswer的方法，它接受一个名为question的String参数，并返回一个String值。

22-33这些行代码包含一系列的if-else if语句，将question参数与不同的字符串进行比较，以确定适当的回答。如果找到匹配项，则返回相应的回答。

return "抱歉，我黄文定无法回答你的问题。";：这行代码是默认情况，当没有满足前面的if条件时执行。它返回一个通用的抱歉消息，表示程序无法回答这个问题。
