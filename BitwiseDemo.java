public class BitwiseDemo {
    public static void main(String[] args) {
        // int x=10, y=6, z;
        // z=x&y;
        // System.out.println(z);

        int x = 0b1010;
        int y = 0b0110;
        int z;
        z = x ^ y;
        System.out.println(z);

        int a = -0b1010;
        int b;
        b = a >> 1;
        System.out.println(b);

        int p = -0b1010;
        int q;
        q = p >>> 1;
        System.out.println(String.format("%s", Integer.toBinaryString(p)));
        System.out.println(String.format("%32s", Integer.toBinaryString(q)));

        int m=0b1010;
        int n;
        n=~m;
        System.out.println(String.format("%s",Integer.toBinaryString(m)));
        System.out.println(String.format("%32s",Integer.toBinaryString(n)));

    }

}
