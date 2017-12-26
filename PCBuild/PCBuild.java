public class PCBuild
{
    private String cpu;
    private int ram;
    private int storageSize;
    private boolean isStorageSSD;
    private boolean hasGPU;
    private String gpu;
    
    public PCBuild ()
    {
        this.cpu = "pentium";
        this.ram = 1;
        this.storageSize = 128;
        this.isStorageSSD = false;
        this.hasGPU = false;
        this.gpu = "Onboard";
    }
    public void setCPU (String c)
    {
        this.cpu = c;
    }
    public String getCPU ()
    {
        return this.cpu;
    }
    public void setRAM (int r)
    {
        this.ram = r;
    }
    public int getRAM ()
    {
        return this.ram;
    }
    public void setStorageSize (int s)
    {
        this.storageSize = s;
    }
    public int getStorageSize ()
    {
        return this.storageSize;
    }
    public void setIsStorageSSD (boolean i)
    {
        this.isStorageSSD = i;
    }
    public boolean getIsStorageSSD ()
    {
        return this.isStorageSSD;
    }
    public void setHasGPU (boolean h)
    {
        this.hasGPU = h;
    }
    public boolean getHasGPU ()
    {
        return this.hasGPU;
    }
    public void setGPU (String g)
    {
        this.gpu = g;
    }
    public String getGPU ()
    {
        return this.gpu;
    }
    public String toString ()
    {
        String a = "CPU: " + this.getCPU();
        String b = "RAM: " + this.getRAM() + " GB";
        String c = "Storage Size: " + this.getStorageSize() + " GB";
        String d = "Is The Storage a SSD: " + this.getIsStorageSSD();
        String e = "Does The Computer Have a Graphics Card: " + this.getHasGPU();
        String f = "Graphics: " + this.getGPU();
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f;
     }
}