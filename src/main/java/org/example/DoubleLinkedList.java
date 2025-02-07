package org.example;

public class DoubleLinkedList {
    private int[] arrayList;
    private int size;

    public DoubleLinkedList(){
        arrayList = new int[1];
        size = 0;
    }

    public void print(){
        for(int i:arrayList){
            System.out.println(i);
        }
    }

    protected void addElementOnTop(int element){
        if(size == 0){
            arrayList[size++] = element;
        }else {
            rebuildArrayList(0, 0, 0,false);
            arrayList[size++] = element;
        }
    }

    protected void addElementOnDown(int element){
            rebuildArrayList(1,0,0,false);
            arrayList[0] = element;
            size++;
    }

    protected void deleteElementFromTop(){
        rebuildArrayList(0,1,0,true);
        size--;
    }

    protected void deleteElementFromDown(){
        rebuildArrayList(0,1,1,true);
        size--;
    }

    protected int getTop(){
        return arrayList[size-1];
    }
    protected int getDown(){
        return arrayList[0];
    }
    protected int getSize(){
        return size;
    }

    private void rebuildArrayList(int moveArrayRight,
                                  int numberElementsOTRemoved,
                                  int moveArrayLeft,
                                  boolean isDeleted){
        if (isDeleted){
            if(size != 1){
                int[] newArray = new int[size - 1];
                System.arraycopy(arrayList, moveArrayLeft, newArray, moveArrayRight, size - numberElementsOTRemoved);
                arrayList = newArray;
            }
        }else {
            int[] newArray = new int[size + 1];
            System.arraycopy(arrayList, moveArrayLeft, newArray, moveArrayRight, size - numberElementsOTRemoved);
            arrayList = newArray;
        }
    }

}
