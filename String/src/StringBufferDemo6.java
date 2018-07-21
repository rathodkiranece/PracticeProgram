class StringBufferDemo6
{
    public static void main(String args[])
    {
    
        StringBuffer sb = new StringBuffer("Merit Campus "); // LINE A
        CharSequence ch = "Don't Just Learn Java, Do Java";
		sb.insert(sb.length(), ch);
		System.out.println(sb);
    }
}