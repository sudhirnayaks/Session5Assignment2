package myPack;

public class StackMain {

	public static void main(String args[ ])
    {
            FixedStack fs=new FixedStack(3);
            VariableStack vs=new VariableStack(5);
            Stack mystk;
            for(int i=0;i<3;i++)
                    fs.push(i);
            System.out.println("Fixed length Stack Contents are.");
            for(int i=0;i<3;i++)
                    System.out.println(fs.pop());
            for(int i=0;i<7;i++)
                    vs.push(i);
            System.out.println("Dynamic length Stack Contents are");
            for(int i=0;i<7;i++)
                    System.out.println(vs.pop());
            mystk=fs;
            for(int i=0;i<3;i++)
                    mystk.push(i);
            System.out.println("Fixed length Stack Contents using interface reference");
            for(int i=0;i<3;i++)
                    System.out.println(mystk.pop());
            mystk= vs;
            for(int i=0;i<7;i++)
                    mystk.push(i);
            System.out.println("Dynamic length Stack Contents using interface reference");
            for(int i=0;i<7;i++)
                    System.out.println(mystk.pop());
    }

}
