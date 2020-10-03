/**
 * Program to demonstrate String character extractions
 */
public class StringDemo {
    public static void main(String[] args) {

        //String initialization using constructor
        String source = new String("Where there is a will");
        //String initialization using character array
        char[] sep = {',', ' '};
        String separators = new String(sep);
        //String initialization using literals
        String target = "There is a way";

        // size of source string
        System.out.println("Size of source: "+source.length());

        //getChar
        System.out.println("Last character of target string: "+ target.charAt(target.length()-1));

        //getBytes
        System.out.println("Bytes in source: "+ source.getBytes());

        //toCharArray
        char[] targetArray = target.toCharArray();
        for(int i=0; i<targetArray.length; i++) {
            System.out.print(targetArray[i]+".");
        }

        System.out.println("");

        //getChars
        char buf[] = new char[5];
        source.getChars(6,11, buf, 0);
        System.out.println(buf);
        System.out.println("This will print the char objectId "+buf);


    }
}