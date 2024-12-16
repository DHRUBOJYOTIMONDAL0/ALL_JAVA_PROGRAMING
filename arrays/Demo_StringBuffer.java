public class Demo_StringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dhrubojyoti");
        sb.append(" Mondal");
        sb.insert(0, "JAVA ");
        sb.setLength(25);
        System.out.println(sb);

    }
}
