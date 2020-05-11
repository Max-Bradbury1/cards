public class Rank
{
    private String name;
    private int value;

    public Rank (String rankName, int rankValue)
    {
        name=rankName;
        value = rankValue;
    }

    public String toString()
    {
        return name;
    }

    public int getValue()
    {
        return value;
    }

    /**
     * Checks if this rank is equal to another object. It is considered equal if the object passed in is a Rank and it has the same name.
     * @param obj The object to compare this rank to
     * @return True if the rank names are the same.
     */
    public boolean equals(Object obj)
    {
        //is it an instance of Rank
        if (obj instanceof Rank)
        {
            //yes, so explicitly cast the object to a Rank
            Rank otherRank = (Rank)obj;
            //Now compare the names. Note, we can directly access the name variable because it is in Rank and this is the Rank class.
            return this.name.equals(otherRank.name);
        }
        return false;
    }
}
