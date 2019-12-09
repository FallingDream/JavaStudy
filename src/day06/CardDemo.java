package day06;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 整体思路:
 * 1.先创建整副牌
 *      （1）花色与数字分别创建集合 花色：♥♦♠♣ 数字：2-10 JQKA ->  String.valueOf(i) 将int->String
 *      （2）通过双重遍历将花色与数字组合存入牌中
 *      （3）加入大☺小☺
 *      （4）Collections.shuffle打乱集合
 * 2.发牌
 *      （1）创建四个集合 为三个玩家与底牌
 *      （2）保留三张底牌，索引对三取余，将牌发入三名玩家的集合
 *      （3）将剩余的牌保存在底牌中
 * 3.打印集合
 *
 */
@SuppressWarnings("all")
public class CardDemo {
    public static void main(String[] args) {
        //整副扑克
        ArrayList<String> poker = new ArrayList<>();
        //花色
        ArrayList<String> type = new ArrayList<>();
        type.add("♥");
        type.add("♦");
        type.add("♠");
        type.add("♣");
        //数字
        ArrayList<String> number = new ArrayList<>();
        for (int i = 2;i<=10;i++){
            number.add(String.valueOf(i));
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        //花色与数字组合保存到整副牌中
        for (String temp:type){
            for (String temp1:number){
                poker.add(temp+temp1);
            }
        }

        poker.add("大☺");
        poker.add("小☺");

        //打乱集合
        Collections.shuffle(poker);

        //三名玩家和三张底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> under = new ArrayList<>();

        //发牌，保留三张底牌
        for(int i = 0;i<poker.size()-3;i++){
            if (i%3==0){
                player1.add(poker.get(i));
            }else if (i%3==1){
                player2.add(poker.get(i));
            }else {
                player3.add(poker.get(i));
            }
        }
        //把三张底牌放入集合
        for (int i = poker.size()-3;i<poker.size();i++){
            under.add(poker.get(i));
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(under);

    }
}
