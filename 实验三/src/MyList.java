public interface MyList <T> {
    boolean ListEmpty();
    int ListLength();
    T GetElem(int i);
    int LocateElem(T e);
    void ListInsert(int i, T e);
    T ListDelete(int i);
    void ListUpdate(int i, T e);
    void ClearList();
}
