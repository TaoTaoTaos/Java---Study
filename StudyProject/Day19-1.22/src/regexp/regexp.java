package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式练习
 *
 * @author Lijintao
 * @date 2024/01/22 10:30
 **/
public class regexp {
    public static void main(String[] args) {
        String content = "20世纪90年代，硬件领域出现了单片式计算机系统，" +
                "这种价格低廉的系统一出现就立即引起了自动控制领域人员的注意，" +
                "因为使用它可以大幅度提升消费类电子产品（如电视机顶盒、面包烤箱、移动电话等）的智能化程度" +
                "。Sun公司为了抢占市场先机，在1991年成立了一个称为Green的项目小组，帕特里克、詹姆斯" +
                "·高斯林、麦克·舍林丹和其他几个工程师一起组成的工作小组在加利福尼亚州门洛帕克市沙丘" +
                "路的一个小工作室里面研究开发新技术，专攻计算机在家电产品上的嵌入式应用。";

        //1 创建模式对象 Pattern

        Pattern pattern = Pattern.compile("\\d\\d\\d\\d");  //pattern里填正则表达式 【\\d】代表任意数字
        Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
        //2 创建匹配器对象 Matcher

        Matcher matcher1 = pattern.matcher(content); //匹配器里 把文本放进去
        Matcher matcher2 = pattern2.matcher(content);


        //循环匹配 ， 输出结果

        while (matcher1.find()) { //匹配到的内容在 group里
            System.out.println("1找到了： " + matcher1.group(0));
        }
        while (matcher2.find()) { //匹配到的内容在 group里
            System.out.println("2找到了： " + matcher2.group(0));
        }

    }
}
