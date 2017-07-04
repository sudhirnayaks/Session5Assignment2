package myPack;

public class FixedStack implements Stack {
	private int stack[];
	private int tos;
	
	FixedStack(int size){
		stack = new int[size];
		tos = -1;		
	}

	@Override
	public void push(int item) {
		if(tos == stack.length -1){
			System.out.println("Stack Overflows");
            int t[ ]=new int[stack.length * 2];
            for(int i=0;i<stack.length;i++)
                    t[i]=stack[i];
            stack=t;
            stack[++tos]=item;
		}
		else
            stack[++tos]=item;
	}
	
	

	@Override
	public int pop() {
		if(tos<0)
        {
                System.out.println("Stack Underflows");
                return 0;
        }
        else
                return stack[tos--];
}


}
