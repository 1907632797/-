package Third;
import java.util.Scanner;//scanner为系统默认的包之外的类，就是好比二班的李四
/**
 *测试获得键盘输入
 * @熊仁杰
 */
public class Fourtry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建Scanner对象，对象名是scanner，传入参数System.in  IO流中介绍
        System.out.println("请输入名字");
        String name =scanner.nextLine(); //nextline获得输入的上一行文字
        System.out.println("请输入你的爱好");
        String favor = scanner.nextLine();
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();

        System.out.println("###################");
        System.out.println(name);
        System.out.println(favor);
        System.out.println("来到地球的天数："+age*365);

    }
}
