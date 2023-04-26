class myExcp extends Exception{
    
    private int detail;
    myExcp(int a){
        detail = a;
    }

    public String toString(){
        return "myExcp[" + detail + "]";
    }
}

public class myException{
    static void compute(int a) throws myExcp{
        System.out.println("Called compute(" + a + ")");
        if(a > 10)
            throw new myExcp(a);
        System.out.println("Normal exit");
    }

    public static void main(String args[]){
        try{
            compute(1);
            compute(20);
        }catch(myExcp e){
            System.out.println("Caught " + e);
        }
    }
}