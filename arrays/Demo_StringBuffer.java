public class Demo_StringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dhrubojyoti");
         sb.append(" Mondal");
         //sb.deleteCharAt(2)
        sb.insert(0, "JAVA ");
        sb.setLength(25);
         System.out.println(sb);
        //System.out.println(sb.length());

    }
}
// string buffer convert to string using toString() method
// string buffer thread safe but string builder not thread safe