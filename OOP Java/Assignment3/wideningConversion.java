class wideningConversion {
    public static void main(String[] args) {
        int i = 10;
        String str = Integer.toString(i);
        float f = i;
        double d= i;
        //boolean bool = i; //can't convert any data type to bool and vice versa

        System.out.println(str);
        System.out.println(f);
        System.out.println(d);
    }    
}
