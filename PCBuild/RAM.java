public class RAM
{
    private int ram1;
    private int ram2;
    private int ram3;
    private int ram4;
    private int ram5;
    
    public RAM ()
    {
        this.ram1 = 4;
        this.ram2 = 8;
        this.ram3 = 16;
        this.ram4 = 32;
        this.ram5 = 64;
    }
    //setters and getters for ram1
    public void setRAM1 (int a)
    {
        this.ram1 = a;
    }
    public int getRAM1 ()
    {
        return this.ram1;
    }
    //setters and getters for ram2
    public void setRAM2 (int b)
    {
        this.ram2 = b;
    }
    public int getRAM2 ()
    {
        return this.ram2;
    }
    //setters and getters for ram3
    public void setRAM3 (int c)
    {
        this.ram3 = c;
    }
    public int getRAM3 ()
    {
        return this.ram3;
    }
    //setters and getters for ram4
    public void setRAM4 (int d)
    {
        this.ram4 = d;
    }
    public int getRAM4 ()
    {
        return this.ram4;
    }
    //setters and getter for ram5
    public void setRAM5 (int e)
    {
        this.ram5 = e;
    }
    public int getRAM5 ()
    {
        return this.ram5;
    }
    //toString
    public String toString ()
    {
        String a = this.ram1 + "GB - $47.99";
        String b = this.ram2 + "GB - $107.99";
        String c = this.ram3 + "GB - $199.99";
        String d = this.ram4 + "GB - $379.99";
        String e = this.ram5 + "GB - $739.99";
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}