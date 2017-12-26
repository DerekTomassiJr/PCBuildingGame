public class HHD
{
    private int hhd1;
    private int hhd2;
    private int hhd3;
    private int hhd4;
    private int hhd5;
    
    public HHD ()
    {
        this.hhd1 = 256;
        this.hhd2 = 512;
        this.hhd3 = 1000;
        this.hhd4 = 2000;
        this.hhd5 = 4000;
    }
    //setters and getters for hhd1
    public void setHHD1 (int a)
    {
        this.hhd1 = a;
    }
    public int getHHD1 ()
    {
        return this.hhd1;
    }
    //setters and getters for hhd2
    public void setHHD2 (int b)
    {
        this.hhd2 = b;
    }
    public int getHHD2 ()
    {
        return this.hhd2;
    }
    //setters and getters for hhd3
    public void setHHD3 (int c)
    {
        this.hhd3 = c;
    }
    public int getHHD3 ()
    {
        return this.hhd3;
    }
    //setters and getters for hhd4
    public void setHHD4 (int d)
    {
        this.hhd4 = d;
    }
    public int getHHD4 ()
    {
        return this.hhd4;
    }
    //setters and getters for hhd5
    public void setHHD5 (int e)
    {
        this.hhd5 = e;
    }
    public int getHHD5 ()
    {
        return this.hhd5;
    }
    //toString
    public String toString ()
    {
        String a = this.hhd1 + "GB - $26.99";
        String b = this.hhd2 + "GB - $54.99";
        String c = this.hhd3 + "GB - $69.99";
        String d = this.hhd4 + "GB - $119.99";
        String e = this.hhd5 + "GB - $169.99";
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}