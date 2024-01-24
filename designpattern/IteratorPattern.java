package designpattern;

interface Iterator{
	boolean hasNext();
	Object next();
}

interface Container{
	Iterator getIterator();
	
}

class CollectionOfNames implements Container{

	public String  names[] = {"Raj", "Manas", "Riya", "Paras", "Meera", "Meena"};
	
	@Override
	public Iterator getIterator() {
		return new CollectionNamesIterator();
	}
	
	private class CollectionNamesIterator implements Iterator {
		int i;
		
		@Override
		public boolean hasNext() {
			if(i<names.length) 
			return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[i++];
			}
			return null;
		}
		
	}
	
}
//Gitanjali Aher..
public class IteratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionOfNames collectionOfNames = new CollectionOfNames();
		for (Iterator iterator = collectionOfNames.getIterator();iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}

	}

}
