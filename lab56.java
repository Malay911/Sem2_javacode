public class lab56 {
    public static void main(String[] args) {
        Objectcounter obj1=new Objectcounter();
        Objectcounter obj2=new Objectcounter();
        Objectcounter obj3=new Objectcounter();
        System.out.println("Number of objects created:"+ ObjectCounter.getObjectCount());
    }
}

class Objectcounter{
    static int objectCount=0;
    
    public Objectcounter(){
        objectCount++;
    }
    public static int getObjectCount(){
        return objectCount;
    }
}