public class CollectorPacket extends ChampionPacket{
    
    private int photoWallets;
    
    public CollectorPacket(){
        photoWallets = 8;
    }
    
    
    @Override
    public String getPacketName(){
        return "Champion Packet";
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                "\nWallets = " + photoWallets;
    }
}