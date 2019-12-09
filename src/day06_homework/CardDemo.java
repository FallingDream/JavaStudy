package day06_homework;


import java.util.*;

/**
 * 使用map集合完成洗牌发牌 要求规则与扑克一致，同时输出时将牌排序
 * 整体思路：
 * 1.将牌存入
 *      （1）要求使用map存牌，因此map的key为Integer类型的cardnumber，方便发牌，value为String类型的花色+数字
 *      （2）与list方法一致，将花色与数字放入list中，规则与扑克一致，因此从3开始 3-10 JQKA2
 *      （3）使用增强for循环将花色与数字组合，因为要求与扑克一致，所以先循环数字，再循环花色
 * 2.洗牌发牌
 *      （1）准备洗牌，创建ArrayList保存cardnumber，将cardnumber打乱
 *      （2）发牌时注意，要创建索引获取当前位置，如果直接使用：
 *          for(int i = 0;i<card.size()-3;i++){
 *             if (i%3==0){
 *                 player1.add(i);
 *             }else if (i%3==1){
 *                 player2.add(i);
 *             }else {
 *                 player3.add(i);
 *             }
 *         }
 *          此方法，则无法实现打乱的效果
 *     （3）使用Collections.sort方法将cardnumber排序
 * 3.输出
 *      使用增强for循环输出，调整格式
 * @author wangjj
 * @create 2019-12-09 18:54
 **/
@SuppressWarnings("all")
public class CardDemo {
    public static void main(String[] args) {
        //使用map存储整副牌
        Map<Integer, String> map = new HashMap<>();

        //使用ArrayList存储花色与数字
        ArrayList<String> type = new ArrayList<String>();
        type.add("♥");
        type.add("♦");
        type.add("♠");
        type.add("♣");

        //要求大小与规则相同，因此从3开始插入
        ArrayList<String> number = new ArrayList<>();
        for (int i = 3;i<=10;i++){
            number.add(String.valueOf(i));
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        number.add("2");

        //使用cardnumber作为key记录
        int cardnumber = 0;

        //使用增强for循环将数字与花色输入到map中，按照规则，应先循环数字，再循环花色
        for (String temp : number) {
            for (String temp1 : type) {
                String card = temp1+temp;
                map.put(cardnumber,card);
                cardnumber++;
            }
        }

        //加入大小王以及cardnumber
        map.put(cardnumber++,"小☺");
        map.put(cardnumber,"大☺");

        /*//输出测试
        Set<Integer> keySet = map.keySet();
        for (int temp : keySet){
            System.out.println(temp+"-----"+map.get(temp));
        }*/

        //在map中存储了cardnumber，因此洗牌时可以直接存放cardnumber进行洗牌
        ArrayList<Integer> card = new ArrayList<>();
        for (int i = 0;i<54;i++){
            card.add(i);
        }
        //三名玩家与底牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> under = new ArrayList<>();

        //洗牌
        Collections.shuffle(card);
        //发牌
        for(int i = 0;i<card.size()-3;i++){
            //创建索引，获得该位置下的牌
            int index = card.get(i);

            if (i%3==0){
                player1.add(index);
            }else if (i%3==1){
                player2.add(index);
            }else {
                player3.add(index);
            }
        }
        for (int i = card.size()-3;i<card.size();i++){
            int index = card.get(i);
            under.add(index);
        }

        //此时三名玩家与底牌存储的是cardnumber，进行排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(under);

        //将每名玩家的手牌与cardnumber匹配输出
        System.out.print("[");
        for (Integer temp : player1){
            String s = map.get(temp);
            System.out.print(s+" ");
        }
        System.out.print("]\n[");
        for (Integer temp : player2){
            String s = map.get(temp);
            System.out.print(s+" ");
        }
        System.out.print("]\n[");
        for (Integer temp : player3){
            String s = map.get(temp);
            System.out.print(s+" ");
        }
        System.out.print("]\n[");
        for (Integer temp : under){
            String s = map.get(temp);
            System.out.print(s+" ");
        }
        System.out.print("]");

    }
}
