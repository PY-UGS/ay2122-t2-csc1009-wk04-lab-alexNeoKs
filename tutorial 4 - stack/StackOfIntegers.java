public class StackOfIntegers {
    int[] elements;
    int index;

    int top;
    
    public StackOfIntegers(){
        elements = new int[16];
        index = 0;
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
        index = 0;
    }

    public boolean empty(){
        boolean result = false;
        if (index == 0 ){
            result =  true;
        }
        return result;
    }

    public int peak(){
        return elements[index];
    }

    public void push(int value){
        index = index + 1;
        elements[index] = value;
    }

    public int pop(){
        index = index -1;
        
        return elements[index+1];
    }

    public int getSize(){
        return elements.length;
    }
}
