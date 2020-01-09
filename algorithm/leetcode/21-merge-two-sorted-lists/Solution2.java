/**
 * compare the elements of ListNode1 and ListNode2 one by one
 * time: O(K+M)
 * space: O(1)
 * */
class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode newL = null;
        ListNode nextL = null;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                if(newL==null){
                    newL = l1;
                    nextL=newL;
                } else {
                    nextL.next=l1;
                    nextL=l1;
                }
                l1=l1.next;
            }else{
                if(newL==null){
                    newL=l2;
                    nextL=newL;
                }else{
                    nextL.next=l2;
                    nextL=l2;
                }
                l2=l2.next;
            }
        }
        if (l1!=null)
            nextL.next=l1;
        if(l2!=null)
            nextL.next=l2;
        return newL;
        
    }
}