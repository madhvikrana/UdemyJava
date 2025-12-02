public class IncreDecrement {

    public static void main(String[] args) {
        // int x=5, y;
        // y=x++;
        int x = 5, y = 4, z;
        z = 2 * x++ + 3 * ++x;
        System.out.println(z);

        float a = 3.5f;
        a++;
        System.out.println(a);

        char b = 'A';
        b++;
        System.out.println(b);

        byte c = 5;
        c++;
        System.out.println(c);

        byte d = 127;
        d++;
        System.out.println(d);

    }

}
