public class GPU
{
    private String gpu1;
    private String gpu2;
    private String gpu3;
    private String gpu4;
    private String gpu5;
    
    public GPU () 
    {
        this.gpu1 = "GTX 1050 Ti";
        this.gpu2 = "GTX 1060";
        this.gpu3 = "GTX 1070";
        this.gpu4 = "GTX 1080";
        this.gpu5 = "GTX 1080 Ti";
    }
    //setters and getters for gpu1
    public void setGPU1 (String a)
    {
        this.gpu1 = a;
    }
    public String getGPU1 ()
    {
        return this.gpu1;
    }
    //setters and getters for gpu2
    public void setGPU2 (String b)
    {
        this.gpu2 = b;
    }
    public String getGPU2 ()
    {
        return this.gpu2;
    }
    //setters and getters for gpu3
    public void setGPU3 (String c)
    {
        this.gpu3 = c;
    }
    public String getGPU3 ()
    {
        return this.gpu3;
    }
    //setters and getters for gpu4
    public void setGPU4 (String d)
    {
        this.gpu4 = d;
    }
    public String getGPU4 ()
    {
        return this.gpu4;
    }
    //setters and getters for gpu4
    public void setGPU5 (String e)
    {
        this.gpu5 = e;
    }
    public String getGPU5 ()
    {
        return this.gpu5;
    }
    //toString
    public String toString ()
    {
        String a = this.gpu1 + " - $159.99";
        String b = this.gpu2 + " - $299.99";
        String c = this.gpu3 + " - $409.99";
        String d = this.gpu4 + " - $569.99";
        String e = this.gpu5 + " - $799.99";
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}