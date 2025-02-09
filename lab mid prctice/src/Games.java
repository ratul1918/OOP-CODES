public class Games {
    String name;
    int year;
    float size;

    Games(){

    }

    Games(String name,int year ,float size){
        this.name=name;
        this.year=year;
        this.size=size;
    }
    public void displayGamesInfo(){
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
        System.out.println("Size: "+size);
    }
}
