
// design a java code to implement exception handeling

class meathod_overloading
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    
}
class Overload{
    public static void main(String[] args) {
        System.out.println(Addition.add(12,18));
        System.out.println(Addition.add(12,18,8 ));
    }
}


