public class MainFunc {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.ListInsert(0, 1);
        System.out.println("the whole list: ");
        linkedList.ListPrint();
        System.out.println();

        linkedList.ListInsert(1, 2);
        System.out.println("the whole list: ");
        linkedList.ListPrint();

        linkedList.ListInsert(1, 3);
        System.out.println("the whole list: ");
        linkedList.ListPrint();

        linkedList.ListInsert(2, 4);
        System.out.println("the whole list: ");
        linkedList.ListPrint();

        linkedList.ListInsert(0, 5);
        System.out.println("the whole list: ");
        linkedList.ListPrint();
        System.out.println("the last element: "+linkedList.GetRear());

        System.out.println("the 2rd element: "+linkedList.GetElem(2));
        System.out.println("the last element: "+linkedList.GetRear());

        System.out.println("the index of the 1st 3: "+linkedList.LocateElem(3));
        linkedList.ListDelete(3);
        linkedList.ListPrint();

        linkedList.ClearList();
        linkedList.ListPrint();
    }
}
