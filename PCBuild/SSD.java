public class SSD
{
    private int ssd1;
    private int ssd2;
    private int ssd3;
    private int ssd4;
    private int ssd5;
    
    public SSD ()
    {
        this.ssd1 = 256;
        this.ssd2 = 512;
        this.ssd3 = 1000;
        this.ssd4 = 2000;
        this.ssd5 = 4000;
    }
    //setters and getters for ssd1
    public void setSSD1 (int a)
    {
        this.ssd1 = a;
    }
    public int getSSD1 ()
    {
        return this.ssd1;
    }
    //setters and getters for ssd2
    public void setSSD2 (int b)
    {
        this.ssd2 = b;
    }
    public int getSSD2 ()
    {
        return this.ssd2;
    }
    //setters and getters for ssd3
    public void setSSD3 (int c)
    {
        this.ssd3 = c;
    }
    public int getSSD3 ()
    {
        return this.ssd3;
    }
    //setters and getters for ssd4
    public void setSSD4 (int d)
    {
        this.ssd4 = d;
    }
    public int getSSD4 ()
    {
        return this.ssd4;
    }
    //setters and getters for ssd5
    public void setSSD5 (int e)
    {
        this.ssd5 = e;
    }
    public int getSSD5 ()
    {
        return this.ssd5;
    }
    //toString
    public String toString ()
    {
        String a = this.ssd1 + "GB - $99.99";
        String b = this.ssd2 + "GB - $179.99";
        String c = this.ssd3 + "GB - $349.99";
        String d = this.ssd4 + "GB - $949.99";
        String e = this.ssd5 + "GB - $1494.99";
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}