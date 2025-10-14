class Box {
    int h;
    int w;
    int l;

    public static void main(String args[]){
        box b1 = new box();
        b1.h=10;
        b1.w=20;
        b1.l=15;
        System.out.println(" Box-1 Dimensions " +  b1.h  +  b1.w  +  b1.l);

        box b2 = new box();
        b2.h=20;
        b2.w=25;
        b2.l=10;
        System.out.println(" Box-2 Dimensions " +  b2.h  +  b2.w  +  b2.l);
    }
}