package assignment2;

import java.util.Iterator;

import assignment2.DLL;

public class Deque<Item> implements Iterable<Item> {
	DLL<Item> dll;
	
	public Deque(){
		dll = new DLL<Item>(); 
	}
	
	public boolean isEmpty(){
		if (dll.count == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public int size(){
		return dll.count;
	}
	
	public void addFirst(Item item){
		dll.push(item);
	}
    
	public void addLast(Item item){
		dll.append(item);
	}
	
	public Item removeFirst(){
		
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public Iterator<Item> iterator() {
		
		return null;
	}

}
