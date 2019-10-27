public class ListingNode {
    private Listing listing;
    private ListingNode next;
    public ListingNode(Listing listing){
        this.listing = listing;
    }
    public Listing getListing()
    {
        return listing;
    }
    public void setListing(Listing listing)
    {
        this.listing = listing;
    }
    public ListingNode getNext()
    {
        return next;
    }
    public void setNext(ListingNode next)
    {
        this.next = next;
    }

}
