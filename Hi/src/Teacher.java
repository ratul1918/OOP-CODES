public class Teacher {
    String name,gender;
    int age;
    int number;

    public void Laliga(){
        System.out.println("Barca on top");
    }
    public void Addnum(int a, int b){
       int c=a+b;
        System.out.println("Additon: "+c);
    }
    public void Mulnum(int a, int b){
        int c=a*b;
        System.out.println("Multi: "+c);
    }
    public int x=10;
    public int y=20;
    public int z;

    public void insVariable(){
        this.z=this.x+this.y;
        System.out.println("Z: "+this.z);
    }



}
