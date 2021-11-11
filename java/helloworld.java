class QuickStart {

    public static void backwards(String name){
        System.out.print(new StringBuilder(name).reverse());
    }
    public static void main(String[] args) {
        
        backwards("Jason Wang");
    }
}