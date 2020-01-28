package PTA.bGrade.pta1004.modle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author JianfeiChen
 * @date 2020/1/7 10:19
 * @Description foreach遍历Java集合删除元素 抛“CurrentModificationException” 并发修改异常
 */
public class Student{
    public static void main(String[] args) {
        AbstractClass abstractClass = new TestAbstractClass();
        abstractClass.test();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set2.add(2);
        set2.add(3);
        set2.add(4);
//        for (Integer integer : set) {
//            if (set2.contains(integer)){
//                set.remove(integer);
//            }
//        }
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            if (set2.contains(integerIterator.next())){
                integerIterator.remove(); // 删除元素
            }
        }
        System.out.println("set = " + set);
    }
}


class TestAbstractClass extends AbstractClass{
    @Override
    public void test(){
        System.out.println("抽象类方法是可以复用的哟。");
    }
}