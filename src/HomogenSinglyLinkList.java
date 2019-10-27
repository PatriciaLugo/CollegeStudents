public class HomogenSinglyLinkList
{
    private ListingNode head;
    public HomogenSinglyLinkList()
    {
        head = null;
    }
    public boolean insert(Listing listing)
    {
        if(fetch(listing.getName())!=null)
            return false;
        ListingNode listingNode = new ListingNode(listing);
        if (head == null)
        {
            head = listingNode;
        }
        else
        {
            ListingNode temp = head;
            while(temp.getNext()!= null)
            {
                temp = temp.getNext();
            }
            temp.setNext(listingNode);
        }
        return true;
    }
    public Listing fetch(String name)
    {
        ListingNode temp = head;
        while(temp!= null)
        {
            if(temp.getListing().getName().equalsIgnoreCase(name))
            {
                return temp.getListing();
            }
            temp = temp.getNext();
        }
        return null;

    }
    public boolean delete (String name)
    {
        ListingNode temp = head;
        boolean found = false;
        if(head!= null)
        {
            if(head.getListing().getName().equalsIgnoreCase(name))
            {
                head = head.getNext();
                found = true;
            }
            else
            {
                while(temp.getNext()!=null)
                {
                    if(temp.getNext().getListing().getName().equalsIgnoreCase(name))
                    {
                        found= true;
                        temp.setNext(temp.getNext().getNext());
                        break;
                    }
                    temp=temp.getNext();
                }
            }
        }
        return found;
    }
    public boolean update(String name,Listing listing)
    {
        if(!delete(name))
            return false;
        if(!insert(listing))
            return false;
        return true;
    }
    public void printAll()
    {
        ListingNode temp = head;
        while(temp != null)
        {
            System.out.println(temp.getListing().toString());
            temp = temp.getNext();
        }
    }
    public int size()
    {
        int count = 0;
        ListingNode current = head;
        while(current!= null)
        {
            count++;
            current = current.getNext();
        }
        return count;
    }

}
