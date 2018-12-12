

public class List
{
	private Node<String> firstNode;
	private Node<String> lastNode;
	private String name; // string like "list" used in printing
	
	
	public List()
	{
		this("list");
	} 
	
	
	public List( String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	} 

	public void insertAtFront( String insertItem )
	{
		Node<String> node = new Node<String>( insertItem );
		if ( isEmpty() ) // firstNode and lastNode refer to same object
		firstNode = lastNode = node;
		else { // firstNode refers to new node
			node.nextnode = firstNode;
			firstNode = node;
			//you can replace the two previous lines with this line: firstNode = new ListNode( insertItem, firstNode );
		}
	} 

	
	public void insertAtBack( String insertItem )
	{
		Node<String> node = new Node<String>( insertItem );
		if ( isEmpty() ) // firstNode and lastNode refer to same Object
		firstNode = lastNode = node;
		else { // lastNode's nextNode refers to new node
			lastNode.nextnode = node;
			lastNode = node;
			//you can replace the two previous lines with this line: lastNode = lastNode.nextNode = new ListNode( insertItem );
		}
	} 

	
	public Object removeFromFront() throws EmptyListException
	{
		if ( isEmpty() ) // throw exception if List is empty
		throw new EmptyListException( name );

		Object removedItem = firstNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if ( firstNode == lastNode )
		firstNode = lastNode = null;
		else
		firstNode = firstNode.nextnode;

		return removedItem; // return removed node data
	} 

	
	public Object removeFromBack() throws EmptyListException
	{
		if ( isEmpty() ) // throw exception if List is empty
		throw new EmptyListException( name );

		Object removedItem = lastNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if ( firstNode == lastNode )
		firstNode = lastNode = null;
		else // locate new last node
		{
			Node<String> current = firstNode;

			// loop while current node does not refer to lastNode
			while ( current.nextnode != lastNode )
			current = current.nextnode;

			lastNode = current; // current is new lastNode
			current.nextnode = null;
		} // end else

		return removedItem; // return removed node data
	} // end method removeFromBack

	
	public boolean isEmpty()
	{
		return firstNode == null; // return true if List is empty
	} // end method isEmpty

	
	public void print()
	{
		if ( isEmpty() )
		{
			System.out.printf( "Empty %s\n", name );
			return;
		} // end if

		System.out.printf( "The %s is: ", name );
		Node<String> current = firstNode;

		// while not at end of list, output current node's data
		while ( current != null )
		{
			System.out.printf( "%s ", current.data );
			current = current.nextnode;
		} // end while

		System.out.println( "\n" );
	} 
} 
