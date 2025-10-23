package pl.polsl.viewer.model;

/**
 *
 * @author Kay Jay O'Nail
 */
public class Vertex
{
    private final int index;
    private final double xCoord;
    private final double yCoord;
    private final double demand;
    private final int serviceTime;

    public Vertex(int index, double xCoord, double yCoord, double demand, int serviceTime)
    {
        this.index = index;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.demand = demand;
        this.serviceTime = serviceTime;
    }
    
    public int getIndex()
    {
        return index;
    }
    
    public double getX()
    {
        return xCoord;
    }
    
    public double getY()
    {
        return yCoord;
    }
    
    public double getDemand()
    {
        return demand;
    }
    
    public int getServiceTime()
    {
        return serviceTime;
    }
}
