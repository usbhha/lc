package com.space._2_add;

/**
 * 2.两数之和
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: Feng YuJie
 * @create: 2021/10/9 11:20
 */
public class Main_2_1 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return addRecursion(l1,l2,new ListNode(0));
    }

    /**
     * 解法1： 递归-- 复杂
     * @param l1
     * @param l2
     * @param result
     * @return
     */
    public ListNode addRecursion(ListNode l1, ListNode l2, ListNode result){
        if (l1 != null || l2 != null){
            /**
             *  不执行： 如果2个都为空，则不会执行； 否则两个或其中一个不为空
             *  执行：两个或一个不为空
             *
             */
            if (l1 == null){
                //处理L1为空的情况
                result = l2;
                if ( l2.val >= 10){
                    l1 = new ListNode(0);
                    addRecursion(l1,l2,result);
                }
                return result;
            }else if (l2 == null){
                //处理l2为空的情况
                result = l1;
                if ( l1.val >= 10){
                    l2 = new ListNode(0);
                    addRecursion(l1,l2,result);
                }
                return result;
            }else{
                result = l1;
                result.val += l2.val;
                //计算 大于10
                int addTemp = 0;
                if (result.val >= 10){
                    addTemp = result.val / 10;
                    result.val %= 10 ;
                    if (l1.next != null){
                        l1.next.val += addTemp;
                    }else{
                        l1.next = new ListNode(addTemp);
                    }
                }else{
                    if (l1.next == null && l2.next != null){
                        l1.next = new ListNode(0);
                    }
                }

                addRecursion(l1.next,l2.next,result.next);
            }

        }
        return result;
    }


    public static void main(String[] args) {
        Main_2_1 m = new Main_2_1();

        ListNode l1_first = new ListNode(7);
        ListNode l1_second = new ListNode(3);
//        ListNode l1_third = new ListNode(9);
//        l1_second.next = l1_third;
        l1_first.next = l1_second;

        ListNode l2_first = new ListNode(0);
//        ListNode l2_second = new ListNode(3);
//        ListNode l2_third = new ListNode(0);
//        l2_second.next = l2_third;
//        l2_first.next = l2_second;

        ListNode listNode = m.addTwoNumbers(l1_first, l2_first);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
