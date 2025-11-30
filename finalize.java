class FinalizeExample {
    int num;

    FinalizeExample(int n) {
        num = n;
        System.out.println("Object " + num + " created");
    }

protected void finalize() {
        System.out.println("finalize() called for object " + num);
    }
    public static void main(String[] args) {
        FinalizeExample obj1 = new FinalizeExample(1);
        FinalizeExample obj2 = new FinalizeExample(2);

        // Make objects eligible for Garbage Collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}


    
