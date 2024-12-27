public class Stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb= new StringBuffer("GQTKL#JHGFGHJ");
        String s="gqtgqtgqt";
        System.out.println(sb.indexOf("Q"));
        System.out.println(sb.lastIndexOf("G"));
        System.out.println(sb.append("GQT12345"));
        System.out.println(sb.charAt(7));
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(6));
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("@1234567"));
        System.out.println(s.contains("gqt"));
        System.out.println(s.replace("gqt","TQG"));
        System.out.println(sb.replace(0,1,"#GQT"));
    }
}
