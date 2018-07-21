class StringBufferDemo5
{
    public static void main(String args[])
    {
    
        StringBuffer sb = new StringBuffer("Merit Campus "); // LINE A
        sb.insert(sb.length(), "Your Online Java School. "); // LINE B
        System.out.println(sb);
    }
}