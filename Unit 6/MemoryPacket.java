public class MemoryPacket extends StarterPacket {
    private int photo5x7;
    private int photoWallets;
    
    public MemoryPacket(){
        photo5x7 = 2;
        photoWallets = 8;
    }
    
    
    @Override
    public String getPacketName() {
        return "Memory Packet";
    }
    
    
    @Override
    public String toString(){
        return super.toString() +
                "\n5 x 7 =  " + photo5x7 + 
                "\nWallets = " + photoWallets;
    }
}