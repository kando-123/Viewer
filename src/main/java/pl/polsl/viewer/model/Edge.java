package pl.polsl.viewer.model;

/**
 *
 * @author Kay Jay O'Nail
 */
class Edge
{
    private final Vertex end;
    private final int[] travelTimes;

    Edge(Vertex end, int[] travelTimes)
    {
        this.end = end;
        this.travelTimes = travelTimes;
    }

    Vertex getEnd()
    {
        return end;
    }

    int getTravelTime(int part)
    {
        return travelTimes[part];
    }
}
