public class CPU
{
    private String cpu1;
    private String cpu2;
    private String cpu3;
    private String cpu4;
    private String cpu5;
    
    public CPU ()
    {
        this.cpu1 = "i3-7100 Dual Core 3.90 GHz";
        this.cpu2 = "i5-6600k Quad Core 3.50 GHz";
        this.cpu3 = "i7-7700k Quad Core 4.5 GHz";
        this.cpu4 = "AMD FX-8320 Octa Core 3.5 GHz";
        this.cpu5 = "AMD Ryzen 5 Hexa Core 3.6 GHz";
    }
    //setters and getters for CPU1
    public void setCPU1 (String a)
    {
        this.cpu1 = a;
    }
    public String getCPU1 ()
    {
        return this.cpu1;
    }
    //setters and getters for CPU2
    public void setCPU2 (String b)
    {
        this.cpu2 = b;
    }
    public String getCPU2 ()
    {
        return this.cpu2;
    }
    //setters and getter for CPU3
    public void setCPU3 (String c)
    {
        this.cpu3 = c;
    }
    public String getCPU3 ()
    {
        return this.cpu3;
    }
    //setters and getters for CPU4
    public void setCPU4 (String d)
    {
        this.cpu4 = d;
    }
    public String getCPU4 ()
    {
        return this.cpu4;
    }
    //setters and getters for CPU5
    public void setCPU5 (String e)
    {
        this.cpu5 = e;
    }
    public String getCPU5 ()
    {
        return this.cpu5;
    }
    //to string
    public String toString ()
    {
        String a = this.cpu1 + " - $116.99";
        String b = this.cpu2 + " - $241.99";
        String c = this.cpu3 + " - $349.99";
        String d = this.cpu4 + " - $139.99";
        String e = this.cpu5 + " - $249.99";
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}