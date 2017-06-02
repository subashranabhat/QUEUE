
public class Subclass {
	private int front;
	private int rear;
	private int[] object;
	private int queueSize;
	
	
	public Subclass(){
		queueSize = 3;
		object = new int[queueSize];
		front = -1;
		rear = -1;
	}
	
	
	public void push(int n){
		
		
			if(this.isEmpty()){
			front = front +1;  // 0th index
			rear = rear + 1;
			object[front] = n;
				
				
			}
			else{
				if(rear < queueSize-1){  // because queue size gives the length of the array
					
					object[rear + 1] = n;
					rear++; 
					
				}
				else{
					System.out.println("stack overflow");
				}
			
			}
		
	}
	
	
	public int pop(){
		
		int temp = 0;
		
		if(!this.isEmpty()){
			temp = object[front];
			front++;
			rear--;
		}
		
		return temp;
		
	}
	
	public boolean isEmpty(){
		if( rear  == -1)
		{
			return true;
		}
		return false;
	}
	
	
	public int peek(){
		
		if(!this.isEmpty()){
			return object[front];
		}
		return -1; // incase if empty
	}

}
