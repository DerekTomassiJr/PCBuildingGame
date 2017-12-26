import java.util.Scanner;

public class PCRuntime
{
    private static double money;
    private static double total;
    
    private static PCBuild ourPC = new PCBuild ();
    private static CPU cpu = new CPU ();
    private static RAM ram = new RAM ();
    private static HHD hhd = new HHD ();
    private static SSD ssd = new SSD ();
    private static GPU gpu = new GPU ();
    
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        boolean winner = false;
        
        System.out.println("Here is your pc you objective is to build the best PC possible");
        
        while (winner == false) {
            System.out.println(ourPC);
            scan.nextLine();
            System.out.println("\f");
            
            System.out.println("Type store if you want to shop for some parts, type money to see how much cash you have, or type anything else to answer a question and earn some money.");
            String dec = scan.nextLine();
            
            if (dec.equalsIgnoreCase("Store")) {
                Store();
            } else if (dec.equalsIgnoreCase("Money")) {
                Money();
            } else {
                int random = (int)(Math.random()*4+1);
                if (random == 1) {
                    Add();
                } else if (random == 2) {
                    Sub();
                } else if (random == 3) {
                    Mult();
                } else if (random == 4) {
                    Div();
                } else {
                    System.out.println("Error");
                }
            }
        }
        WinnerCheck();
    }
    public static void Add ()
    {
        Scanner scan = new Scanner (System.in);    
        int random = (int)(Math.random()*50+1);
        int random1 = (int)(Math.random()*50+1);
        System.out.println("Answer this math question to get money to upgrade your pc");
        int answer = random + random1;
        System.out.println("What is " + random + " + " + random1 + " =");
        int user = scan.nextInt();
        if (user == answer) {
            money += 100.00;
            System.out.println("Congrats you have earned $100.00");
            total += money;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Your current balance is $" + money);
    }
    public static void Sub ()
    {
        Scanner scan = new Scanner (System.in);
        int random = (int)(Math.random()*200-100);
        int random1 = (int)(Math.random()*200-100);
        System.out.println("Answer this math question to get money to upgrade your pc");
        int answer = random - random1;
        System.out.println("What is " + random + " - " + random1 + " =");
        int user = scan.nextInt();
        if (user == answer) {
            money += 200.00;
            System.out.println("Congrats you have earned $200.00");
            total += money;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Your current balance is $" + money);
    }
    public static void Mult ()
    {
        Scanner scan = new Scanner (System.in);
        int random = (int)(Math.random()*15+1);
        int random1 = (int)(Math.random()*15+1);
        System.out.println("Answer this math question to get money to upgrade your pc");
        int answer = random * random1;
        System.out.println("What is " + random + " * " + random1 + " =");
        int user = scan.nextInt();
        if (user == answer) {
            money += 500.00;
            System.out.println("Congrats you have earned $500.00");
            total += money;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Your current balance is $" + money);
    }
    public static void Div ()
    {
        Scanner scan = new Scanner (System.in);
        int random = (int)(Math.random()*200+1);
        int random1 = (int)(Math.random()*200+1);
        System.out.println("Answer this math question to get money to upgrade your pc (for division round your answer down to a whole number)");
        int answer = random / random1;
        System.out.println("What is " + random + " / " + random1 + " =");
        int user = scan.nextInt();
        if (user == answer) {
            money += 250.00;
            System.out.println("Congrats you have earned $250.00");
            total += money;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Your current balance is $" + money);
    }
    public static void Store ()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("\f");
        System.out.println("Welcome to the store what parts do you want to look at?");
        String dcs = scan.nextLine();
        
        if (dcs.equalsIgnoreCase("CPU")) {
            System.out.println(cpu);
            System.out.println("Which CPU would you like to buy select which one by entering 1, 2, 3, 4, or 5");
            int cpuDCS = scan.nextInt();
            CPUStore(cpuDCS);
        } else if (dcs.equalsIgnoreCase("RAM")) {
            System.out.println(ram);
            System.out.println("What amount of RAM would you like to buy select which one by entering 1, 2, 3, 4, or 5");
            int ramDCS = scan.nextInt();
            RAMStore(ramDCS);
        } else if (dcs.equalsIgnoreCase("HHD")) {
            System.out.println(hhd);
            System.out.println("What amount of storage for a mechanical drive would you like to buy select which one by entering 1, 2, 3, 4, or 5");
            int hhdDCS = scan.nextInt();
            HHDStore(hhdDCS);
        } else if (dcs.equalsIgnoreCase("SSD")) {
            System.out.println(ssd);
            System.out.println("What amount of storage for a solid state drive would you like to buy select which one by entering 1, 2, 3, 4, or 5");
            int ssdDCS = scan.nextInt();
            SSDStore(ssdDCS);
        } else if (dcs.equalsIgnoreCase("GPU")) {
            System.out.println(gpu);
            System.out.println("Which GPU would you like to buy select which one by entering 1, 2, 3, 4, or 5");
            int gpuDCS = scan.nextInt();
            GPUStore(gpuDCS);
        } else {
            System.out.println("Error");
        }
    }
    public static void Money ()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("\f");
        System.out.println("$" + money);
        scan.nextLine();
    }
    public static void CPUStore (int cpu) 
    {
        if (cpu < 1) {
            cpu = 1;
        } else if (cpu > 5) {
            cpu = 5;
        }
        
        if (cpu == 1) {
            if (money >= 116.99) {
                System.out.println("Congrats on your purchase");
                money -= 116.99;
                ourPC.setCPU(PCRuntime.cpu.getCPU1());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (cpu == 2) {
            if (money >= 241.99) {
                System.out.println("Congrats on your purchase");
                money -= 241.99;
                ourPC.setCPU(PCRuntime.cpu.getCPU2());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (cpu == 3) {
            if (money >= 349.99) {
                System.out.println("Congarts on your purchase");
                money -= 349.99;
                ourPC.setCPU(PCRuntime.cpu.getCPU3());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (cpu == 4) {
            if (money >= 139.99) {
                System.out.println("Congrats on your purchase");
                money -= 139.99;
                ourPC.setCPU(PCRuntime.cpu.getCPU4());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (cpu == 5) {
            if (money >= 249.99) {
                System.out.println("Congrats on your purchase");
                money -= 249.99;
                ourPC.setCPU(PCRuntime.cpu.getCPU5());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        }
    }
    public static void RAMStore (int ram)
    {
        if (ram < 1) {
            ram = 1;
        } else if (ram > 5) {
            ram = 5;
        }
        
        if (ram == 1) {
            if (money >= 47.99) {
                System.out.println("Congrats on your purchase");
                money -= 47.99;
                ourPC.setRAM(PCRuntime.ram.getRAM1());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ram == 2) {
            if (money >= 107.99) {
                System.out.println("Congrats on your purchase");
                money -= 107.99;
                ourPC.setRAM(PCRuntime.ram.getRAM2());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ram == 3) {
            if (money >= 199.99) {
                System.out.println("Congrats on your purchase");
                money -= 199.99;
                ourPC.setRAM(PCRuntime.ram.getRAM3());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ram == 4) {
            if (money >= 379.99) {
                System.out.println("Congrats on your purchase");
                money -= 379.99;
                ourPC.setRAM(PCRuntime.ram.getRAM4());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ram == 5) {
            if (money >= 739.99) {
                System.out.println("Congrats on your purchasw");
                money -= 739.99;
                ourPC.setRAM(PCRuntime.ram.getRAM5());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        }
    }
    public static void HHDStore (int hhd) 
    {
        if (hhd < 1) {
            hhd = 1;
        } else if (hhd > 5) {
            hhd = 5;
        }
        
        if (hhd == 1) {
            if (money >= 26.99) {
                System.out.println("Congrats on your purchase");
                money -= 26.99;
                ourPC.setStorageSize(PCRuntime.hhd.getHHD1());
            } else {
                System.out.println("You don't have enough money to purchase this item");
            }
        } else if (hhd == 2) {
            if (money >= 54.99) {
                System.out.println("Congrats on your purchase");
                money -= 54.99;
                ourPC.setStorageSize(PCRuntime.hhd.getHHD2());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (hhd == 3) {
            if (money >= 69.99) {
                System.out.println("Congrats on your purchase");
                money -= 69.99;
                ourPC.setStorageSize(PCRuntime.hhd.getHHD3());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (hhd == 4) {
            if (money >= 119.99) {
                System.out.println("Congrats on your purchase");
                money -= 119.99;
                ourPC.setStorageSize(PCRuntime.hhd.getHHD4());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (hhd == 5) {
            if (money >= 169.99) {
                System.out.println("Congrats on your purchase");
                money -= 169.99;
                ourPC.setStorageSize(PCRuntime.hhd.getHHD5());
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        }
    }
    public static void SSDStore (int ssd)
    {
        if (ssd < 1) {
            ssd = 1;
        } else if (ssd > 5) {
            ssd = 5;
        }
        
        if (ssd == 1) {
            if (money >= 99.99) {
                System.out.println("Congrats on your purchase");
                money -= 99.99;
                ourPC.setStorageSize(PCRuntime.ssd.getSSD1());
                ourPC.setIsStorageSSD(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ssd == 2) {
            if (money >= 179.99) {
                System.out.println("Congrats on your purchase");
                money -= 179.99;
                ourPC.setStorageSize(PCRuntime.ssd.getSSD2());
                ourPC.setIsStorageSSD(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ssd == 3) {
            if (money >= 349.99) {
                System.out.println("Congrats on your purchase");
                money -= 349.99;
                ourPC.setStorageSize(PCRuntime.ssd.getSSD3());
                ourPC.setIsStorageSSD(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ssd == 4) {
            if (money >= 949.99) {
                System.out.println("Congrats on your purchase");
                money -= 949.99;
                ourPC.setStorageSize(PCRuntime.ssd.getSSD4());
                ourPC.setIsStorageSSD(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (ssd == 5) {
            if (money >= 1494.99) {
                System.out.println("Congrats on your purchase");
                money -= 1494.99;
                ourPC.setStorageSize(PCRuntime.ssd.getSSD5());
                ourPC.setIsStorageSSD(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        }
    }
    public static void GPUStore (int gpu)
    {
        if (gpu < 1) {
            gpu = 1; 
        } else if (gpu > 5) {
            gpu = 5;
        }
        
        if (gpu == 1) {
            if (money >= 159.99) {
                System.out.println("Congrats on your purchase");
                money -= 159.99;
                ourPC.setGPU(PCRuntime.gpu.getGPU1());
                ourPC.setHasGPU(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (gpu == 2) {
            if (money >= 299.99) {
                System.out.println("Congrats on your purchase");
                money -= 299.99;
                ourPC.setGPU(PCRuntime.gpu.getGPU2());
                ourPC.setHasGPU(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (gpu == 3) {
            if (money >= 409.99) {
                System.out.println("Congrats on your purchase");
                money -= 409.99;
                ourPC.setGPU(PCRuntime.gpu.getGPU3());
                ourPC.setHasGPU(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (gpu == 4) {
            if (money >= 569.99) {
                System.out.println("Congrats on your purchase");
                money -= 569.99;
                ourPC.setGPU(PCRuntime.gpu.getGPU4());
                ourPC.setHasGPU(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        } else if (gpu == 5) {
            if (money >= 799.99) {
                System.out.println("Congrats on your purchase");
                money -= 799.99;
                ourPC.setGPU(PCRuntime.gpu.getGPU5());
                ourPC.setHasGPU(true);
            } else {
                System.out.println("You don't have enough money for this purchase");
            }
        }
    }
    public static void WinnerCheck()
    {
        boolean winnerCPU = false;
        boolean winnerRAM = false;
        boolean winnerSSD = false;
        boolean winnerGPU = false;
        
        if (ourPC.getCPU().equalsIgnoreCase(PCRuntime.cpu.getCPU3())) {
            winnerCPU = true;
        }
        if (ourPC.getRAM() == PCRuntime.ram.getRAM5()) {
            winnerRAM = true;
        }
        if (ourPC.getStorageSize() == PCRuntime.ssd.getSSD5() && ourPC.getIsStorageSSD() == true) {
            winnerSSD = true;
        }
        if (ourPC.getGPU().equalsIgnoreCase(PCRuntime.gpu.getGPU5())) {
            winnerGPU = true;
        }
        
        if (winnerCPU == true && winnerRAM == true && winnerSSD == true && winnerGPU == true) {
            Winner();
        }
    }
    public static void Winner ()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("\f");
        System.out.println(ourPC);
        System.out.println();
        System.out.println("You have won the game by creating the best computer possible");
        System.out.println("The total amount of money you made is $" + total);
        System.out.println("Thank You for playing my game");
        System.out.println("Press enter to exit");
        scan.nextLine();
        System.exit(0);
    }
}