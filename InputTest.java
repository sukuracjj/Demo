import java.util.ArrayList;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        while (!in.hasNext("end")) { // 检查是否还有下一行输入
            String Score = in.nextLine(); // 声明并读取输入
            a.add(Score); // 将读取的输入添加到 ArrayList
        }
        // 输出所有输入的字符串
        for (String str : a) {
            System.out.println(str);
        }

        in.close(); // 关闭 Scanner 对象
    }
}